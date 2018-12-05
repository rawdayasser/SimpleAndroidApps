package com.example.rawda.testv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class NoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no);
        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.settings_item){
            Toast.makeText(NoActivity.this, "settng", Toast.LENGTH_SHORT).show();
        }else if (id == R.id.search_item){
            Toast.makeText(NoActivity.this, "search", Toast.LENGTH_SHORT).show();
        }else if (id == R.id.sub1){
            Toast.makeText(NoActivity.this, "sub1", Toast.LENGTH_SHORT).show();
        }else if (id == R.id.sub2){
            Toast.makeText(NoActivity.this, "sub2", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
