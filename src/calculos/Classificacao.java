package calculos;

public interface Classificacao {
	
	//aqui dentro vou definir qual metodo que quero que seja comum as classes que eu quiser
	int getClassificacao(); //aqui nao abro chaves , aqui so falo o que quero fazer
	//quem utilizar a interface classificacao  vai precisar usar o getClassificacao
	
	//Que numa interface todos os métodos são públicos, não sendo então necessário utilizar a palavra reservada public na declaração deles;
}
