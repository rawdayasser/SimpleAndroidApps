package com.example.rawda.scorekeeper;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatDelegate;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView scoreTv1;
    private TextView scoreTv2;
    private ImageButton buttonPlus1;
    private ImageButton buttonPlus2;
    private ImageButton buttonMinus1;
    private ImageButton buttonMinus2;
    private int scores1;
    private int scores2;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("SaveSate1", scores1);
        outState.putInt("SaveSte2", scores2);
        super.onSaveInstanceState(outState);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        /*
         getMenuInflater().inflate(R.menu.main_menu, menu);
        int nightMode = AppCompatDelegate.getDefaultNightMode();
        if (nightMode == AppCompatDelegate.MODE_NIGHT_YES){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }else{
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }
        return true;*/
        getMenuInflater().inflate(R.menu.main_menu, menu);
//Change the label of the menu based on the state of the app
        int nightMode = AppCompatDelegate.getDefaultNightMode();
        if(nightMode == AppCompatDelegate.MODE_NIGHT_YES){
            menu.findItem(R.id.night_mode).setTitle(R.string.day_mode);
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        } else{
            menu.findItem(R.id.night_mode).setTitle(R.string.night_mode);
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreTv1 = findViewById(R.id.tv_score1);
        scoreTv2 = findViewById(R.id.tv_score2);
        buttonPlus1 = findViewById(R.id.ib_plus1);
        buttonPlus2 = findViewById(R.id.ib_plus2);
        buttonMinus1 = findViewById(R.id.ib_minus1);
        buttonMinus2 = findViewById(R.id.ib_minus2);
        Snackbar.make(scoreTv1, "Undo", 900).show();
        /*
        ???
        scores1 = Integer.parseInt(scoreTv1.toString());
        scores2 = Integer.parseInt(scoreTv2.toString());
        */
        scores1 = 0;
        scores2 = 0;
        buttonPlus1.setOnClickListener(this);
        buttonPlus2.setOnClickListener(this);
        buttonMinus1.setOnClickListener(this);
        buttonMinus2.setOnClickListener(this);
        if (savedInstanceState != null){
            scores1 = savedInstanceState.getInt("SaveSate1");
            scores2 = savedInstanceState.getInt("SaveSte2");
            scoreTv1.setText(scores1 + "");
            scoreTv2.setText(scores2 + "");
        }
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.ib_plus1:
                scores1++;
                scoreTv1.setText(scores1 + "");
                break;
            case R.id.ib_plus2:
                scores2++;
                scoreTv2.setText(scores2 + "");
                break;
            case R.id.ib_minus1:
                scores1--;
                scoreTv1.setText(scores1 + "");
                break;
            case R.id.ib_minus2:
                scores2--;
                scoreTv2.setText(scores2 + "");
                break;
        }
    }
}
