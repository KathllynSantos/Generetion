package LacosdeRepeticao;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		int idade,genero,categoria,qtdBack=0,qtdMFront=0,qtdHMobile40=0,qtdMFullStack30=0;
		String op = "S";
		
		Scanner leia = new Scanner(System.in);
		while(op == "S");
		
		{
			
			System.out.println("\nEntre com a sua idade: ");
			idade=leia.nextInt();
			System.out.println("\nEntre com o seu genero: ");
			System.out.println("\n1- Masculino\t 2- Feminino\t 3-Outros");
			genero=leia.nextInt();	
			System.out.println("\nEntre com a sua categoria: ");
			System.out.println("\n1- Backend\t 2- Frontend\t 3- Mobile\t 4- FullStack");
			categoria=leia.nextInt();
			
		
			
			if(categoria == 1);
			{
				qtdBack++;
			}
			if(genero == 2 && categoria == 2);
			{
				qtdMFront++;
			}
			if(genero == 1 && categoria == 3 && idade>40);
			{
				qtdHMobile40++;
			}
			if(genero == 2 && categoria == 4 && idade<30);
			{
				qtdMFullStack30++;
			}
			
			
			System.out.println("\nDeseja cadastrar um novo colaboradore: (S-Sim e N-NÃ£o)? ");
			op=leia.nextLine();
		}
		
		System.out.printf("\nTemos: ",qtdBack," pessoas desenvolvedoras Backend");
		System.out.printf("\nTemos: ",qtdMFront," mulheres desenvolvedoras FrontEnd");
		System.out.printf("\nTemos: ",qtdHMobile40," homens desenvolvedores Mobile maiores de 40 anos");
		System.out.printf("\nTemos: ",qtdMFullStack30," mulheres desenvolvedoras FullStack menores de 30 anos");
		

	}

}
