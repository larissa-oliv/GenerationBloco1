import java.util.Scanner;
public class decisao1 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor positivo de A");
        a = ler.nextInt();
        System.out.println("Digite o valor positivo de B");
        b = ler.nextInt();
        System.out.println("Digite o valor positivo de C");
        c = ler.nextInt();
        if((a > b) && (a > c)){
            System.out.println("O primeiro número é o maior");
        }
        else if((b > a) && (b > c)){
            System.out.println("O segundo número é o maior");
        }
        else if((c > a) && (c > b)){
            System.out.println("O terceiro número é o maior");
        }
        else{
            System.out.println("Os três números não são diferentes");
        }

        System.out.println("\n");
    }
}
