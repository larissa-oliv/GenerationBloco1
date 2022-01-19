programa
{
	inclua biblioteca Matematica -->mat
	real base, altura, resultado
	funcao inicio()
	{
		escreva ("Digite o valor da base")
		leia (base)
		escreva ("Digite o valor da altura")
		leia (altura)
		se (base>0 e altura>0)
		{
			resultado=(base*altura/2) 
			escreva ("A área do triangulo é:", resultado)
		}
		senao 
		{
			escreva ("Valores informados não são válidos")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 382; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */