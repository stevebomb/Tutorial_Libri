package com.example.tutorial_libri;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VisualActivity extends AppCompatActivity {

    RecyclerView recyclerView; // classe che supporta la visualizzazione di una raccolta di dati
    List<Libro> bookList;
    Button  home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizza);

        home= (Button) findViewById(R.id.btn_home);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        bookList=AddActivity.getList(); //ritorno la lista statica dei libri


        BookAdapter adapter = new BookAdapter(this, bookList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

        backHome();


    }


    void backHome(){

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VisualActivity.this, MainActivity.class));
            }
        });

    }

}
