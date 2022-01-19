package lacosDeRepeticao;

import java.util.Scanner;

public class repeticao5 {
    public static void main(String[] args) {

        int numero;
        int soma = 0;
        Scanner ler = new Scanner(System.in);
        do {
            System.out.println("Digite um numero\n");
            numero = ler.nextInt();
            soma += numero;
            System.out.println("\n PARA ENCERRAR DIGITE 0 : ");
        }
        while (numero != 0);
        System.out.println(soma);

    }
}
