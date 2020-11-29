package com.example.tutorial_libri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button aggiungi, visualizza;   //dichiarazione pulsanti

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        aggiungi= (Button) findViewById(R.id.button_add_activity);    //findViewById restituisce una View Object corrispondente all' id specificato
        visualizza= (Button) findViewById(R.id.button_visual_activity);


        aggiungi.setOnClickListener(new View.OnClickListener() { //listner pulsante aggiungi
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AddActivity.class ));  //in questo caso quando viene premuto cambia activity
            }
        });

        visualizza.setOnClickListener(new View.OnClickListener() { //listner pulsante aggiungi
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, VisualActivity.class ));  //in questo caso quando viene premuto cambia activity
            }
        });


    }
}