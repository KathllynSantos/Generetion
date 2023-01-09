package POOHerancaPolimorfismo;

public class ExercicioPooHerancaePolimorfismo {

	public static void main(String[] args) {
		
	}
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
		
			public class Jogo extends Game{
				
				private String jogo;
				private int lancamento;
				private String tipo;
				private String classificacao;
				

				public Jogo(String nomeDojogador, String jogo, int lancamento, String tipo, String classificacao) {
					super(nomeDojogador);
					this.jogo = jogo;
					this.lancamento = lancamento;
					this.tipo = tipo;
					this.classificacao = classificacao;
					
					
				}
				public String getjogo() {
					return jogo;
				}
				public void setNome(String jogo) {
					this.jogo = jogo;
				}
				public int getLancamento() {
					return lancamento;
				}
				public void setLancamento(int lancamento) {
					this.lancamento = lancamento;
				}
				public String getTipo() {
					return tipo;
				}
				public void setTipo(String tipo) {
					this.tipo = tipo;
				}
				public String getClassificacao() {
					return classificacao;
				}
				public void setClassificacao(String classificacao) {
					this.classificacao = classificacao;
				}
				
				public void visualiza() {
					
					System.out.println("\n\t\tVocê está jogando " +getjogo());
					System.out.println("\n\t\t\t\tLançado em: " +getLancamento());
					System.out.println("\n\t\tEste é um jogo de " +getTipo() + " e  a classificação " + getClassificacao());
				
				}
				
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
			public class TestaGame {
					
			public static void main(String[] args) {
						
						  
			Game jessica = new Game("Jessica!**");
			jessica.imprimirInfo();
			Jogo creed = new Jogo ("","Assasins Creed Valhalla", 2020,"RPG Ação","18 anos");
			creed.visualiza();
			Console xbox = new Console ("", "Xbox Series S");
			xbox.visualiza();
			}
			}
			}
		}
}
		
			
		


	


