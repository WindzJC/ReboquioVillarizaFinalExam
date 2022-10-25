package com.demo.learningtasks31;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView card1, card2, card3, card4, card5, card6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        card1 = (CardView) findViewById(R.id.c1);
        card2 = (CardView) findViewById(R.id.c2);
        card3 = (CardView) findViewById(R.id.c3);
        card4 = (CardView) findViewById(R.id.c4);
        card5 = (CardView) findViewById(R.id.c5);
        card6 = (CardView) findViewById(R.id.c6);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()) {


            case R.id.c1:
                i = new Intent(this, gtx1080.class);
                startActivity(i);
                break;

            case R.id.c2:
                i = new Intent(this, gtx2060.class);
                startActivity(i);
                break;

            case R.id.c3:
                i = new Intent(this, gtx2070.class);
                startActivity(i);
                break;

            case R.id.c4:
                i = new Intent(this, gtx3080.class);
                startActivity(i);
                break;

            case R.id.c5:
                i = new Intent(this, gtx3090.class);
                startActivity(i);
                break;

            case R.id.c6:
                i = new Intent(this, gtx4090.class);
                startActivity(i);
                break;
        }
    }
}