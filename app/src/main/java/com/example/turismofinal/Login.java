package com.example.turismofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    //ATRIBUTOS DE LA CLASE
    EditText cajaNombreUsuario;
    EditText cajaContrasena;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        cajaNombreUsuario=findViewById(R.id.nombreusuario);
        cajaContrasena=findViewById(R.id.passworUsuario);

    //capturando datos de las cajas (Edittext)
        String nombreUsuario=cajaNombreUsuario.getText().toString();
        String Contrasena=cajaContrasena.getText().toString();

    }
}