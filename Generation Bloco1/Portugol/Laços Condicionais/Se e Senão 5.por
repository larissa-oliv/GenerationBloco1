programa
{
	real indice
	funcao inicio()
	{
	escreva ("Digite o índice de poluíção:")
	leia (indice)
	se (indice>0.3 e indice<0.4)
	{
		escreva("O grupo 1 deve suspender suas atividades!")
	}
	senao se (indice>=0.4 e indice<0.5)
	{
		escreva ("Os grupos 1 e 2 devem suspender suas atividade!")
	}
	senao se (indice>=0.5)
	{
		escreva ("TODOS os grupos devem suspender suas atividades!")
	}
	senao se (indice<=0.3)
	{
		escreva ("O índice está dentro do permitido.")
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 325; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */