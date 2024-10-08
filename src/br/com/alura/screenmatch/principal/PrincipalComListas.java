package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderosochefão",1970);
        meuFilme.avalia(8);

        Filme meuFilme2 = new Filme("Velozes e furiosos", 2015);
        meuFilme2.avalia(9);

        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(8);

        Serie lost = new Serie("Lost", 2000);


        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(meuFilme2);
        lista.add(lost);
        for (Titulo item: lista){
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: "+filme.getClassificacao());
            }

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Joana");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("depois: "+ buscaPorArtista);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenadas: "+ lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

    }
}
