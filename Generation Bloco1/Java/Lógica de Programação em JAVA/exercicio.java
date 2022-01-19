import java.util.Scanner;
public class exercicio {
    public static void main(String[]args){
        int n1, dias;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a sua Idade ");
        n1=ler.nextInt();
        dias=n1*365;
        System.out.println("Você já viveu" +dias);
    }
}
