package com.example.rawda.sqliteapp;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CountryListActivity extends AppCompatActivity {
    private DBManager mDBManager;
    private ListView listView;
    private SimpleCursorAdapter mCursorAdapter;
    final String[] from = new String[] {DatabaseHelper._ID, DatabaseHelper.SUBJECT, DatabaseHelper.DESC};
    final int[] to = new int[]{R.id.id, R.id.title, R.id.desc};
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.fragment_emp_list);
        mDBManager = new DBManager(this);
        mDBManager.open();
        Cursor cursor = mDBManager.fetch();
        listView = findViewById(R.id.list_view);
        listView.setEmptyView(findViewById(R.id.empty));
        mCursorAdapter = new SimpleCursorAdapter(this, R.layout.activity_view_record, cursor, from, to, 0);
        mCursorAdapter.notifyDataSetChanged();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView idTv = view.findViewById(R.id.id);
                TextView titleTv = view.findViewById(R.id.title);
                TextView descTv = view.findViewById(R.id.desc);
                String id = idTv.getText().toString();
                String title = titleTv.getText().toString();
                String desc = descTv.getText().toString();
                Intent modify_intent = new Intent(getApplicationContext(), ModifyCountryActivity.class);
                modify_intent.putExtra("id", id);
                modify_intent.putExtra("title", title);
                modify_intent.putExtra("desc", desc);
                startActivity(modify_intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.add_record){
            Intent intent = new Intent(this, AddCountryActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
