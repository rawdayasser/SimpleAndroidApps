package com.example.rawda.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Person person;
        Bundle b = getIntent().getExtras();
        TextView tv = new TextView(this);
        tv.setText(b.getString("Rawda"));
        setContentView(tv);
    }
}
