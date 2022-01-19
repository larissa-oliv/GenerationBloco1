programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real x1, y1, x2, y2, resultado
		resultado = 0.0
		escreva ("Entre com o valor x1")
		leia (x1)
		escreva ("Entre com o valor y1")
		leia (y1)
		escreva ("Entre com o valor x2")
		leia (x2)
		escreva ("Entre com o valor y2")
		leia (y2)

		resultado=mat.potencia(mat.potencia((x2-x1),2) + mat.potencia ((y2-y1),2),1/2)

	escreva ("O resultado é:" + resultado)
		
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 396; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */