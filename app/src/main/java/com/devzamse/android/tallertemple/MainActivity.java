package com.devzamse.android.tallertemple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usuario, contrasena, celular;
    Button login;
    String user, pass;
    TextView hack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = findViewById(R.id.usuario);
        contrasena = findViewById(R.id.contrasena);
        celular = findViewById(R.id.celular);
        login = findViewById(R.id.login);
        hack = findViewById(R.id.hack);

        ClickLogin();

    }

    private void ClickLogin() {
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                user = usuario.getText().toString();
                pass = contrasena.getText().toString();

                if(user.equals("temple1") && pass.equals("abc") && celular.getText().toString().equals("1")){
                    Intent a = new Intent(MainActivity.this, broma.class);
                    startActivity(a);
                } else {
                    hack.setText(user+" "+pass);
                    Toast.makeText(MainActivity.this, "Dejame hackear", Toast.LENGTH_SHORT).show();
                }

//                Toast.makeText(MainActivity.this, user+" "+pass , Toast.LENGTH_SHORT).show();
                Log.e("Usuario: ", user);
                Log.e("Pass: ", pass);
                Log.e("Celular: ", celular.getText().toString());
            }
        });
    }
}
