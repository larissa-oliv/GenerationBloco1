import java.util.Scanner;

public class exercicio2 {
    public static void main(String[]args){
        int x,h,m,s;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a duração do evento em segundos");
        x=ler.nextInt();
        h=x/3600;
        m = (x-(h*3600)/60);
        s = (x-(h*3600)-(m*60));
        System.out.println("A duração do eventos é de:"+ h+ "horas"+ m+ "minutos"+ s+ "segundos");
    }
}