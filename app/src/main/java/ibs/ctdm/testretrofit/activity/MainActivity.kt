package ibs.ctdm.testretrofit.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

import org.parceler.Parcels

import java.io.IOException

import ibs.ctdm.testretrofit.R
import ibs.ctdm.testretrofit.task.network.NetworkConnectionManager
import ibs.ctdm.testretrofit.task.network.callback.NetworkCallbackListener
import ibs.ctdm.testretrofit.task.network.logger.LoggerFactory
import ibs.ctdm.testretrofit.task.network.model.User
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.ResponseBody

class MainActivity : AppCompatActivity() {

    //Dao
    private var user: User? = null

    private var networkCallbackListener: NetworkCallbackListener = object: NetworkCallbackListener {
        override fun onResponse(user: User) {
            //200
            if (user != null) {
                setUserData(user)
                showData()
            }
        }

        override fun onBodyError(responseBodyError: ResponseBody) {
            //404 (error not null)
            showData()
            try {
                setDataToView("responseBody = " + responseBodyError.string())
                showData()
            } catch (e: IOException) {
                e.printStackTrace()
            }

        }

        override fun onBodyErrorIsNull() {
            //404 (error is null)
            setDataToView("responseBody = null")
            showData()

        }

        override fun onFailure(t: Throwable) {
            //fail any course
            setDataToView("Throw = " + t.message)
            showData()

        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initListener()

        if (savedInstanceState == null) {
            // first running
            showForm()
        } else {
            // running again(such as: configuration change)
            setUserData(user)
            showData()
        }
    }

    private fun callServer() {
        showLoading()
        NetworkConnectionManager().callServer(networkCallbackListener, edUsername.text.toString())
    }

    private fun setUserData(user: User?) {
        if (user != null) {
            this.user = user
            LoggerFactory.getWftLog(TAG, "user: $user")
            LoggerFactory.getWftLog(TAG, "user.getName(): ${user.name}")
            LoggerFactory.getWftLog(TAG, "user.getWebsite(): ${user.website}")
            LoggerFactory.getWftLog(TAG, "user.getCompany(): ${user.company}")

            val data = "Github Name :" + user.name +
                    "\nWebsite :" + user.website +
                    "\nCompany Name :" + user.company

            setDataToView(data)
        }
    }

    private fun setDataToView(data: String) {
        tvResult.text = data
    }

    private fun showData() {
        layoutForm.visibility = View.GONE
        layoutResult.visibility = View.VISIBLE
        layoutProgress.visibility = View.GONE
    }

    private fun showForm() {
        layoutForm.visibility = View.VISIBLE
        layoutResult.visibility = View.GONE
        layoutProgress.visibility = View.GONE
    }

    private fun showLoading() {
        layoutForm.visibility = View.GONE
        layoutResult.visibility = View.GONE
        layoutProgress.visibility = View.VISIBLE
    }

    private fun initListener() {
        btOk.setOnClickListener { callServer() }
        btClose.setOnClickListener{ showForm() }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(KEY_USER, Parcels.wrap(user))
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        user = Parcels.unwrap(savedInstanceState.getParcelable(KEY_USER))
    }

    companion object {
        private val TAG = MainActivity::class.java.getSimpleName()
        val KEY_USER = "KEY_USER"
    }
}
