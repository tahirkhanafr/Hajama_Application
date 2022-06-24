package com.example.hajama.ui.appointment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.media.tv.TvContentRating;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

import com.example.hajama.R;
import com.google.android.material.card.MaterialCardView;

import java.text.DateFormat;
import java.util.Calendar;

public class Appointment extends AppCompatActivity implements View.OnClickListener {
    CalendarView cv;
    TextView textView,t1,t2,t3,t4,t5;
    Button submit;
    String sdate, stime;
    MaterialCardView mc1,mc2,mc3,mc4,mc5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment);
        cv=findViewById(R.id.CV);
        textView= findViewById(R.id.time11);
        submit=findViewById(R.id.submit_record);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t4=findViewById(R.id.t4);
        t5=findViewById(R.id.t5);
        mc1=findViewById(R.id.mc1);
        mc2=findViewById(R.id.mc2);
        mc3=findViewById(R.id.mc3);
        mc4=findViewById(R.id.mc4);
        mc5=findViewById(R.id.mc5);

        t1.setOnClickListener(this);
        t2.setOnClickListener(this);
        t3.setOnClickListener(this);
        t4.setOnClickListener(this);
        t5.setOnClickListener(this);

        Calendar calendar=Calendar.getInstance();
        String currentDate1= DateFormat.getDateInstance().format(calendar.getTime());
        sdate=currentDate1;

        cv.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                 sdate=dayOfMonth+ "/"+ month+ "/"+ year;
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent=new Intent(Appointment.this, Submit_record.class);
                intent.putExtra("Date", sdate); // getText() SHOULD NOT be static!!!
                intent.putExtra("Time", stime); // getText() SHOULD NOT be static!!!
                startActivity(intent);

            }
        });
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.t1)
        {
            stime=t1.getText().toString();
        }
        else if (v.getId()==R.id.t2)
        {
            stime=t2.getText().toString();
            mc1.setBackgroundColor(Color.WHITE);
            mc3.setBackgroundColor(Color.WHITE);
            mc4.setBackgroundColor(Color.WHITE);
            mc5.setBackgroundColor(Color.WHITE);
            mc2.setBackgroundColor(Color.parseColor("#3e7958"));
        }
        else if (v.getId()==R.id.t3)
        {
            stime=t3.getText().toString();
            mc1.setBackgroundColor(Color.WHITE);
            mc2.setBackgroundColor(Color.WHITE);
            mc4.setBackgroundColor(Color.WHITE);
            mc5.setBackgroundColor(Color.WHITE);
            mc3.setBackgroundColor(Color.parseColor("#3e7958"));
        }
        else if (v.getId()==R.id.t4)
        {
            stime=t4.getText().toString();
            mc1.setBackgroundColor(Color.WHITE);
            mc2.setBackgroundColor(Color.WHITE);
            mc3.setBackgroundColor(Color.WHITE);
            mc5.setBackgroundColor(Color.WHITE);
            mc4.setBackgroundColor(Color.parseColor("#3e7958"));
        }
        else
        {
            stime=t5.getText().toString();
            mc1.setBackgroundColor(Color.WHITE);
            mc2.setBackgroundColor(Color.WHITE);
            mc3.setBackgroundColor(Color.WHITE);
            mc4.setBackgroundColor(Color.WHITE);
            mc5.setBackgroundColor(Color.parseColor("#3e7958"));
        }
    }
}