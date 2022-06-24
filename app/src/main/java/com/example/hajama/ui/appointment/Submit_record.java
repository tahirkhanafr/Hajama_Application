package com.example.hajama.ui.appointment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.hajama.R;

public class Submit_record extends AppCompatActivity {
    TextView showdate, showtime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_record);
        showdate=findViewById(R.id.showdate);
        showtime=findViewById(R.id.showtime);

        String date = getIntent().getExtras().getString("Date");
        String time = getIntent().getExtras().getString("Time");
        showdate.setText(date);
        showtime.setText(time);
    }
}