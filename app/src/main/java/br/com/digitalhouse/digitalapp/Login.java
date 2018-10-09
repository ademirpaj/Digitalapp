package br.com.digitalhouse.digitalapp;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    public  final static  String EMAIL = "chave email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void loginclicado(View view) {

        Intent intent = new Intent(this, MainActivity.class);
         Bundle bundle = new Bundle();
        TextInputEditText idpassword = findViewById(R.id.id_password);
        TextInputEditText emailDigitado = findViewById(R.id.edit_text_email_id);
         bundle.putString("chave email", emailDigitado.getText().toString() );
         bundle.putString("password ", idpassword.getText().toString());
         intent.putExtras(bundle);

        startActivity(intent);

    }
}
