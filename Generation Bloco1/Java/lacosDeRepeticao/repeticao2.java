package lacosDeRepeticao;
//Ler 10 números e imprimir quantos são pares e quantos são ímpares.
import java.util.Scanner;

public class repeticao2 {
    public static void main(String[] argss) {
        Scanner ent = new Scanner(System.in);
        int num, par = 0, impar = 0;

        for (int x = 1; x <= 10; x++) {
            System.out.println("Digite o " + x + "º número");
            num = ent.nextInt();

            if (num % 2 == 0) {
                par++;
            } else if (num % 2 == 1) {
                impar++;
            }
        }

        System.out.println("Foram digitados " + par + " números pares");
        System.out.println("E " + impar + " números ímpares");

    }
}

