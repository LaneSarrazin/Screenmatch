package screenmatch;


public class Serie extends Titulo {
		private int temporadas;
		private boolean ativa;
		private int episodiosPorTemporada;
		private int minutosPorEpisodio;
		
		//como a minha classe mae esta com  o construtor preciso tambem passar o construtor aqui tambem 
		
		public Serie(String nome, int anoDeLancamento) {
			super(nome, anoDeLancamento);	
			
		}
		
		
		public int gettemporadas() {
			return temporadas;
		}
		
		public void settemporadas(int Temporadas) {
			this.temporadas = Temporadas;
		}
		
		public int getepisodiosPortemporada() {
			return  episodiosPorTemporada;
		}
		
		public void setepisodiosPortemporada(int episodiosPorTemporada){
			this.episodiosPorTemporada = episodiosPorTemporada ;
		}
		
		public int getminutosPorEpisodio() {
			return minutosPorEpisodio;
		}
		
		public void setminutosPorEpisodio(int minutosPorEpisodio) {
			this.minutosPorEpisodio = minutosPorEpisodio;
		}
		//sobescrevendo o metodo getduracaominutos de titulo usando @Override(overraidi)
		//estou alterando o comportamento de um metodo da super mae da super classe 
		@Override
		public int getduracaoEmMinutos() {
			return temporadas * episodiosPorTemporada * minutosPorEpisodio;
		}
		
		@Override
		public String toString() {
			return "Serie: " + this.getnome() + "(" + this.getanoDeLancamento() + ")";
		}
}
