package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo titulo){
        //System.out.println("Adicionando duração em minutos de: "+ titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

   /*em vez de criar um metodo para filme e outro pra series, criei um só para titulo que é a superclasse dos dois
   public void inclui(Filme f){
        this.tempoTotal += f.getDuracaoEmMinutos();
    }
    public void inclui(Serie s){
        this.tempoTotal += s.getDuracaoEmMinutos();
    }*/




}
