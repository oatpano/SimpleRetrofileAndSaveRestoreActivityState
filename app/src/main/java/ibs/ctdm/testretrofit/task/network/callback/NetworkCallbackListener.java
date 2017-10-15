package ibs.ctdm.testretrofit.task.network.callback;

import ibs.ctdm.testretrofit.task.network.model.User;
import okhttp3.ResponseBody;

/**
 * Created by vanirut on 14-Jan-16.
 */
public interface NetworkCallbackListener {
    void onResponse(User user);

    void onBodyError(ResponseBody responseBodyError);

    void onBodyErrorIsNull();

    void onFailure(Throwable t);
}
