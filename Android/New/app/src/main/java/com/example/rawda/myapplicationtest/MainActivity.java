package com.example.rawda.myapplicationtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.AlertDialog;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button login;
    private Button my_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        my_btn = findViewById(R.id.my_btn);
        my_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                View view1 = getLayoutInflater().inflate(R.layout.alert, null);
                username = view1.findViewById(R.id.et_username);
                password = view1.findViewById(R.id.et_password);
                login = view1.findViewById(R.id.btn_login);
                login.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (!username.getText().toString().isEmpty() && !password.getText().toString().isEmpty())
                            Toast.makeText(MainActivity.this,"Login successful", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(MainActivity.this,"please add empty fields", Toast.LENGTH_SHORT).show();

                }


                });
                builder.setView(view1);
                builder.show();
            }
        });
    }
}
