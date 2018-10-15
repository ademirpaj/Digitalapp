package br.com.digitalhouse.digitalapp;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import br.com.digitalhouse.digitalapp.fragments.EventosFragment;
import br.com.digitalhouse.digitalapp.fragments.PeopleFragment;
import br.com.digitalhouse.digitalapp.fragments.PostDetailsFragment;
import br.com.digitalhouse.digitalapp.fragments.PostsFragments;
import br.com.digitalhouse.digitalapp.interfaces.PostClicado;

public class MainActivity extends AppCompatActivity implements PostClicado {
    PostDetailsFragment  detailsFragment = new PostDetailsFragment();

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

    @Override
    public void onButtonClick(String titulo) {
        Toast.makeText(this, titulo, Toast.LENGTH_SHORT).show();

        Bundle bundle = new Bundle();
        bundle.putString("POST_TITLE",titulo );

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        detailsFragment.setArguments(bundle);
        transaction.replace(R.id.container_id, this.detailsFragment);
        transaction.commit();

    }
}
