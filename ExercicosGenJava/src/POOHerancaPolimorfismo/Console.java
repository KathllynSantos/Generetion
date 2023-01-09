package POOHerancaPolimorfismo;

public class Console extends Game {
	

	private String nomeConsole;
	

	public Console(String nomeDojogador, String nomeConsole) {
		super(nomeDojogador);
		this.nomeConsole = nomeConsole;
			
	}


	public String getNomeConsole() {
		return nomeConsole;
	}


	public void setNomeConsole(String nomeConsole) {
		this.nomeConsole = nomeConsole;
	}

	public void visualiza() {
	
		
		System.out.println("\n\t\t\tVocê esta jogando no Console" +getNomeConsole());
	
	}
}

	
	
	
	
	