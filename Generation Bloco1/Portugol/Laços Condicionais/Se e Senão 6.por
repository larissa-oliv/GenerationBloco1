programa
{
	
	funcao inicio()
	{
		inteiro idade 
		escreva("digite a sua idade")
		leia (idade)
		se (idade>=5 e idade<=7) 
		{
			escreva ("Você está na classificação: Infantil A") 
		}
		senao se (idade>=8 e idade<=11)
		{
			escreva ("Você está na classificação: Infantil B")
		}
		senao se (idade>=12 e idade<=13)
		{
			escreva ("Você está na classificação: Juvenil A")
		}
		senao se (idade>=14 e idade<=17)
		{
			escreva ("Você está na classificação: Juvenil B")
		}
		senao se (idade>=18)
		{
			escreva ("Você está na classificação: Adulto")
		}
		senao se (idade<=4)
		{
			escreva ("Infelizmente você ainda não pode ser classificado.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 226; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */