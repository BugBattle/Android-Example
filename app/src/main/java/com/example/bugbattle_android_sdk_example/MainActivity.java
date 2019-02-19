package com.example.bugbattle_android_sdk_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import bugbattle.io.bugbattle.BugBattle;
import bugbattle.io.bugbattle.BugBattleActivationMethod;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BugBattle.initialise(getApplication(), "5c41fcd794aaf5331dd4d513", BugBattleActivationMethod.SHAKE);
    }
}
