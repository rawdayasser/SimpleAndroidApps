package com.example.rawda.googletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {
    private final String LOG_TAG = SecondActivity.class.getSimpleName();
    private TextView received_message;
    private  TextView head_Message;
    private EditText replyMesssage;
    private final String headMessage = "Received Message";
    public final static String EXTRA_REPLY = "com.example.rawda.googletest.extra.REPLY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(LOG_TAG, "onCreate");
        Intent intent = getIntent();
        head_Message = findViewById(R.id.textView_headMessage);
        head_Message.setText(headMessage);
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        if (!message.isEmpty()){
        received_message = findViewById(R.id.textView_message);
        received_message.setText(message);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }

    public void reply(View view) {
        Log.d(LOG_TAG, "reply");
        Intent intent = new Intent(this, MainActivity.class);
        replyMesssage = findViewById(R.id.editText_reply);
        String reply_Message = replyMesssage.getText().toString();
        intent.putExtra(EXTRA_REPLY, reply_Message);
        setResult(RESULT_OK, intent);
        finish();
    }
}
