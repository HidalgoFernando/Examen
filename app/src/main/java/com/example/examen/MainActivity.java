package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private TextView persona;
    private TextView incorrecto;
    private Button btn1;

    String VerficacionNombre = "Ricardo123";
    String VerficacionContrasena = "Ricardo123";
    int intentos = 3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Name = (EditText) findViewById(R.id.name);
        Password = (EditText) findViewById(R.id.password);
        persona = (TextView) findViewById(R.id.Usuario);
        incorrecto = (TextView) findViewById(R.id.Mensaje);
        btn1 = (Button) findViewById(R.id.btn);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Nombre = Name.getText().toString() ;
                String Constrasena = Password.getText().toString() ;

                if(Nombre.equals(VerficacionNombre) && Constrasena.equals(VerficacionContrasena)){
                    Intent logeado = new Intent(getApplicationContext(), MainActivity2.class);
                    startActivity(logeado);
                }else {

                    if(intentos >= 3) {
                        intentos = intentos - 1;
                        String mensaje = "Te quedan solo: " + (intentos);
                        incorrecto.setText(mensaje + "");
                        if(intentos < 1){
                            String ultimo = "ya no te quedan mas intentos";
                            incorrecto.setText(ultimo + "");
                            btn1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent denegado = new Intent(getApplicationContext(), MainActivity.class);
                                    startActivity(denegado);
                                }
                            });
                        }

                    }
                }
            }
        });

    }



}