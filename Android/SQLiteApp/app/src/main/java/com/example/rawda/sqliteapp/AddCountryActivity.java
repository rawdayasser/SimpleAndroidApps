package com.example.rawda.sqliteapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;

public class AddCountryActivity extends AppCompatActivity implements View.OnClickListener{
    private Button addTodoBtn;
    private EditText titleEt;
    private EditText descEt;

    private DBManager dbManager;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setTitle("Add Record");
        setContentView(R.layout.activity_add_record);
        addTodoBtn = findViewById(R.id.add_record);
        titleEt = findViewById(R.id.title_et);
        descEt = findViewById(R.id.desc_et);
        dbManager = new DBManager(this);
        dbManager.open();
        addTodoBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        final String title = titleEt.getText().toString();
        final String desc = descEt.getText().toString();

        int id = view.getId();
        switch (id){
            case R.id.add_record:
                dbManager.insert(title, desc);
                Intent main = new Intent(getApplicationContext(), CountryListActivity.class)
                        .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(main);
                break;
            case R.id.title_et:
                break;
            case R.id.desc_et:
                break;

        }
    }
}
