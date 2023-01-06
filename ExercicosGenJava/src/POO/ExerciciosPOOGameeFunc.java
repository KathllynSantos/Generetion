package POO;

public class ExerciciosPOOGameeFunc {

	public static void main(String[] args) {
		public class Funcionario {

			private String funcionarioContratar;
		    private String setorAtuacao;
		    private int horasMensais;
		    private String salario;
		    
		    // método construtor

			public Funcionario(String funcionarioContratar, String setorAtuacao, int horasMensais, String salario) {
				this.funcionarioContratar = funcionarioContratar;
				this.setorAtuacao = setorAtuacao;
				this.horasMensais = horasMensais;
				this.salario = salario;
			}


			public String getFuncionarioContratar() {
				return funcionarioContratar;
			}


			public void setFuncionarioContratar(String funcionarioContratar) {
				this.funcionarioContratar = funcionarioContratar;
			}


			public String getSetorAtuacao() {
				return setorAtuacao;
			}


			public void setSetorAtuacao(String setorAtuacao) {
				this.setorAtuacao = setorAtuacao;
			}


			public int getHorasMensais() {
				return horasMensais;
			}


			public void setHorasMensais(int horasMensais) {
				this.horasMensais = horasMensais;
			}


			public String getSalario() {
				return salario;
			}


			public void setSalario(String salario) {
				this.salario = salario;
			}
		    
			public void imprimirInfo() {
			
				  System.out.println("\nNome: "+funcionarioContratar+" Profissão: " +setorAtuacao+" Horas trabahadas: "+horasMensais+  " horas Salário: " +salario+"");
			}
		}
		
			Funcionario contratado = new Funcionario ("Kathllyn Leticia Santos","Desenvolvedora Full Stack Java Jr",42,"6900");
			contratado.imprimirInfo();
			
			System.out.println("\nFuncionaria Promovida");
			
			
			System.out.println("\nVaga da promoção");
			contratado.setSetorAtuacao("Desenvolvedora Full Stack Pleno");
			//contratado.imprimirInfo();
			System.out.println(contratado.getSetorAtuacao());
					
			System.out.println("\nAlteração Sálario ");
			System.out.println();
			contratado.setSalario("10.000");
			//contratado.imprimirInfo();
			System.out.println("Para:R$ "+contratado.getSalario());
			
			contratado.imprimirInfo();
		}
	
}
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
	


	{
		Games loja = new Games ("matutenção ","Xbox S "," Assassins Creed","controle","Mariana");
		loja.imprimirInfo();
			
		
		
		System.out.println("\nPromoções!!!");
		
		System.out.println("\nConsoles:");
		loja.setConsole("Xbox S e Ps5");
		System.out.println(loja.getConsole());
		
		System.out.println("\nControles:");
		loja.setControle("Original e Paralelo");
		System.out.println(loja.getControle());
		
		System.out.println("\nJogos:");
		loja.setJogo("Minecraft, Mortal Kombat 11, The King of Figthers e The Last of us.");
		System.out.println(loja.getJogo());
		
		System.out.println("\nFale com a melhor vendedora");
		loja.setVendedor("\tMariana");
		System.out.println(loja.getVendedor());
}

}





	



