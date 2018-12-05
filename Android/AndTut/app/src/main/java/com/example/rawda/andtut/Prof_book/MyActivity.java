package com.example.rawda.andtut.Prof_book;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.rawda.andtut.R;

import java.util.ArrayList;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        ListView listView = findViewById(R.id.listViewEx);
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Rawda", "aaaaa"));
        students.add(new Student("Fatima", "11111111"));
        ArrayAdapter<Student> adapter = new MyAdapter(this, students);
        adapter.addAll(students);
        listView.setAdapter(adapter);
    }
}
