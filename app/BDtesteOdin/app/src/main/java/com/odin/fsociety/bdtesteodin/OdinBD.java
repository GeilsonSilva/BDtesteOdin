package com.odin.fsociety.bdtesteodin;

import com.firebase.client.Firebase;

/**
 * Created by STI on 26/11/2016.
 */

public class OdinBD extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);

    }
}



















