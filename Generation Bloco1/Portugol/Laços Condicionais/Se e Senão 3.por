programa
{
	inclua biblioteca Matematica --> mat

	
	funcao inicio()
	{
		real n1,n2,n3,n4
		escreva ("Digite o primeiro numero inteiro")
		leia (n1)
		escreva ("Digite o segundo numero inteiro")
		leia (n2)
		escreva ("Digite o terceiro numero inteiro")
		leia (n3)
		escreva ("Digite o quarto numero inteiro")
		leia (n4)
		n1= (mat.potencia ((n1),4))
		n2= (mat.potencia ((n2),4))
		n3= (mat.potencia ((n3),4))
		n4= (mat.potencia ((n4),4))
		se (n3>=1000)
		{
			escreva("O resultado do terceiro número é:", n3)
		}
		senao
		{
			escreva ("Os resultados obtidos foram respectivamente:", n1, "\n", n2, "\n", n3, "\n", n4)
		}
		
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 327; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */