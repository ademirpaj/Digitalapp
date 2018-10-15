package br.com.digitalhouse.digitalapp.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import br.com.digitalhouse.digitalapp.Model.Post;
import br.com.digitalhouse.digitalapp.R;
import br.com.digitalhouse.digitalapp.interfaces.PostClicado;

/**
 * A simple {@link Fragment} subclass.
 */
public class PostsFragments extends Fragment {

    private PostClicado listener;



    public PostsFragments() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (context instanceof  PostClicado){

            listener = (PostClicado) context;

        }else {
            throw  new ClassCastException("A activity não é uma instancia de Post Clicado");
        }

        PostClicado listener = (PostClicado) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_posts_fragments, container, false);
        Button botaoDetalhe = view.findViewById(R.id.bt_details);
        botaoDetalhe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Post post = new Post();
                post.setTitulo("Tidulo post");
                post.setAutor("Autor 1");
                post.setImagem("www.google.com/imagex");
                listener.onButtonClick(post);
            }


        });


return view;
}

    }


}
