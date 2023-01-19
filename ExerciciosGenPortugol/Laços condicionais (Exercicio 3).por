programa
{
	
	funcao inicio()
	{
	inteiro idade
	
		escreva("\t\t\t Olá, Seja bem vindo á central de votos")
		escreva("\n\t\t\t\t Digite sua idade: ")
		leia(idade)
		se(idade>=16 e idade<=18)
		{
			escreva("\nt\t\t\tVocê está apto a votar e o voto é facultativo.")
		}

		se(idade>=19 e idade<=65)
		{
			escreva("\nt\t\t\tVocê está apto a votar e o voto é obrigatório")
		}
		
		se (idade>65)
		{
			escreva("\nt\t\t\tVocê está apto a votar e o voto é facultativo.")
		}

		se (idade<=16)
		{
			escreva("\nt\t\t\t\tvocê não está apto a votar")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 560; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */