package screenmatch;

import calculos.Classificacao;

public class Episodio implements Classificacao {
	private int numero;
	private String nome;
	private Serie serie;
	private int totVisu;


	public int getnumero() {
	return numero;
	}
	
	public void setnumero(int numero) {
		this.numero = numero;
	}
	
	public String getnome() {
		return nome;
	}
	
	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public int settotVisu(int totVisu) {
		return totVisu;
	}
	
	public int gettotVisu() {
		return totVisu;
	}
	
	
	@Override
	public int getClassificacao() {
		if(totVisu > 100) {
			return 4;
		}else {
			return 2;
		}
		
	}
}