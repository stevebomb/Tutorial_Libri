package com.example.tutorial_libri;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;


public class AddActivity extends AppCompatActivity {

    Button aggiungi, home;
    EditText titolo, prezzo;

     static List<Libro> bookList=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        aggiungi= (Button) findViewById(R.id.button_add);
        home= (Button) findViewById(R.id.button_home);

        titolo= (EditText) findViewById(R.id.edit_titolo);
        prezzo= (EditText) findViewById(R.id.edit_prezzo);

        aggingiLibro();
        backHome();

    }

    static void inserisciLibroLista(String titolo, float prezzo){
       bookList.add(new Libro(titolo,prezzo));
    }

    static List<Libro> getList(){
        return bookList;
    }


    void aggingiLibro(){

        aggiungi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(titolo.getText().toString()) || TextUtils.isEmpty(prezzo.getText().toString())) { //se le EditText sono vuote
                    Toast.makeText(AddActivity.this, "inserisci campi, libro non aggiunto ", Toast.LENGTH_LONG).show();    //messaggio di errore
                }else{
                    //salvo il contenuto delle EditText
                    String str_titolo= String.valueOf(titolo.getText());
                    float flt_prezzo= Float.parseFloat(String.valueOf(prezzo.getText()));

                    inserisciLibroLista(str_titolo, flt_prezzo);  //inserisco nella lista il libro
                    Toast.makeText(AddActivity.this, "Libro aggiunto", Toast.LENGTH_LONG).show(); //messaggio di inserimento avvenuto
                    titolo.setText("");
                    prezzo.setText("");
                }
            }
        });

    }

    void backHome(){
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddActivity.this, MainActivity.class));
            }
        });
    }
}
