package ibs.ctdm.testretrofit.task.network.api;

import ibs.ctdm.testretrofit.task.network.model.User;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by vanirut on 14-Jan-16.
 */
public interface GitHubService {
    @GET("/users/{username}")
    Call<User> getUser(@Path("username") String username);
}
