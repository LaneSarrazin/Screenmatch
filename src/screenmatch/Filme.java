package screenmatch;

import calculos.Classificacao;

//quando uso extends ele esta herdando da classe titulo tudo que ela tem
public class Filme extends Titulo implements Classificacao {
	private String diretor;
	//metodo construtor recebe o mesmo nome da sua classe
	//criando um construtor, ele recebe 
	
	public Filme (String nome, int anoDeLancamento ) {
		//super();
		//vou inicializar o meu atributo, ele vai receber o nome que vai estar recebendo nessa string
		super(nome, anoDeLancamento); 
		
		//O construtor tem uma sintaxe bem específica: ele tem obrigatoriamente nome da própria classe e não retorna nada.
	}
		
	
	public String getdiretor() {
		return diretor;
	}
	
	public void setdiretor(String diretor) {
		this.diretor = diretor;
	}
	
	//se eu disse que quero implementar a interface classificacao , tenho por obrigacao ter o getClass
	@Override
	public int getClassificacao() {
		//estou fazendo um castinsg
		return (int) pegaMedia() / 2;
	}

	//reescrevendo o toString do filme
	@Override
	public String toString() {
		//por padrao ele devolve o que a mae devolve
		//return super.toString();
		return "Filme: " + this.getnome() + " (" + this.getanoDeLancamento() + " )";
				
				
	}
}


