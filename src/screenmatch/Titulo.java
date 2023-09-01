package screenmatch;

public class Titulo implements Comparable<Titulo> {
	//entao pra eu deixar uma outra classe de outro pacote usar meu atributos terei que colocar que ele é public,
	//e os metodos tambem
		private String  nome;
		private int anoDeLancamento;
		private boolean incluidoNoPlano;
		private double somaDasAvaliacoes; //colocando o private estou encapsulando o meu somaAVAlicoes
		private int totalAvaliacao;
		private int duracaoEmMinutos;
		//quando uso o private a pessoa nao pode nem atribuir e nem modificar , por isso eu faco um get
		//criando os metodos
		//Existem quatro tipos de modificadores de acesso em Java: public, protected, private e default (também conhecido como package-private).
		
		//quero so que a pessoa veja nao modifique nada, pois o meu atributo é privado
		//getters(buscar valores), setters(modificar valores)
		
		//construtor
		//obs: nao existe heranca de construtores
		
		public Titulo(String nome, int anoDeLancamento) {
			this.nome = nome;
			this.anoDeLancamento = anoDeLancamento;
		}
		
		public String getnome() {
			return nome;
		}
		
		public boolean getincluidoNoPlano() {
			return incluidoNoPlano;
		}
		
		public int getanoDeLancamento() {
			return anoDeLancamento;
		}
		
		public int gettotalAvaliacao() {
			return totalAvaliacao;
		}
		
		public int getduracaoEmMinutos() {
			return duracaoEmMinutos;
		}
		
		//“This”, traduzindo para o português (Isto/este/esta), é usado para fazer referência aos atributos da classe, especialmente em métodos que têm parâmetros com o mesmo nome do atributo da classe em que estamos trabalhando.
		
		
		public void setnome(String nome) {
			this.nome = nome; 
		}
		
		public void setanoDeLancamento(int ano) {
			this.anoDeLancamento = ano;
		}
		
		public void setduracaoEmMinutos(int Minutos) {
			this.duracaoEmMinutos = Minutos;
		}
		
		public void exibiFichaTecnica() {
			System.out.println("o nome do filme e " + nome);
			System.out.println("ano de lancamento"+ anoDeLancamento);
			
		}
		
		public void avalia(double nota) {
			somaDasAvaliacoes += nota;
			totalAvaliacao += 1;
		}
		//meu retorno agora vai ser double
		public double pegaMedia() {
			return somaDasAvaliacoes / totalAvaliacao;
		}
		
		//assinei o contrato tenho que implementar
		//sobre a implementacao que fiz 
		@Override
		public int compareTo(Titulo outroTitulo) {
								//estou comparando o meu titulo com outro nome do titulo
			return this.getnome().compareTo(outroTitulo.getnome());
		}
		
		

	}

