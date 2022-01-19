package aviao;

import java.util.Scanner;

public class aviao1 {
    public static void main(String[] args) {
        aviao a1 = new aviao();
        {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite a cor da aeronave: ");
            a1.cor = entrada.nextLine();
            System.out.println("Digite a capacidade de passageiros para o voo:");
            a1.capacidade = entrada.nextInt();
            System.out.println("Digite a companhia responsável pelo voo");
            a1.companhia = entrada.nextLine();
            System.out.println(".");
            a1.espaco = entrada.nextLine();
            a1.status();
            a1.ligar();
            a1.decolar();
        }
    }
}


