package com.example.bugbattle_android_sdk_example;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import org.json.JSONException;
import org.json.JSONObject;

import bugbattle.io.bugbattle.BugBattle;
import bugbattle.io.bugbattle.controller.BugBattleActivationMethod;
import bugbattle.io.bugbattle.controller.BugBattleNotInitialisedException;
import bugbattle.io.bugbattle.service.ImageMerger;
import bugbattle.io.bugbattle.view.ImageEditor;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton imageButton = findViewById(R.id.next);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    BugBattle.startBugReporting();
                } catch (BugBattleNotInitialisedException e) {
                    e.printStackTrace();
                }
            }
        });

    }
}
