package com.example.rawda.testbroadcastrec;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver {
    public AlarmReceiver(){

    }
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("com.example.rawda.testbr.SEND_INTENT")) {
            CharSequence text = "Broadcast Received!";
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }
}