package com.example.opilane.kuningad;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.List;

public class SpinnerKings extends AppCompatActivity {
    private List<King> kings = (new Kings()).getKings();
    private Spinner view;
    private EditText from, to;

    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_kings);

        from = findViewById(R.id.txtFrom);
        to = findViewById(R.id.txtTo);
        view = findViewById(R.id.lstKings);

        disable(from);
        disable(to);

        view.setAdapter(new ArrayAdapter<King>(this,android.R.layout.simple_spinner_item,kings));
        // event handles that has another listener which is an interface that defines two methods
        view.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                update(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                from.setText("");
                to.setText("");
            }
        });
        
    }
    // disable method that'll disable both of the input fields so that user cant't enter text
    private void disable(EditText view){
        view.setKeyListener(null);
        view.setEnabled(false);
    }
    public void update(int position){
        int a = kings.get(position).getFrom();
        int b = kings.get(position).getTo();
        from.setText(a == 0 ?"" : "" + a);
        to.setText(b == 9999 ? "" : "" + b);
    }
}


