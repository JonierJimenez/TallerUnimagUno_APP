package com.example.tallerunimaguno;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    Button matematicas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        matematicas = findViewById(R.id.btnMatematicas);
        matematicas.setOnClickListener(this);
    }

    //menu_main para utilizar el menu click derecho generate override method
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_home, menu);
        return true;
    }//para mostrar un menu

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent i;
        switch (item.getItemId()){
            case R.id.mnuGeometria:
                i = new Intent(getApplicationContext(),GeometriaActivity.class);
                startActivity(i);
                break;

            case R.id.mnuPaises:
                i = new Intent(getApplicationContext(),PaisesActivity.class);
                i.putExtra("name","jhonier");
                i.putExtra("doc","1334");
                startActivity(i);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnMatematicas:

                Intent i = new Intent(getApplicationContext(),MatematicasActivity.class);
                startActivity(i);
                break;
        }
    }
}