package com.example.bugbattle_android_sdk_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.json.JSONException;
import org.json.JSONObject;

import bugbattle.io.bugbattle.BugBattle;
import bugbattle.io.bugbattle.controller.BugBattleActivationMethod;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BugBattle.initialise("QnkqZSRRqGLjquRKwnQh9fK86mBO3Xay", BugBattleActivationMethod.SHAKE, this);
        try{
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("key", "value");
            BugBattle.attachCustomData(jsonObject);
        }catch (Exception e) {

        }

    }
}
