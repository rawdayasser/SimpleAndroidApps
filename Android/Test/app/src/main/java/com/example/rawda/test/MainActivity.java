package com.example.rawda.test;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.net.URI;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent  = new Intent(this, Main2Activity.class);
        intent.addFlag(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        PackageManager packageManager = getPackageManager();
        ComponentName componentName = intent.resolveActivity(packageManager);

       /* ListView l = findViewById(R.id.lv);
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Rawda", R.drawable.ic_launcher_foreground));
        users.add(new User("Omar", R.drawable.ic_launcher_background));
        users.add(new User("Fatima", R.drawable.ic_launcher_foreground));
        CustomAdapter customAdapter = new CustomAdapter(this, R.layout.custom_row ,users);
        l.setAdapter(customAdapter);
        */

    }



    public void startFacebook(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.facebook.com"));
        startActivity(intent);
    }

    public void go(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        Person person = new Person("Rawda", 150);
        intent.putExtra("Rawda", "programing");
        startActivity(intent);
    }

    public void implGo(View view) {
        EditText et = findViewById(R.id.et);
        String url  = et.getText().toString();
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(i);
    }
}


