package com.example.rawda.andtut.Restaurant;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rawda.andtut.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class Tut4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tut4);
        //Button save = findViewById(R.id.saveBtn);
        //save.setOnClickListener(onSave);
        RestaurantAdapter adapter;
        ListView listView;
        ArrayList<Restaurant> model = new ArrayList<>();
        model.add(new Restaurant("Res1", "giza", "Sit_down"));
        model.add(new Restaurant("Res2", "cairo", "Take_out"));
        adapter = new RestaurantAdapter(this, R.layout.row, model);
        adapter.addAll(model);
        listView = findViewById(R.id.restaurants_lv);
        listView.setAdapter(adapter);
    }/*
    private View.OnClickListener onSave=new View.OnClickListener() {
        public void onClick(View v) {
            Restaurant restaurant;
            EditText name =  findViewById(R.id.nameet);
            EditText address = findViewById(R.id.addresset);
            RadioGroup radioGroup = findViewById(R.id.typerg);
            restaurant = new Restaurant();
            restaurant.setName(name.getText().toString());
            restaurant.setAddress(address.getText().toString());

            switch (radioGroup.getCheckedRadioButtonId()){
                case R.id.sitdown_rb:
                    restaurant.setType("Sit_down");
                    break;
                case R.id.delivery_rb:
                    restaurant.setType("Delivery");
                    break;
                case R.id.takeout_rb:
                    restaurant.setType("Take_out");
                    break;
            }
            Toast.makeText(Tut4.this , "before adapter", Toast.LENGTH_LONG).show();

            adapter.add(restaurant);
        }

    };
*/
   public class RestaurantAdapter extends ArrayAdapter<Restaurant>{
        LayoutInflater layoutInflater;
        public RestaurantAdapter(@NonNull Context context, int resource) {
            super(context, resource);
        }

       public RestaurantAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Restaurant> objects) {
           super(context, resource, objects);
             layoutInflater = LayoutInflater.from(context);
        }

       @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            if (convertView == null) {
               // Toast.makeText(getContext(), "before inflator", Toast.LENGTH_LONG).show();
                //Log.d("", "before inf");
                convertView = layoutInflater.inflate(R.layout.row, parent, false);
            }
            //Toast.makeText(getContext() , "before rest", Toast.LENGTH_LONG).show();
            //Log.d("", "before res");
            Restaurant restaurant2 = getItem(position);
            if (restaurant2 != null){
            String name = restaurant2.getName();
            String address = restaurant2.getAddress();
            String type = restaurant2.getType();
            TextView name_tv = convertView.findViewById(R.id.row_nameTv);
            TextView address_tv = convertView.findViewById(R.id.row_addressTv);
            name_tv.setText(name);
            address_tv.setText(address);
            ImageView imageView = convertView.findViewById(R.id.row_iv);
            //Restaurant restaurant = model.get(position);
            //((TextView)convertView.findViewById(R.id.row_nameTv)).setText(restaurant.getName());
            //((TextView)convertView.findViewById(R.id.row_addressTv)).setText(restaurant.getAddress());

            if (type.equals("Sit_down")){
                imageView.setImageResource(R.drawable.im1);
            }
            else if (type.equals("Take_out")){
                imageView.setImageResource(R.drawable.im2);
            }else if (type.equals("Delivery")){
                imageView.setImageResource(R.drawable.im3);
            }
            }
            return convertView;
        }
    }
}

