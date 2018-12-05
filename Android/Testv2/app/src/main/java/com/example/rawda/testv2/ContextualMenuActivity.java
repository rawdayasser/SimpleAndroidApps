package com.example.rawda.testv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ContextualMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.no_content);
        TextView mytv = findViewById(R.id.contextual_tv);
        registerForContextMenu(mytv);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.my_menu, menu);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.settings_item:
                Toast.makeText(ContextualMenuActivity.this, "Setting", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.search_item:
                Toast.makeText(ContextualMenuActivity.this, "Search", Toast.LENGTH_SHORT).show();
                return true;
        }

        return true;
    }
}
