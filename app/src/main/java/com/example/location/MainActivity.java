package com.example.location;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button accept;
    private Button decline;

    private DatabaseReference mdatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        accept=(Button) findViewById(R.id.button3);
        mdatabase = FirebaseDatabase.getInstance().getReference().child("Users");

        decline=(Button) findViewById(R.id.button4);
        decline.setOnClickListener(this);
        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent i=new Intent(MainActivity.this,MapsActivity.class);
                startActivity(i);
            }
        });


    }

    @Override
    public void onClick(View view) {
        if(view==accept) {
            finish();
        }

    }
}