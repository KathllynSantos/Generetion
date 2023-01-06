package POO;

public class GamesTeste {

	public static void main(String[] args) {
		
		  
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