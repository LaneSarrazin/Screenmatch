package Principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import screenmatch.Titulo;
import screenmatch.TituloOMDB;


public class PrincipalComBusca {

	public static void main(String[] args) throws IOException, InterruptedException {

		 Scanner leitura = new Scanner(System.in);
		 System.out.println("Digite um filme para busca: ");
		 var busca = leitura.nextLine(); //tou criando uma variavel para ela concatenar o que a pessoa digitou com o nome do filme
		 
		 String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=6585022c";
		
		 HttpClient client = HttpClient.newHttpClient();
		   HttpRequest request = HttpRequest.newBuilder()
		         .uri(URI.create(endereco))
		         .build();
		   
		   HttpResponse<String> response = client
				     .send(request, BodyHandlers.ofString()); 
		   
		  // System.out.println(response.body()); //quero exibir o corpo da resposta
		   String json = response.body();
		   System.out.println(json);
		   
		   //transformando json em objeto
		   
		 Gson gson = new GsonBuilder()
				 .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
	                .create();
		  //Titulo meuTitulo = gson.fromJson(json, Titulo.class); //aqui quero transformar esse json em titulo .class
		  //System.out.println("Titulo : " + meuTitulo.getnome());
		 
		 TituloOMDB meuTituloOMDB = gson.fromJson(json, TituloOMDB.class);
		  System.out.println(meuTituloOMDB);
		  
		  Titulo meuTitulo = new Titulo(meuTituloOMDB);
		  System.out.println(meuTitulo);
	}
}
