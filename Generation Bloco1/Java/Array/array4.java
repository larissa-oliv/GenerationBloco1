import java.util.Scanner;
//Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
//em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
//diagonal, ou seja, diagonal principal.

public class array4 {
    public static void main(String[] args) {
        int mat[][]=new int[3][3];
        int linha, coluna, soma=0, total=0;
        Scanner ler = new Scanner(System.in);
        for (linha=0;linha<3;linha++){
            for (coluna=0;coluna<3; coluna++){
                System.out.println("Digite um valor");
                mat[linha][coluna] = ler.nextInt();
                total+=mat[linha][coluna];
            }
        }
        for (linha=0;linha<3;linha++){
            for (coluna=0;coluna<3;coluna++){
                System.out.println(mat[linha][coluna]+"\t");
            }
            System.out.println("\n");
        }
        soma=mat[0][0]+mat[1][1]+mat[2][2];
        System.out.println("Soma da diagonal principal é"+soma+"\nSoma total da matriz é:"+total);


    }
}
