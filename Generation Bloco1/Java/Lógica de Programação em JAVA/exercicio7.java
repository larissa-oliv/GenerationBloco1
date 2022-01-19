import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        double x1, y1, x2, y2;
        double resultado = 0.0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com o valor de x1 ");
        x1 = ler.nextInt();
        System.out.println("Entre com o valor de y1 ");
        y1 = ler.nextInt();
        System.out.println("Entre com o valor de x2 ");
        x2 = ler.nextInt();
        System.out.println("Entre com o valor de y2 ");
        y2 = ler.nextInt();
        resultado = Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2), 1 / 2);

        System.out.println("O resultado é:" + resultado);

    }


}
