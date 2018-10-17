package br.com.digitalhouse.digitalapp.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import br.com.digitalhouse.digitalapp.Model.Post;
import br.com.digitalhouse.digitalapp.R;
import br.com.digitalhouse.digitalapp.adapter.RecyclerViewPostAdapter;
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

        if (context instanceof PostClicado) {

            listener = (PostClicado) context;

        } else {
            throw new ClassCastException("A activity não é uma instancia de Post Clicado");
        }

        PostClicado listener = (PostClicado) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_posts_fragments, container, false);

        setupRecyleView(view);

        return view;

    }


    private void setupRecyleView(View view) {
        RecyclerView recyclerView = view.findViewById(R.id.recycleview_post_id);

        RecyclerViewPostAdapter adapter = new RecyclerViewPostAdapter(creatPostList());

        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));



    }

    private List<Post> creatPostList() {
        List<Post> postList = new ArrayList<>();
        Post post = new Post();
        post.setTitulo("Nova Turma Iniciada");
        post.setDescricao("em outubro iniciou nova turma");

        postList.add(post);


    return postList;
    }

}



