package com.example.romymae.userinput;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {
    int aantal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void plus(View view) {
        aantal ++;
        display(aantal);
    }

    public void min(View view) {
        aantal=aantal-1;
        display(aantal);
    }


    public void plusje(View view) {
        aantal ++;
        show(aantal);
    }

    public void minetje(View view) {
        aantal=aantal-1;
        show(aantal);
    }


    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.cijfer_text_view);
        quantityTextView.setText("" + number);
    }
    private void show(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.cijfer2_text_view);
        quantityTextView.setText("" + number);
    }

}