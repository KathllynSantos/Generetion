programa
{
	
	funcao inicio()
	{
		inteiro codigo,quantidade
		real valor_total

		escreva("\n\t\t\t Olá,Seja bem Vindo ao KL Burgues! ")
		escreva("\n\n\t\t\t\t Cardápio")
	
		escreva("\n\n Lanches")
		escreva("\n\n 1 - Cachorro Quente - R$10,00")
		escreva("\n 2 - X-Salada - R$15,00")
		escreva("\n 3 - X-Bacon - R$18,00")
		escreva("\n 4 - Bauru - R$12,00")
		escreva("\n\n Bebidas")
		escreva("\n\n 5 - Refrigerante - R$8,00")
		escreva("\n 6 - Suco de Laranja - R$13,00")
		escreva("\n\nDigite aqui o código: ")
		leia(codigo)
		escreva("\nDigite a quantidade desse produto: ")
		leia(quantidade)
		escolha(codigo)
		{
			caso 1:
			valor_total = quantidade * 10.00
			escreva("\nVocê comprou ",quantidade," Cachorro Quente e o valor total ficou R$ ",valor_total)
			pare
			caso 2:
			valor_total = quantidade * 15.00
			escreva("\nVocê comprou ",quantidade," X-Salada e o valor total ficou R$ ",valor_total)
			pare
			caso 3:
			valor_total = quantidade * 18.00
			escreva("\nVocê comprou ",quantidade," X-Bacon e o valor total ficou R$ ",valor_total)
			pare
			caso 4:
			valor_total = quantidade * 12.00
			escreva("\nVocê comprou ",quantidade," Bauru e o valor total ficou R$ ",valor_total)
			pare
			caso 5:
			valor_total = quantidade * 8.00
			escreva("\nVocê comprou ",quantidade," Refrigerante e vai pagar R$ ",valor_total)
			pare
			caso 6:
			valor_total = quantidade * 13.00
			escreva("\nVocê comprou ",quantidade," Suco de Laranja e vai pagarR$ ",valor_total)
			pare
			caso contrario:
			escreva("\nCódigo inválido!!!")

			

			
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 791; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */