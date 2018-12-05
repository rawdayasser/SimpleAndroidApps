package com.example.rawda.testv2.droid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.rawda.testv2.R;

public class DroidMainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView donuts;
    private ImageView iceCream;
    private ImageView froyo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_droid_main);
        Toolbar toolbar = findViewById(R.id.toolbar_droid);
        setSupportActionBar(toolbar);
        donuts = findViewById(R.id.iv_donuts);
        iceCream = findViewById(R.id.iv_ice_cream);
        froyo = findViewById(R.id.iv_froyo);
        donuts.setOnClickListener(this);
        iceCream.setOnClickListener(this);
        froyo.setOnClickListener(this);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Begin a Chat Now", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                displayMap();
            }
        });
    }

    @Override
    public void onClick(View view) {
        Intent mIntent = new Intent(DroidMainActivity.this, OrderActivity.class);
        startActivity(mIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_droid, menu);
        return true;
    }

    private void showToast(String message){
        Toast.makeText(DroidMainActivity.this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.item_order:
                showToast("You clicked Order");
                return true;
            case R.id.item_status:
                showToast("You clicked Status");
                return true;
            case R.id.item_favourites:
                showToast("You clicked Favourites");
                return true;
            case R.id.item_contacts:
                showToast("You clicked Contacts");
                return true;
            default:
        }
        return super.onOptionsItemSelected(item);
    }
    public void displayMap() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
// Using the coordinates for Google headquarters.
        String data = getString(R.string.google_mtv_coord_zoom12);
        intent.setData(Uri.parse(data));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
