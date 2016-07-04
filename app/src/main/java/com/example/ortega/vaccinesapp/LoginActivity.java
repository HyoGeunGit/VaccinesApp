package com.example.ortega.vaccinesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    Button btnLogin;
    EditText etAfiliacion, etPassword;
    Paciente paciente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        iniciarComponentes();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    private void iniciarComponentes(){
        btnLogin = (Button) super.findViewById(R.id.buttonLogin);
        etAfiliacion = (EditText) super.findViewById(R.id.etNumAfiliacion);
        etPassword = (EditText) super.findViewById(R.id.etPassword);
    }
}
