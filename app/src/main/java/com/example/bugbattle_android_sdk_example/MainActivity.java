package com.example.bugbattle_android_sdk_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import bugbattle.io.bugbattle.BugBattle;
import bugbattle.io.bugbattle.controller.BugBattleActivationMethod;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BugBattle.initialise("5d5e99fe45c384a4dd1543c3", BugBattleActivationMethod.SHAKE, getApplication());
    }
}
