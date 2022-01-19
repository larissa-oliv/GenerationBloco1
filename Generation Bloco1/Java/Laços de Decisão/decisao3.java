import java.util.Scanner;

public class decisao3 {
    public static void main(String[] args) {
        int x;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a sua idade");
        x = ler.nextInt();
        if ((x >= 10) && (x <= 14)) {
            System.out.println("Você está na categoria infantil");
        } else if ((x >= 15) && (x <= 17)) {
            System.out.println("Você está na categoria Juvenil");
        } else if ((x >= 18) && (x <= 25)){
            System.out.println("Você está na categoria Adulto");
        }
        else {
            System.out.println("Você não pode ser alocado em uma categoria, verifique as idades.");
        }
    }
}
