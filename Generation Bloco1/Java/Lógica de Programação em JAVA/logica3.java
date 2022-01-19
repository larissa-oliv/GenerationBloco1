import java.util.Scanner;

public class logica3 {
    public static void main(String[] args) {
        int a, b, c, d, r, s;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor positivo de A");
        a = ler.nextInt();
        System.out.println("Digite o valor positivo de B");
        b = ler.nextInt();
        System.out.println("Digite o valor positivo de C");
        c = ler.nextInt();
        r = (a + b) * (a + b);
        s = (b + c) * (b + c);
        d = (s + r) / 2;
        System.out.println("O valor final é" + d);
    }
}
