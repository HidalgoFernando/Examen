package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    private EditText nuevaContra;
    private EditText ConfirmaContra;
    private Button btn2;
    private ImageView neutro;
    private ImageView listo;
    private ImageView denegado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nuevaContra = (EditText) findViewById(R.id.Nueva);
        ConfirmaContra = (EditText) findViewById(R.id.Repetir);
        btn2 = (Button) findViewById(R.id.Confirmar);
        neutro = (ImageView) findViewById(R.id.Neutral);
        listo = (ImageView) findViewById(R.id.Confirmado);
        denegado= (ImageView) findViewById(R.id.Denegado);


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nuevaContra.equals(ConfirmaContra)) {

                }
            }
        });
    }

}