package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderosochefão",1970);
        meuFilme.avalia(8);

        Filme meuFilme2 = new Filme("Velozes e furiosos", 2015);
        meuFilme2.avalia(9);

        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(8);

        Serie lost = new Serie("Lost", 2000);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(meuFilme2);
        lista.add(lost);
        for (Titulo item: lista){
            System.out.println(item.getNome());
            Filme filme = (Filme) item;
            System.out.println("Classificação: "+filme.getClassificacao());
        }



    }
}
