programa
{//Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
//que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
//imprima a média aritmética dos lançamentos, contabilize e apresente também
//quantas foram as ocorrências da maior pontuação.
	
	funcao inicio()
	{
	inteiro v[10], soma=0, maior=0, contador=0
	real media
	para (inteiro x=0; x<10; x++)
	{
		escreva ("\ninforme o", x+1,"º valor:")
		leia (v[x])
		
	}
	para (inteiro x=0; x<10; x++)
	{
		escreva (v[x],"\t")
	}
	para (inteiro x=0; x<10; x++)
	{
		soma += v[x]
	}
	para (inteiro x=0; x<10; x++)
	{
		se (maior<v[x])
		{
			maior=v[x]
		}
	}
	para ( inteiro x = 0; x<10;x ++){

            se( v[x] == maior){
                contador += 1
            }
        }
	limpa()
	escreva ("\n Quantas vezes aparece o maior numéro: ", contador)
	media = soma/10
	escreva ("\n E a média é: ", media)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 848; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */