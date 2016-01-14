package ibs.ctdm.testretrofit.task.network;

import com.squareup.okhttp.ResponseBody;

import ibs.ctdm.testretrofit.task.network.api.GitHubService;
import ibs.ctdm.testretrofit.task.network.callback.onNetworkCallbackListener;
import ibs.ctdm.testretrofit.task.network.model.User;
import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * Created by vanirut on 14-Jan-16.
 */
public class NetworkConnectionManager {

    public NetworkConnectionManager() {

    }

    public void callServer(final onNetworkCallbackListener listener, String username){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.URL_SERVER)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GitHubService git = retrofit.create(GitHubService.class);
        Call call = git.getUser(username);
        call.enqueue(new Callback<User>() {

            @Override
            public void onResponse(Response<User> response, Retrofit retrofit) {
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
                    listener.onResponse(user, retrofit);
                }

            }

            @Override
            public void onFailure(Throwable t) {
                listener.onFailure(t);
            }
        });

    }
}