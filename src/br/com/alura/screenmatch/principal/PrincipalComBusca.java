package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;//biblioteca Gson para converter um json em um objeto Javabiblioteca Gson para converter um json em um objeto Java
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Optional;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um filmme para busca: ");
        var busca = leitura.nextLine();

        String endereco = "https://www.omdbapi.com/?t="+ busca + "&apikey=8461952f";//coloca o endereço que vou usar


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        /*Gson gson = new Gson();
        //Titulo meuTitulo = gson.fromJson(json, Titulo.class);
        TituloOmdb meuTitulo = gson.fromJson(json, TituloOmdb.class);
        System.out.println(meuTitulo);*/


        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println(meuTituloOmdb);
        Titulo meuTitulo = new Titulo(meuTituloOmdb);
        System.out.println("Titulo já conmvertido");
        System.out.println(meuTitulo);

        //String jsonRepresentation = gson.toJson(someObject);
        //System.out.println(jsonRepresentation);
    }

}
