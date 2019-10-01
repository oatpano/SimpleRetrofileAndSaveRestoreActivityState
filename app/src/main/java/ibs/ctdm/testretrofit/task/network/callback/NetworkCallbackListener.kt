package ibs.ctdm.testretrofit.task.network.callback

import ibs.ctdm.testretrofit.task.network.model.User
import okhttp3.ResponseBody

/**
 * Created by vanirut on 14-Jan-16.
 */
interface NetworkCallbackListener {
    fun onResponse(user: User)

    fun onBodyError(responseBodyError: ResponseBody)

    fun onBodyErrorIsNull()

    fun onFailure(t: Throwable)
}
