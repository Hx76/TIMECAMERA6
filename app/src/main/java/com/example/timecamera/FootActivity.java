package com.example.timecamera;


import android.app.Activity;
import android.os.Bundle;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.MapView;

public class FootActivity extends Activity {
    MapView mMapView = null;
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            SDKInitializer.initialize(getApplicationContext());
            setContentView(R.layout.activity_foot);
            mMapView =  findViewById(R.id.bmapView);
        }
        protected void onDestroy() {
            super.onDestroy();
            mMapView.onDestroy();
        }
        protected void onResume() {
            super.onResume();
            mMapView.onResume();
        }
        protected void onPause() {
            super.onPause();
            mMapView.onPause();
        }
    }

