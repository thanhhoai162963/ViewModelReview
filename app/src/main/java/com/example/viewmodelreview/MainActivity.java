package com.example.viewmodelreview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    MainViewModel mainViewModel;
    Button mbtn;
    EditText medt;
    TextView mtv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbtn = findViewById(R.id.btnViewmodel);
        medt = findViewById(R.id.edtViewmodel);
        mtv = findViewById(R.id.txt);
        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        mainViewModel.getData().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                mtv.setText(s);
            }
        });
        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = medt.getText().toString();
                mainViewModel.chuoi(value);
            }
        });
    }
}