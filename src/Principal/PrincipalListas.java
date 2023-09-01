package Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import screenmatch.Filme;
import screenmatch.Serie;
import screenmatch.Titulo;

public class PrincipalListas {

	public static void main(String[] args) {
		
		
		Filme meuFilme = new Filme("poderoso chefao", 1970); 
		meuFilme.avalia(5);
		
		Serie fera = new Serie("A bela e a Fera", 1981);
		fera.avalia(5);
		Filme outroFilme = new Filme("Cinderela", 1995); 
		outroFilme.avalia(8);
		
		Filme filmeDoPaulo = new Filme("Enrolados", 2021);
		filmeDoPaulo.avalia(10);
		
		//variaveis de referencia, nao tou criando outro objeto , estou tentando chegar no meu objeto
		
		Filme f1 = filmeDoPaulo;
		
		f1.setnome("Maria");
		
		//tive que colocar titulo porque ele nao estava reconhecendo a minha serie, entao coloquei a classe mae
		List<Titulo> listaDeAssistidos = new LinkedList<>();
		listaDeAssistidos.add(filmeDoPaulo);
		listaDeAssistidos.add(meuFilme);
		listaDeAssistidos.add(outroFilme);
		listaDeAssistidos.add(fera);
		listaDeAssistidos.add(f1);
		
		
		//iterando a minha lista
		//para cada item da minha lista
		//loop foreach
		for (Titulo item : listaDeAssistidos ) {
			System.out.println(item.getnome());
			
			//criamos um if para verificar se aquele item é um filme mesmo
			//instanceof para verificar se um objeto é um determinado tipo
			if(item instanceof Filme filme) {
				System.out.println("Classificacao" + filme.getClassificacao());
			}
			}
			
			//preciso dizer que ele vem de filme, porque so tem classificacao no filme
			//entao estou falando quando for filme ele vai pegar a classificacao
			//e que esse item é um filme
			

		//ordenando listas
		
		ArrayList<String> buscaPorArtista = new ArrayList<>();
			buscaPorArtista.add("Adam Sandler");
			buscaPorArtista.add("Paulo");
			buscaPorArtista.add("Jaqueline");
			
			Collections.sort(buscaPorArtista);
			System.out.println(buscaPorArtista);
			
			//usando comparable, vou na minha classe mae titulo e dizer que ele implementa
			
			
			Collections.sort(listaDeAssistidos);
			System.out.println(listaDeAssistidos);
			
			//ordenando pelo ano de lancamento -- estamos sinalizando que para todo Titulo recebido o getAnoDeLancamento deve ser usado como critério de comparação.
			
			listaDeAssistidos.sort(Comparator.comparing(Titulo::getanoDeLancamento));
			System.out.println(listaDeAssistidos);
		
	}

}
