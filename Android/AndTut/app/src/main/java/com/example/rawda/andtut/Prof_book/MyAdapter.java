package com.example.rawda.andtut.Prof_book;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.rawda.andtut.R;

import java.util.List;

public class MyAdapter extends ArrayAdapter<Student>{
    private LayoutInflater inflater;
    public MyAdapter (Context context, List<Student> data){
        super(context, 0, data);
        inflater = LayoutInflater.from(context);
    }


    @Override
    public View getView(int position, View view, ViewGroup parent)
    {
        //ViewHolder viewHolder;
        if (view == null) {
            view = inflater.inflate(R.layout.row2, null);
// Do some initialization
//Retrieve the view on the item layout and set the value.
          //  viewHolder = new ViewHolder(view);
           // view.setTag(viewHolder);
        }
        else {
            //viewHolder = (ViewHolder) view.getTag();
        }
//Retrieve your object
        Student data = getItem(position);
        String name = data.getName();
        String id = data.getId();
        TextView nameTv = view.findViewById(R.id.row2_tv);
        TextView idTv = view.findViewById(R.id.row2_tv2);
        nameTv.setText(name);
        idTv.setText(id);
        //viewHolder.txt.setText(data.getName());
        //viewHolder.txt2.setText(data.getId());
        return view;
    }
}
    /*
    private class ViewHolder
    {
        private final TextView txt;
        private final TextView txt2;
        private ViewHolder(View view)
        {
            txt =  view.findViewById(R.id.row2_tv);
            txt2 = view.findViewById(R.id.row2_tv2);
        }
    }
*/