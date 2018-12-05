package com.example.rawda.googletest;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.util.Log;


public class MainActivity extends AppCompatActivity {
    private final static String LOG_TAG = MainActivity.class.getSimpleName();
    public final static String EXTRA_MESSAGE = "com.example.rawda.googletest.extra.MESSAGE";
    private EditText mEditText;
    private TextView replyHead;
    private TextView reply;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) Log.d(LOG_TAG, "null");
        Log.d(LOG_TAG,"-----------");
        Log.d(LOG_TAG, "onCreate");
        mEditText = findViewById(R.id.editText_message);
        replyHead = findViewById(R.id.textView_headReply);
        reply = findViewById(R.id.textView_reply);

    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        if (replyHead.getVisibility() == View.VISIBLE){
            outState.putBoolean("reply_visible", true);
            outState.putString("reply-string", reply.getText().toString());
        }

    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
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

    public void send(View view) {
        Log.d(LOG_TAG, "button send clicked");
       Intent intent = new Intent(this, SecondActivity.class);
       intent.putExtra(EXTRA_MESSAGE, mEditText.getText().toString());
       startActivityForResult(intent,  1);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d(LOG_TAG, "OnActivityResult.. called");
        if (requestCode == 1){
            if (resultCode == RESULT_OK){
                replyHead.setVisibility(View.VISIBLE);
                reply.setText(data.getStringExtra(SecondActivity.EXTRA_REPLY));
                reply.setVisibility(View.VISIBLE);
            }
        }

    }
}
