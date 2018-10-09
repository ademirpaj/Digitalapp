package br.com.digitalhouse.digitalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         TextView texto =  findViewById(R.id.textoprincipal);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();


        String emailDigitado = bundle.getString(Login.EMAIL);

        texto.setText(emailDigitado);

    }
}
