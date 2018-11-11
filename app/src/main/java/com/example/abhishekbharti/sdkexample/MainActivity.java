package com.example.abhishekbharti.sdkexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.abhishekbharti.customsdk.activity.activity.RouterActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RouterActivity.Companion.start(this, RouterActivity.Companion.getFEATURE_2());
    }
}
