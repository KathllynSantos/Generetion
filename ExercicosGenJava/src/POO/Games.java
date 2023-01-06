package POO;

public class Games {
	
	private String Manutencao;
	private String Console;
	private String Jogo;
	private String Controle;
	private String Vendedor;
	private String Cliente;
	



	public Games(String manutencao, String console, String jogo, String controle, String vendedor) {
		super();
		Manutencao = manutencao;
		Console = console;
		Jogo = jogo;
		Controle = controle;
		Vendedor = vendedor;
		
	}




	public String getManutencao() {
		return Manutencao;
	}




	public void setManutencao(String manutencao) {
		Manutencao = manutencao;
	}




	public String getConsole() {
		return Console;
	}




	public void setConsole(String console) {
		Console = console;
	}




	public String getJogo() {
		return Jogo;
	}




	public void setJogo(String jogo) {
		Jogo = jogo;
	}




	public String getControle() {
		return Controle;
	}




	public void setControle(String controle) {
		Controle = controle;
	}




	public String getVendedor() {
		return Vendedor;
	}




	public void setVendedor(String vendedor) {
		Vendedor = vendedor;
	}




	public String getCliente() {
		return Cliente;
	}






	public void imprimirInfo() {
		
		  System.out.println("\n\t\t\t\t Comprando um " +Console+ " você ganha um " +Controle+ " e fazendo\n\t " +Manutencao+ " mensal você ganha um jogo" +Jogo+ ". Venha conferir mais informações com a nossa vendedora " +Vendedor+ ".");
		  
		
	
	}
}
