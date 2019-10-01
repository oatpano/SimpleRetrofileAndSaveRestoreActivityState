package ibs.ctdm.testretrofit.task.network

import ibs.ctdm.testretrofit.task.network.api.GitHubService
import ibs.ctdm.testretrofit.task.network.callback.NetworkCallbackListener
import ibs.ctdm.testretrofit.task.network.model.User
import okhttp3.OkHttpClient
import okhttp3.ResponseBody
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by vanirut on 14-Jan-16.
 */
class NetworkConnectionManager {

    fun callServer(listener: NetworkCallbackListener, username: String) {
        val client = OkHttpClient.Builder()
                .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .build()
        val retrofit = Retrofit.Builder()
                .baseUrl(Constants.URL_SERVER)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        val git = retrofit.create<GitHubService>(GitHubService::class.java)
        val call = git.getUser(username)
        call.enqueue(object : Callback<User> {
            override fun onResponse(call: Call<User>, response: Response<User>) {
                val user = response.body()
                if (user == null) {
                    //404 or the response cannot be converted to User.
                    val responseBody = response.errorBody()
                    if (responseBody != null) {
                        listener.onBodyError(responseBody)
                    } else {
                        listener.onBodyErrorIsNull()
                    }
                } else {
                    //200
                    listener.onResponse(user)
                }
            }

            override fun onFailure(call: Call<User>, t: Throwable) {
                listener.onFailure(t)
            }
        })
    }
}
