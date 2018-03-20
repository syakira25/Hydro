package com.example.naa.hydro;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by User on 15/3/2018.
 */

public class Hydro extends Application {

    @Override
    public void onCreate(){
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}
