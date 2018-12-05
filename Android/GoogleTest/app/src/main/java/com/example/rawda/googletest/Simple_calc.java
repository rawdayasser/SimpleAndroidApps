package com.example.rawda.googletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.util.Log;


public class Simple_calc extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private Button add;
    private Button sub;
    private Button div;
    private Button mul;
    private TextView result;
    private String s = "123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calc);
        Spinner spinner1 = findViewById(R.id.spiner1);
        String data[]= {"Rawda", "Omar", "Fatima", "Diaa"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.arrData, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        if (spinner1 != null) {
            spinner1.setAdapter(adapter2);
        }
        Log.d("simple", "simple");
        num1 = findViewById(R.id.editText_num1);
        num2 = findViewById(R.id.editText_num2);
        add = findViewById(R.id.button_add);
        sub = findViewById(R.id.button_sub);
        div = findViewById(R.id.button_div);
        mul = findViewById(R.id.button_mul);
        result = findViewById(R.id.textView_result);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Double n1 = Double.parseDouble(num1.getText().toString());
            Double n2 = Double.parseDouble(num2.getText().toString());
            result.setText((n1 + n2) + "");
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double n1 = Double.parseDouble(num1.getText().toString());
                Double n2 = Double.parseDouble(num2.getText().toString());
                result.setText((n1 - n2) + "");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double n1 = Double.parseDouble(num1.getText().toString());
                Double n2 = Double.parseDouble(num2.getText().toString());
                result.setText((n1 / n2) + "");
            }
        });
       mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double n1 = Double.parseDouble(num1.getText().toString());
                Double n2 = Double.parseDouble(num2.getText().toString());
                result.setText((n1 * n2) + "");
            }
        });
       method();
    }
    public void my(View view) {

        Log.d("my", "123");
    }
    public void method(){
        Log.d("method", "me");
        String x = "X";
    }


}
