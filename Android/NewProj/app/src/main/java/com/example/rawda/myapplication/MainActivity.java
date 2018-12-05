package com.example.rawda.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText un;
    EditText ps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }

    public void buttonClick(View v){
        un = findViewById(R.id.un);
        ps = findViewById(R.id.psw);
        String u = un.getText().toString();
        String p = ps.getText().toString();
        Button b = findViewById(R.id.login);
        Intent i;
        Toast.makeText(this,u + p, Toast.LENGTH_LONG).show();
        if (u.equals("rawda")  && p.equals("123") ) {
             i = new Intent(MainActivity.this, Main2Activity.class);
             startActivity(i);
        }
        else{
            Toast.makeText(this, "user name or password wrong", Toast.LENGTH_LONG).show();
        }
    }


}
