package produtoEletro;

import aviao.aviao;

import java.util.Scanner;

public class celular1{
    public static void main(String[] args) {
        celular c1 = new celular();
        {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite a cor do celular: ");
            c1.cor = entrada.nextLine();
            System.out.println("Digite a marca do celular:");
            c1.marca = entrada.nextLine();
            System.out.println("Digite a quantidade de memoria que voce deseja");
            c1.memoria = entrada.nextDouble();
            System.out.println(".");
            c1.status();

        }
    }
}
