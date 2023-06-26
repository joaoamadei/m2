package com.example.imoliaria2023;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editNome);
        btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                enviarMSG();

            }
        });
    }
    public void enviarMSG()
        {
            AlertDialog.Builder MSG = new AlertDialog.Builder(this);
            MSG.setMessage( "olá" + editText.getText().toString() + "! Seu Cadastro Foi Realizado Com Sucesso!");
            MSG.show();
        }
}
