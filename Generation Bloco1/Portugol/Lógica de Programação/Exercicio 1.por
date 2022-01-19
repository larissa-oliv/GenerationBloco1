programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
	inteiro segundos, h, m, s
	escreva ("Digite a duração do evento em seguntos")
	leia (segundos)
	h = (segundos / 3600)
	m = (segundos-(h*3600)/60)
	s = (segundos-(h*3600)-(m*60))
	escreva ("A duração do eventos é de:", h, "horas", m, "minutos", s, "segundos")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 333; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */