package com.example.son.lab7;

import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bai1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        Button btnSnackbar=findViewById(R.id.btnSnackbar);
        btnSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "chac chua",5000).setActionTextColor(Color.RED).setAction("OK", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //xu ly cai gi do
                    }
                }).show();

            }
        });
    }
}
