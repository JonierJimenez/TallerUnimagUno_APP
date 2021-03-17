package com.example.tallerunimaguno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MatematicasActivity extends AppCompatActivity implements View.OnClickListener {

    EditText n1, n2;
    RadioGroup operacion;
    RadioButton suma, multi, potencia;
    Button calcular, borrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas);
        n1 = findViewById(R.id.edtn1);
        n2 = findViewById(R.id.edtn2);
        operacion = findViewById(R.id.rgOperacion);
        calcular= findViewById(R.id.btnCalcular);
        borrar = findViewById(R.id.btnBorrar);

        calcular.setOnClickListener(this);
        borrar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnCalcular:

                if(validar()){
                    Toast.makeText(getApplicationContext(),"dentro",Toast.LENGTH_LONG).show();
                    float num1 = Float.parseFloat(n1.getText().toString());
                    float num2 = Float.parseFloat(n2.getText().toString());
                    int id = operacion.getCheckedRadioButtonId();
                    switch (id){
                        case R.id.rbtSuma:
                            Toast.makeText(getApplicationContext(),"La suma es"+ (num1+num2),Toast.LENGTH_LONG).show();
                            break;

                        case R.id.rbtMult:
                            Toast.makeText(getApplicationContext(),"La Multiplicacio es"+ (num1*num2),Toast.LENGTH_LONG).show();
                            break;

                        case R.id.rbtPotencia:
                            Toast.makeText(getApplicationContext(),"La potencia es"+ Math.pow(num1,num2),Toast.LENGTH_LONG).show();
                            break;

                        case R.id.rbtDivi: Toast.makeText(getApplicationContext(),"la division es "+ (num1/num2),Toast.LENGTH_LONG).show();
                            break;
                    }//switch
                }else{
                    Toast.makeText(getApplicationContext(),"no valido",Toast.LENGTH_LONG).show();
                }
                break;

            case R.id.btnBorrar: borrar();
                break;
        }
    }

    public  void  borrar(){
        n1.setText("");
        n2.setText("");
    }
//|| TextUtils.isDigitsOnly(n1.getText().toString())
    public boolean validar(){
       if(TextUtils.isEmpty(n1.getText().toString())){
            Toast.makeText(getApplicationContext(),"dentro del if de validar",Toast.LENGTH_LONG).show();
            return  false;
        }
        else {
//|| TextUtils.isDigitsOnly(n2.getText().toString())
            if (TextUtils.isEmpty(n2.getText().toString()) ){
                return false;
            } else{
                return true;
            }
        }

    }




}//clase