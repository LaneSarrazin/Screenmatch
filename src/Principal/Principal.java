package Principal;

import java.util.ArrayList;

import calculos.CalculadoraTempo;
import calculos.Recomendacao;
import screenmatch.Episodio;
import screenmatch.Filme;
import screenmatch.Serie;

//import screenmatch.Filme;

public class Principal{

	public static void main(String[] args) {
		Filme meuFilme = new Filme("poderoso chefao", 1970); 
		//mas a parte na direita é onde criamos o espaço na memória, e na esquerda estamos informando a necessidade de uma variável que saiba referenciar um objeto do tipo Filme
		//meuFilme.setnome("poderoso chefao"); nao preciso mais porque criei um construtor 
		//meuFilme.setanoDeLancamento(1970); porque agora estou usando o construtor da classe mae
		meuFilme.setduracaoEmMinutos(180);
		meuFilme.getincluidoNoPlano();
		
		meuFilme.exibiFichaTecnica();
		meuFilme.avalia(8);
		meuFilme.avalia(5);
		meuFilme.setdiretor("Marcos");
		
		Serie fera = new Serie("A bela e a Fera", 1981);
		
		//fera.setnome("A bela e fera");
		fera.settemporadas(10);
		fera.setepisodiosPortemporada(10);
		fera.setminutosPorEpisodio(50);
		
		
		System.out.println("esse é : " +meuFilme.getdiretor());
		System.out.println("esse é : " +fera.getnome());
		
		System.out.println("duracao para maratonar Fera " +fera.getduracaoEmMinutos());
		
		Filme outroFilme = new Filme("Cinderela", 1995); 
		//outroFilme.setnome("Cinderela");
		//outroFilme.setanoDeLancamento(1995);
		outroFilme.setduracaoEmMinutos(200);
		
		CalculadoraTempo calculadora = new CalculadoraTempo();
		
		calculadora.inclui(meuFilme);
		System.out.println(calculadora.gettempoTotal());
		
		calculadora.inclui(outroFilme);
		System.out.println(calculadora.gettempoTotal());
		
		//em interfaces nao conseguimos dar New nao vai compilar!
		//por isso nao conseguimos dar um new Classificacao
		
		Recomendacao filtro = new Recomendacao();
		
		filtro.filtro(meuFilme);
		
		Episodio episodio = new Episodio();
		
		episodio.setnumero(1);
		episodio.settotVisu(300);
		
		filtro.filtro(episodio);
		
		//voce pode usar a palavra var (realiza uma inferencia do tipo declarado)
		//var filmeDoPaulo = new Filme();
		
		Filme filmeDoPaulo = new Filme("Enrolados", 2021);
		//filmeDoPaulo.setnome("Enrolados");
		filmeDoPaulo.setduracaoEmMinutos(200);
		//filmeDoPaulo.setanoDeLancamento(2021);
		filmeDoPaulo.avalia(10);
		
		//trabalhando com lista
		
		ArrayList<Filme> listaDeFilmes = new ArrayList<>();
		//adicionado os filme
		
		listaDeFilmes.add(filmeDoPaulo);
		listaDeFilmes.add(meuFilme);
		listaDeFilmes.add(outroFilme);
		//vendo o tamanho da minha array(quantos elementos foram adicionados)
		System.out.println("tamanho da lista " + listaDeFilmes.size());
		//exibindo o nome do primeiro filme, nao esquece de colocar a posicao que voce deseja
		System.out.println("toString do Filme:  " + listaDeFilmes.get(0).toString());
		System.out.println("primeiro filme " + listaDeFilmes.get(0).getnome());
		System.out.println(listaDeFilmes);
		
		
		
		
	
		
		
		
		
		
		
		
	
		
	}

}
