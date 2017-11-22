package ibs.ctdm.testretrofit.task.network;

import ibs.ctdm.testretrofit.task.network.api.GitHubService;
import ibs.ctdm.testretrofit.task.network.callback.NetworkCallbackListener;
import ibs.ctdm.testretrofit.task.network.model.User;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by vanirut on 14-Jan-16.
 */
public class NetworkConnectionManager {

    public NetworkConnectionManager() {
    }

    public void callServer(final NetworkCallbackListener listener, String username) {
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.URL_SERVER)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        GitHubService git = retrofit.create(GitHubService.class);
        Call<User> call = git.getUser(username);
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                User user = response.body();
                if (user == null) {
                    //404 or the response cannot be converted to User.
                    ResponseBody responseBody = response.errorBody();
                    if (responseBody != null) {
                        listener.onBodyError(responseBody);
                    } else {
                        listener.onBodyErrorIsNull();
                    }
                } else {
                    //200
                    listener.onResponse(user);
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                listener.onFailure(t);
            }
        });
    }
}
