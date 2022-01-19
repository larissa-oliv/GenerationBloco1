//Faça um programa que entre com três números e coloque em ordem crescente.

import java.util.Scanner;
public class decisao2 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua idade");
        a = ler.nextInt();
        System.out.println("Digite o valor positivo de B");
        b = ler.nextInt();
        System.out.println("Digite o valor positivo de C");
        c = ler.nextInt();
        if (a < b) {
            if (b < c) {
                System.out.println(a + "-" + b + "-" + c);
            } else if (a < c) {
                System.out.println(a + "-" + c + "-" + b);
            } else {
                System.out.println(c + "-" + a + "-" + b);
            }

        }
        else if (b<c){
            if (a<c){
                System.out.println(b + "-" + a + "-" + c);
            }
            else{
                System.out.println(b + "-" + c + "-" + a);
            }
        }
        else{
            System.out.println(c + "-" + b + "-" + a);
        }
    }
}