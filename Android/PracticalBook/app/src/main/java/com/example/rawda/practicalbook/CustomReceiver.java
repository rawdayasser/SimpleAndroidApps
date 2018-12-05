package com.example.rawda.practicalbook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        String msg = null;
        switch (action){
            case Intent.ACTION_POWER_CONNECTED :
                msg = "POWER CONNECTED";
                break;
            case Intent.ACTION_POWER_DISCONNECTED:
                msg = "POWER DISCONNECTED";
                break;
        }
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
        Toast.makeText(context, R.string.customBroadStr, Toast.LENGTH_LONG).show();
    }
}
