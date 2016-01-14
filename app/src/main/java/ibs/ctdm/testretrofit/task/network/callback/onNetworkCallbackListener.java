package ibs.ctdm.testretrofit.task.network.callback;

import com.squareup.okhttp.ResponseBody;

import ibs.ctdm.testretrofit.task.network.model.User;
import retrofit.Retrofit;

/**
 * Created by vanirut on 14-Jan-16.
 */
public interface onNetworkCallbackListener {
    public void onResponse(User user, Retrofit retrofit);
    public void onBodyError(ResponseBody responseBodyError);
    public void onBodyErrorIsNull();
    public void onFailure(Throwable t);
}
