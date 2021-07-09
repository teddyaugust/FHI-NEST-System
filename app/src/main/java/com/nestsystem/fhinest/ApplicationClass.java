package com.nestsystem.fhinest;

import android.app.Application;

import com.onesignal.OneSignal;

public class ApplicationClass extends Application {

    private static final String ONESIGNAL_APP_ID = "95031289-048e-41c0-bc09-fe19e06d9203";

    @Override
    public void onCreate() {
        super.onCreate();
        // TODO: Add OneSignal initialization here

        // Enable verbose OneSignal logging to debug issues if needed.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);
    }
}
