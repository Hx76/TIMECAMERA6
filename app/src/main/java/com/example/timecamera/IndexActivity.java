package com.example.timecamera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IndexActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
    }
    public void StartFoot(View view) {
        Intent intent = new Intent();
        intent.setClass(IndexActivity.this,FootActivity.class);
        startActivity(intent);
    }

}
