package lacosDeRepeticao;

import java.util.Scanner;

public class exemploWhile {
    public static void main(String[]args) {
        double n1,n2;
        Scanner ler=new Scanner(System.in);
        System.out.println("Digite o número que será dividido: ");
        n1=ler.nextDouble();
        System.out.println("Digite o número que irá dividir: ");
        n2=ler.nextDouble();
        while(n2!=0){
            System.out.println("O resultado da divisão é:"+n1/n2);
            System.out.println("Digite o número que será dividido: ");
            n1=ler.nextDouble();
            System.out.println("Digite o número que irá dividir: ");
            n2=ler.nextDouble();
        }
        System.out.println("Não há divisão por ZERO!!! Programa finalizado.");
    }
}
