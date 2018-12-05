package com.example.rawda.andtut;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import android.support.v7.app.AppCompatActivity;
import com.example.rawda.andtut.R;


public class MainActivity extends AppCompatActivity{

    private final static String TAG1 = MainActivity.class.getSimpleName();
    private final static String TAG2 = MainActivity.class.getCanonicalName();
    final static float STEP = 200;
    TextView mytv;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //CustomTextView mtxt_name =  findViewById(R.id.pager_title);
        setContentView(R.layout.activity_main);
       // CustomTextView customTextView =  findViewById(R.id.pager_title);


    }

}
