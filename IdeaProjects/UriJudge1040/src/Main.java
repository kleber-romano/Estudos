import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        float n1, n2, n3, n4, nE;

        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        n4 = sc.nextFloat();


        float media = (n1 * 2f + n2 * 3f + n3 * 4f + n4 * 1f) / 10f;

        System.out.printf("Media: %.1f%n", media);

        if (media >= 7.0){
            System.out.println("Aluno aprovado.");
        }else if (media <  7.0 && media >= 5.0){
            System.out.println("Aluno em exame.");
            nE = sc.nextFloat();
            System.out.println("Nota do exame: " + nE);
            media = (media + nE) / 2;
            if (media > 5.0){
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f%n", media);
            }else{
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f%n", media);
            }
        }else {
            System.out.println("Aluno reprovado.");

        }


        sc.close();
    }
}
