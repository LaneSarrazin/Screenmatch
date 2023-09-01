package calculos;

public class Recomendacao {
	private String recomenda;
	
	public void filtro(Classificacao classificacao) {
		if(classificacao.getClassificacao() >= 4) {
			System.out.println("esta entre os preferidos no momento!");
		}else if(classificacao.getClassificacao() >= 2) {
			System.out.println("muito bem avaliado no momento!");
		}else {
			System.out.println("assista depois");
		}
	}
}
