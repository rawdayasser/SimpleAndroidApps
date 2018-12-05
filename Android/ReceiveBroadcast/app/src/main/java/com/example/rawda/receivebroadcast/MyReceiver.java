package com.example.rawda.receivebroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
       Toast.makeText(context, "Broadcast Received!!", Toast.LENGTH_LONG).show();
    }
}
