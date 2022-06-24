package com.example.hajama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Signin extends AppCompatActivity  implements View.OnClickListener {
    TextView signup;
//    TextView skip;
    ImageView signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        signup=findViewById(R.id.signup);
        signup.setOnClickListener(this);
//        skip=findViewById(R.id.skip);
//        skip.setOnClickListener(this);
        signin=findViewById(R.id.signin);
        signin.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.signup) {
            Intent intent = new Intent(Signin.this, Signup.class);
            startActivity(intent);
//        } else if (id == R.id.skip) {
//            Intent intent1 = new Intent(Signin.this, MainActivity.class);
//            startActivity(intent1);
        } else if (id==R.id.signin){
            Intent intent2=new Intent(Signin.this, MainActivity.class);
            startActivity(intent2);

        }
    }
}