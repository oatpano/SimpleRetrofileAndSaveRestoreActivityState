package ibs.ctdm.testretrofit.task.network.api

import ibs.ctdm.testretrofit.task.network.model.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by vanirut on 14-Jan-16.
 */
interface GitHubService {
    @GET("/users/{username}")
    fun getUser(@Path("username") username: String): Call<User>
}
