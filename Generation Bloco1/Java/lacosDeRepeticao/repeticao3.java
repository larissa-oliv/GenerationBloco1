package lacosDeRepeticao;

import java.util.Scanner;
//
public class repeticao3 {
    public static void main(String[] argss) {
        int x,contador21=0,contador50=0;
        Scanner ler = new Scanner(System.in);
        System.out.println("\n DIGITE A IDADE: ");
        x=ler.nextInt();
        while(x!=-99)
        {
            if(x<21)
                contador21++;
            if(x>50)
                contador50++;
            System.out.println("\n DIGITE A IDADE(PARA ENCERRAR DIGITE -99) : ");
            x=ler.nextInt();

        }
        System.out.println("O TOTAL DE PESSOAS COM MENOS DE 21 ANOS E:"+contador21);
        System.out.println("O TOTAL DE PESSOAS COM MAIS DE 50 ANOS E:"+contador50);
        System.out.println("\n\n");
    }
}

