package POOHeranca;

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
	
	}
	
	