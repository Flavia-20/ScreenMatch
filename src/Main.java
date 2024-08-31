import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Epsodios;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(5);
        meuFilme.avalia(6);
        meuFilme.avalia(8);

        /*System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacao);*/

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacao());
        //System.out.println("media: " + meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(15);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar lost "+ lost.getDuracaoEmMinutos());

        Filme meuFilme2 = new Filme();
        meuFilme2.setNome("Velozes e furiosos");
        meuFilme2.setAnoDeLancamento(2015);
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











    }
}