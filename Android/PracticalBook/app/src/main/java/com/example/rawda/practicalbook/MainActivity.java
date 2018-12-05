package com.example.rawda.practicalbook;

import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private CustomReceiver customReceiver;
    private static final String ACTION_CUSTOM_BROADCAST = "com.example.rawda.practicalbook.ACTION_BROADCAST";
    private PackageManager mPackageManager;
    private ComponentName mComponentName;
    private Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPackageManager = getPackageManager();
        mComponentName = new ComponentName(this, CustomReceiver.class);
        send = findViewById(R.id.sendBtn);
        send.setOnClickListener(this);
        customReceiver = new CustomReceiver();
        LocalBroadcastManager.getInstance(this).registerReceiver(customReceiver, new IntentFilter(ACTION_CUSTOM_BROADCAST));
    }

    @Override
    protected void onStart() {
        super.onStart();
        mPackageManager.setComponentEnabledSetting(mComponentName, mPackageManager.COMPONENT_ENABLED_STATE_ENABLED, mPackageManager.DONT_KILL_APP);
    }

    @Override
    protected void onStop() {
        super.onStop();
        mPackageManager.setComponentEnabledSetting(mComponentName, mPackageManager.COMPONENT_ENABLED_STATE_DISABLED, mPackageManager.DONT_KILL_APP);
    }

    @Override
    public void onClick(View view) {
        Intent customBCIntent = new Intent(ACTION_CUSTOM_BROADCAST);
        LocalBroadcastManager.getInstance(this).sendBroadcast(customBCIntent);
    }

    @Override
    protected void onDestroy() {
        LocalBroadcastManager.getInstance(this).unregisterReceiver(customReceiver);
        super.onDestroy();
    }
}

