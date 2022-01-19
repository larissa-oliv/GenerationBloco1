programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
		inteiro numero
		escreva ("informe um número")
		leia (numero)
		se (numero%2!=0 e numero>0)
		{
			escreva("Este numéro é ímpar e positivo")
		}
	
		senao se (numero%2 !=0 e numero<0)
		{
			escreva ("Este número é ímpar e negativo")
		}
		senao se(numero%2==0 e numero>0)
		{
			escreva ("Este número é par e positivo")
		}
		senao se (numero%2==0 e numero<0)
		{
			escreva ("Este número é par e negativo")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 475; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */