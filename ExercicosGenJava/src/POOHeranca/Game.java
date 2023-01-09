package POOHeranca;

public class Game {
	private String nomeDojogador;
	
	
	
	

	public Game(String nomeDojogador) {
		super();
		this.nomeDojogador = nomeDojogador;
	}

	public String getNomeDojogador() {
		return nomeDojogador;
	}

	public void setNomeDojogador(String nomeDojogador) {
		this.nomeDojogador = nomeDojogador;
	}
	
	public void imprimirInfo() {
		
		  System.out.println("\t\t\t**Olá Jogador(a) " +getNomeDojogador());
}
}
	
	
