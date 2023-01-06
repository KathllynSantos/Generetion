package POO;

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
