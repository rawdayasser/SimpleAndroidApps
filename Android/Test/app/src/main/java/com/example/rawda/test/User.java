package com.example.rawda.test;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class User {
    String name;
    int image;
    public User(String name, int image){
        this.name = name;
        this.image = image;
    }
}
class CustomAdapter extends ArrayAdapter<User>{
    int resources;
    public CustomAdapter(@NonNull Context context, int resource, ArrayList<User> users) {
        super(context, resource);
        this.resources = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        User user = getItem(position);
        if (convertView == null){
           convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_row, parent, false);
        }
        TextView name = convertView.findViewById(R.id.tv);
        ImageView imageView = convertView.findViewById(R.id.iv);
        name.setText(user.name);
        imageView.setImageResource(user.image);
        return convertView;
    }
}
