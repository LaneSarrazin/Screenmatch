package calculos;

import screenmatch.Filme;
import screenmatch.Titulo;

public class CalculadoraTempo {
	private int tempoTotal = 0;
	
	
	public int gettempoTotal() {
		return tempoTotal;
	}
	
	
	//nao precisei usar o set, porque nesse caso quero que a calculadora some, nao quero jogar o tempo. 
	/*public void inclui(Filme f) {
		tempoTotal+= f.getduracaoEmMinutos();
	}*/
	//estou fazendo um metodo para que eu nao precise ficar copiando e colando, 
	//entao fiz um metodo titulo, porque dentro dele tem o filme e a serie, onde todos os filhos de titulo serao aceitos
	//estou usando o polimorfismo ()
	
	public void inclui(Titulo titulo) {
		System.out.println("adicionando duracao em minutos de " + titulo);
		this.tempoTotal += titulo.getduracaoEmMinutos();
	}
}
