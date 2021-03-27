package com.example.tallerunimaguno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class PaisesActivity extends AppCompatActivity {

    ListView listapaises;
    String [] pais={"Argentina","Brazil","Colombia","Peru"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paises);

        //datos enviados desde home
        Intent envio=getIntent();
        String nombre = envio.getStringExtra("name");
        String doc= envio.getStringExtra("doc");
        Toast.makeText(this, "recibi nombre: "+nombre+" , DOC: "+doc, Toast.LENGTH_SHORT).show();

        listapaises = findViewById(R.id.lsPaises);

        ArrayAdapter adapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice, pais); //se va a conectar con nuestra lista
        listapaises.setAdapter(adapter);


        listapaises.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(PaisesActivity.this, "Pais "+pais[position], Toast.LENGTH_SHORT).show();
                //Toast.makeText(PaisesActivity.this, "Pais "+listapaises.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
               // Toast.makeText(PaisesActivity.this, "Pais "+((TextView)view).getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}