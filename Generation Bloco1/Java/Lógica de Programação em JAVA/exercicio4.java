//Faça um programa em que permita a entrada de um número qualquer e exiba se este
//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
//ímpar exiba o número elevado ao quadrado.
import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        double x,r1,r2;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número");
        x = ler.nextDouble();
        if ((x % 2) == 0) {
            r1=Math.sqrt(x);
            System.out.println("Este número é par, e sua raíz quadrada é: "+r1);
        }
        else{
            r2=Math.pow(x,2);
            System.out.println("Este número é ímpar, e seu resultado elevado ao quadrado é: "+r2);

        }
    }
}

