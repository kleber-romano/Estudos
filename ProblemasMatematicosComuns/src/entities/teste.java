package entities;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double itemUm = sc.nextDouble();
        double itemDois = sc.nextDouble();
        double itemTres = sc.nextDouble();

        new MaiorDeTresNumeros(itemUm, itemDois, itemTres);

    }
}
