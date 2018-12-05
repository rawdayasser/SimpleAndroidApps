package com.example.rawda.sqliteapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ModifyCountryActivity extends AppCompatActivity implements View.OnClickListener {
    private Button updateBtn, deleteBtn;
    private EditText titleTv, descTv;
    private long _id;
    private DBManager dbManager;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setTitle("Modify Record");
        setContentView(R.layout.activity_modify_record);
        dbManager = new DBManager(this);
        updateBtn = findViewById(R.id.btn_update);
        deleteBtn = findViewById(R.id.btn_delete);
        titleTv = findViewById(R.id.title_et_modify);
        descTv = findViewById(R.id.desc_et_modify);
        Intent intent = getIntent();
        String id = intent.getStringExtra("id");
        String title = intent.getStringExtra("title");
        String desc = intent.getStringExtra("desc");
        titleTv.setText(title);
        descTv.setText(desc);
        _id = Long.parseLong(id);
        updateBtn.setOnClickListener(this);
        deleteBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        String _title = titleTv.getText().toString();
        String _desc = descTv.getText().toString();

        int id = view.getId();
        switch(id){
            case R.id.btn_update:
                dbManager.update(_id, _title, _desc);
                this.returnHome();
                break;
            case R.id.btn_delete:
                dbManager.delete(_id);
                break;
        }
    }

    private void returnHome() {
        Intent homeIntent = new Intent(getApplicationContext(), CountryListActivity.class)
                .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(homeIntent);
    }
}
