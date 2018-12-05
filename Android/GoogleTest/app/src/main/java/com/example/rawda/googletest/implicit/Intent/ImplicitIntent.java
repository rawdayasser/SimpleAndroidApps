package com.example.rawda.googletest.implicit.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;
import android.net.Uri;
import com.example.rawda.googletest.R;
import android.util.Log;
import android.support.v4.app.ShareCompat;
public class ImplicitIntent extends AppCompatActivity {
    private EditText url;
    private EditText loc;
    private EditText textShare;
    public static final String LOG_TAG = ImplicitIntent.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent);
        url = findViewById(R.id.editText_url);
        loc = findViewById(R.id.editText_location);
        textShare = findViewById(R.id.editText_share);
    }

    public void openWebsite(View view) {
        String mUrl = url.getText().toString();
        Uri mUri = Uri.parse(mUrl);
        Intent intent = new Intent(Intent.ACTION_VIEW, mUri);
        if (intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }else {
            Log.d(LOG_TAG, "no app found");
        }
    }

    public void openLocation(View view) {
        String mLoc = loc.getText().toString();
        Uri uri = Uri.parse("geo:0,0?q=" + mLoc);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }else{
            Log.d(LOG_TAG, "no app found");
        }
    }


    public void shareText(View view) {
        String text = textShare.getText().toString();
        ShareCompat.IntentBuilder.from(this).setType("text/plain").setChooserTitle("Share this text with").setText(text).startChooser();
    }

}
