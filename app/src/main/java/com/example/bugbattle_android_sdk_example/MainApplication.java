package com.example.bugbattle_android_sdk_example;

import android.app.Application;

import bugbattle.io.bugbattle.BugBattle;
import bugbattle.io.bugbattle.controller.BugBattleActivationMethod;

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        BugBattle.initialise("U1FeTUrxnzbtB8ebJj2unNweR6pzgIWg", BugBattleActivationMethod.SHAKE, this);
      //  BugBattle.enableReplay();
      //  BugBattle.setLanguage("en");
    }
}
