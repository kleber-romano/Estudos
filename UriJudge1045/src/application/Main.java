package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y, z, a, b, c;

        x = sc.nextDouble();
        y = sc.nextDouble();
        z = sc.nextDouble();
        a = 0;
        b = 0;
        c = 0;

        if(x > y && x > z){
            if(y > z) {
                a = x;
                b = y;
                c = z;
            } else{
                a = x;
                b = z;
                c = y;
            }
        } else if(y > x && y > z){
            if(x > z){
                a = y;
                b = x;
                c = z;
            }else{
                a = y;
                b = z;
                c = x;
            }
        }else if (z > x && z > y){
            if (x > y){
                a = z;
                b = x;
                c = y;
            }else{
                a = z;
                b = y;
                c = x;
            }
        }else{
            a = x;
            b = y;
            c = z;
        }

        if (a >= (b+c)) {
            System.out.println("NAO FORMA TRIANGULO");
        }else {
            if (a * a == b * b + c * c) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (a * a > b * b + c * c) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if (a * a < b * b + c * c) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (a == b || b == c || c == a) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

    }
}
