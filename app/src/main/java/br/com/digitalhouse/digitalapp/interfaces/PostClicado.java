package br.com.digitalhouse.digitalapp.interfaces;

import br.com.digitalhouse.digitalapp.Model.Post;

public interface PostClicado {

    void onButtonClick(String texto);

    void onButtonClick(Post post);
}
