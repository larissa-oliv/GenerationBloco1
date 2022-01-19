import java.util.Scanner;

public class array1 {
    //Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
    //atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.//
    public static void main(String[] args) {
        int vet[] = new int[5];
        int maior=0,x, soma=0;
        Scanner ler = new Scanner(System.in);
        for (x = 0; x < 5; x++) {
            System.out.println("Informe o" + (x + 1) + "º valor");
            (vet[x]) = ler.nextInt();
            soma+=vet[x];
        }

        for (x = 0; x < 5; x++) {
            System.out.println(vet[x] + "\t");
        }
        for (x = 0; x < 5; x++) {
            if (maior < vet[x])
                maior = vet[x];
        }
        System.out.println("\nmaior= " + maior);
    }
}
