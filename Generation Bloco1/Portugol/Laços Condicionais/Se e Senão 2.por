programa
{
	inteiro c,n,E,salario
	funcao inicio()
	{
		escreva ("Entre com seu código de acesso:")
		leia (c)
		escreva ("Digite o total de horas trabalhadas")
		leia (n)

		salario = (n*10)
		se (n>50)
		{
		E = (n-50*20)
		}
		senao 
		{
			E=0 
		}
		escreva ("O valor total do salario é R$", salario, "\n E o total excedente é de R$", E)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 346; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */