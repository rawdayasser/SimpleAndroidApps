package com.example.rawda.andtut.Restaurant2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.rawda.andtut.R;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class Test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Model2 s = new Model2("hello", "world");
        Model2 s2 = new Model2("Rawda", "Yasser");
        List<Model2> model2Listi = new ArrayList<>();
        model2Listi.add(s);
        model2Listi.add(s2);
        ListView listView2 = findViewById(R.id.lv);
        ArrayAdapter customAd = new MyAdapter(this, R.layout.row2, model2Listi);
        //customAd.addAll(model2Listi);
        listView2.setAdapter(customAd);
        /*Model r = new Model("Hello", "Giza", "Sit_down");
        Model r2 = new Model("Res", "Cairo", "Delivery");
        List<Model> list = new ArrayList<>();
        ArrayAdapter customAdapter = new MyAdapter(this, R.layout.row, list);
        ListView listView = findViewById(R.id.lv);
        listView.setAdapter(customAdapter);
        list.add(r);
        list.add(r2);
        customAdapter.add(r);
        customAdapter.add(r2);
   */
    }

    class MyAdapter extends ArrayAdapter<Model2>{
        LayoutInflater inflater;
        public MyAdapter(@NonNull Context context, int resource, List<Model2> list) {
            super(context, resource, list);
            inflater = LayoutInflater.from(context);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            //
            // super.getView(position, convertView, parent);

            if (convertView == null) {
               // inflater = getLayoutInflater();
                convertView = inflater.inflate(R.layout.row2, parent, false);
            }
            TextView s1_tv = convertView.findViewById(R.id.row2_tv);
            TextView s2_tv2 = convertView.findViewById(R.id.row2_tv2);
            Model2 m = getItem(position);
            String ss1 = m.getS1();
            String ss2 = m.getS2();
            s1_tv.setText(ss1);
            s2_tv2.setText(ss2);
/*
            Model restaurant = getItem(position);

            String name = restaurant.getName();
            String address = restaurant.getAddress();
            String type = restaurant.getType();
            //ListView lv = findViewById(R.id.lv);
            TextView nameTv = findViewById(R.id.row_nameTv);
            TextView addressTv = findViewById(R.id.row_addressTv);
            ImageView typeIv = findViewById(R.id.row_iv);
            nameTv.setText(name);
            addressTv.setText(address);
            typeIv.setImageResource(R.drawable.im1);
*/
        return convertView;
        }

    }
}
