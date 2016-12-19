package john.com.litepaldemo.application;

import android.app.Application;

import com.orhanobut.logger.Logger;

import org.litepal.LitePal;


/**
 * Created by tangdekun on 2016/12/19.
 */

public class MyApplication extends Application {
    private static final String TAG = "MyApplication";

    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(this);
        Logger.init(TAG);
    }
}
