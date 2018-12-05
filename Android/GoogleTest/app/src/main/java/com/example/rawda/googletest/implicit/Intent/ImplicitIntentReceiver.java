package com.example.rawda.googletest.implicit.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.rawda.googletest.R;
import android.net.Uri;
public class ImplicitIntentReceiver extends AppCompatActivity {
    private TextView msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent_receiver);
        msg = findViewById(R.id.myTV);
        Uri uri = getIntent().getData();
        if (uri != null){
            String messageUri = "URI: " + uri.toString();
            msg.setText(messageUri);
        }
    }

}
