package com.example.timecamera;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class FootActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SDKInitializer.initialize(getApplicationContext());
        setContentView(R.layout.activity_foot);
    }

}
