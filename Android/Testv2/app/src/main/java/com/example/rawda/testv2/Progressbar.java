package com.example.rawda.testv2;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.Toolbar;

public class Progressbar extends AppCompatActivity {
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progressbar);
       // Toolbar toolbar = findViewById(R.id.toolbar);
        progressBar = findViewById(R.id.progressbar);


    }
}
