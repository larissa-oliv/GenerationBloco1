programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real peso,excesso, multa
		escreva("Entre com o valor do peso:")
		leia(peso) 
		se(peso>50)
		{	 
			excesso=(peso-50)
			multa=(excesso*4)
			escreva ("O peso em excesso é de:",excesso,"kg","\nE o valor da multa é de R$",multa)
			}
		senao 
		escreva ("O peso está dentro do limite exigido.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 378; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */