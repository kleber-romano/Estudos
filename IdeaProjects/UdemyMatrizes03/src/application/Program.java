package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        //Indicar posição relativa de um número dentro do vetor
        int x = sc.nextInt();
/* Sempre observe a forma como introduz soma ou subtração diretamente a uma variável.
O programa apresentou erro quando a soma e a subtração foram adicionadas antes da variável.
Fique ligado a esses detalhes do compilador*/

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (mat[i][j] == x){
                    System.out.println("Position " + i + "," + j + ":");
                    if(j > 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if (j < mat[i].length - 1) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if(i < mat.length - 1){
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                }
            }
        }
        sc.close();
    }
}
