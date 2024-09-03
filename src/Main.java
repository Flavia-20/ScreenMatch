package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Epsodios;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderosochefão",1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(5);
        meuFilme.avalia(6);
        meuFilme.avalia(8);

        /*System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacao);*/

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacao());
        //System.out.println("media: " + meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(15);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar lost "+ lost.getDuracaoEmMinutos());

        Filme meuFilme2 = new Filme("Velozes e furiosos", 2015);
        meuFilme2.setDuracaoEmMinutos(150);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(meuFilme2);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);
        filtro.filtra(meuFilme2);

        Epsodios episodio = new Epsodios();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVsiualisacoes(300);
        filtro.filtra(episodio);

        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(meuFilme2);
        System.out.println("\nTamanho da lista: "+ listaDeFilmes.size());
        System.out.println("Primerio filme: "+listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("Primerio filme: "+listaDeFilmes.get(0).toString());
        //agora com o toStringo aparece os nomes dos filmes pq eu reescrev ele na classe Filme









    }
}