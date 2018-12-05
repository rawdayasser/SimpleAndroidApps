package com.example.rawda.materialdesign;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class SnackbarTest extends AppCompatActivity {
    private Button ripple1;
    private Button ripple2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar_test);
        Snackbar.make(findViewById(R.id.cl), "Hello I'm a Snackbar", 8000).show();
        ripple1 = findViewById(R.id.rippleBtn1);
        ripple2 = findViewById(R.id.rippleBtn2);

    }
}
