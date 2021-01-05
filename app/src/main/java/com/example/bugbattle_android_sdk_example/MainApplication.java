package com.example.bugbattle_android_sdk_example;

import android.app.Application;

import org.json.JSONObject;

import bugbattle.io.bugbattle.BugBattle;
import bugbattle.io.bugbattle.controller.BugBattleActivationMethod;

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        BugBattle.initialise("YOUR API KEY", BugBattleActivationMethod.SHAKE, this);
    }
}
