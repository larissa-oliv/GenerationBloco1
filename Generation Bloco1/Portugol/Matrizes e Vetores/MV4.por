programa
{
    funcao inicio()
    {
    	inteiro mat[3][3], linha, coluna, soma=0, total=0
        para (linha=0;linha<3;linha++)
        {
            para (coluna=0;coluna<3;coluna++)
            {
                escreva ("Digite um valor: ")
                leia(mat[linha][coluna])
                 total = total + mat[linha][coluna]
            }
		
        }
		para (linha=0;linha<3;linha++)
        {
            para (coluna=0;coluna<3;coluna++)
            { 
            	escreva(mat[linha][coluna] + "\t")
            }
            escreva ("\n")
        }
        soma= mat[0][0]+mat[1][1]+mat[2][2]
        escreva("Soma da diagonal principal: ",soma, "\n Soma total da matriz: ",total)


    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 366; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */