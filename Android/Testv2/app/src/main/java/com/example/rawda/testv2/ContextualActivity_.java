package com.example.rawda.testv2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ContextualActivity_ extends AppCompatActivity implements View.OnLongClickListener{
    private ActionMode mActionMode;
    private TextView mTextView1;
    private TextView mTextView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contextual_);
        mTextView1 = findViewById(R.id.contextual_tv_1);
        mTextView2 = findViewById(R.id.contextual_tv_2);
        mTextView1.setOnLongClickListener(this);
        mTextView2.setOnLongClickListener(this);
     }
    public ActionMode.Callback mActionModeCallback = new ActionMode.Callback(){

        @Override
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
           actionMode.getMenuInflater().inflate(R.menu.contextual_menu, menu);
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            int id = menuItem.getItemId();
            switch (id){
                case  R.id.item_done:
                    Toast.makeText(ContextualActivity_.this, "done", Toast.LENGTH_SHORT).show();
                    actionMode.finish();
                    return true;
                case R.id.item_edit:
                    Toast.makeText(ContextualActivity_.this, "edit", Toast.LENGTH_SHORT).show();
                    actionMode.finish();
                    return true;
                default:
                    return false;
            }

        }

        @Override
        public void onDestroyActionMode(ActionMode actionMode) {
            mActionMode = null;
        }
    };
    @Override
    public boolean onLongClick(View view) {
        if (mActionMode != null)
            return false;
        else{
            mActionMode = ContextualActivity_.this.startActionMode(mActionModeCallback);
            view.setSelected(true);
            return true;
        }

    }
}
