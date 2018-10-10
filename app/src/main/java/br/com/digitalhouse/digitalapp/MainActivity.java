package br.com.digitalhouse.digitalapp;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import br.com.digitalhouse.digitalapp.fragments.EventosFragment;
import br.com.digitalhouse.digitalapp.fragments.PeopleFragment;
import br.com.digitalhouse.digitalapp.fragments.PostsFragments;

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

    public void exibiPosts(View view) {
        FragmentManager manager = getSupportFragmentManager();
         FragmentTransaction transaction = manager.beginTransaction();
         transaction.replace(R.id.container_id, new PostsFragments());
         transaction.commit();
    }

    public void exibirPessoas(View view) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container_id, new PeopleFragment());
        transaction.commit();


    }



    public void exibirEventos(View view) {

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container_id, new EventosFragment());
        transaction.commit();
    }
}
