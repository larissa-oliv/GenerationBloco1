programa
{
	
//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
//atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.//
		funcao inicio()
	{
	inteiro v[5],maior
	para (inteiro x=0; x<5; x++)
	{
		escreva ("informe o", x+1,"º valor:")
		leia (v[x])
	}
	maior = v[0]
	para (inteiro x=0; x<5; x++)
	{
		escreva (v[x],"\t")
	}
	para (inteiro x=0; x<5; x++)
	{
		se (maior<v[x])
		{
			maior=v[x]
		}
	}
	escreva ("\nmaior= ", maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 441; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */