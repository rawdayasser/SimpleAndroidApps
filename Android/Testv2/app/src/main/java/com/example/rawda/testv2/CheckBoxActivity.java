package com.example.rawda.testv2;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity implements View.OnClickListener{
    private CheckBox female;
    private CheckBox male;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        female = findViewById(R.id.female_cb);
        male = findViewById(R.id.male_cb);
        female.setOnClickListener(this);
        male.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.female_cb){
            if (female.isChecked())
                Toast.makeText(CheckBoxActivity.this, "Female is checked", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(CheckBoxActivity.this, "female is unchecked", Toast.LENGTH_SHORT).show();
        }
        else if (view.getId() == R.id.male_cb) {
         if (male.isChecked())
            Toast.makeText(CheckBoxActivity.this, "Male is clicked", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(CheckBoxActivity.this, "Male is unchecked",Toast.LENGTH_SHORT).show();
        }
    }
}
