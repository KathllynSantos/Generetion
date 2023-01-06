package POO;


public class FuncionarioContratado {

	public static void main(String[] args) {
		
						
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
