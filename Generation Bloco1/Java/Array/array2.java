import java.util.Scanner;

public class array2 {
    //Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
//que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
//imprima a média aritmética dos lançamentos, contabilize e apresente também
//quantas foram as ocorrências da maior pontuação.
    public static void main(String[] args) {
        int vet[] = new int[10];
        int soma = 0, maior = 0, contador = 0;
        double media;
        Scanner ler = new Scanner(System.in);
        for (int x = 0; x < 10; x++) {
            System.out.println("Informe o" + (x + 1) + "º valor");
            (vet[x]) = ler.nextInt();
        }
        for (int x = 0; x < 10; x++) {
            System.out.println(vet[x]+"\t");
        }
        for (int x = 0; x < 10; x++) {
            soma += vet[x];
        }
        for (int x = 0; x < 10; x++) {
            if (maior < vet[x]) ;
            {
                maior = vet[x];
            }
        }
        for (int x = 0; x < 10; x++) {

            if (vet[x] == maior) {
                contador += 1;
            }
        }
        System.out.println("\n Quantas vezes aparece o maior numéro: " + contador);
        media = soma/10;
        System.out.println("\n E a média é: " + media);

    }
}
