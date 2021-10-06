package com.example.evaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usuario;
    EditText Clave;
    Button Inicio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText usuario=(EditText) findViewById(R.id.id_usuario);
        EditText Clave=(EditText) findViewById(R.id.id_clave);
        Inicio =(Button) findViewById(R.id.id_btn);
        Inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (usuario.getText().toString().equals("adm123") && Clave.getText().toString().equals("adm123")){
                        Intent I = new Intent(getApplicationContext(),activity_2.class);
                        startActivity(I);
                }else {
                    Toast.makeText(getApplicationContext(),"USUARIO O CONTRASEÑA INCORRECTA", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}