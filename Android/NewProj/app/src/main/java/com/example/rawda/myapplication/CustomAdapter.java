package com.example.rawda.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;
import java.util.zip.Inflater;

class CustomAdapter extends ArrayAdapter<Row> {
    int resources;
    public CustomAdapter(Context context, List<Row> items, int resource){
        super(context, resource, items);
        this.resources = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null){
          LayoutInflater inflater = getContext().getSystemService();
          inflater.inflate(resources, (ViewGroup) convertView, true);
        }
        return convertView;
    }
}
class Row {
    String s;
    int image;
    public Row(String s, int image){
        this.s = s;
        this.image = image;
    }

}