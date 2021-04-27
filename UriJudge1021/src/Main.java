import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int quociente, nota, resto, moeda;
		double valor = sc.nextDouble();

		// Vamos multiplicar 'valor' por 100 e forçar a conversão para int.
		// Desse modo, por exemplo, 576.73 vai se tornar 57673

		// Vamos tambem somar 0.5 antes de converter, para assegurar
		// que o numero seja devidamente arredondado, pois o tipo double
		// as vezes da problema de arredondamento (por exemplo: se digitarmos
		// 576.81 e multiplicarmos por 100, o resultado sera 57680.99999999,
		// dai o casting resultaria em 57680 e nao 57681 como desejado)
		
		resto = (int) (valor * 100 + 0.5);
		
		System.out.println("NOTAS:");

		// como multiplicamos o valor por 100 acima, o valor de cada nota
		// também deverá ser multiplicado por 100 a seguir
		
		nota = 100;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00" );
		quociente = resto % (nota * 100);
		resto = quociente;
		
		nota = 50;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00" );
		quociente = resto % (nota * 100);
		resto = quociente;
		
		nota = 20;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00" );
		quociente = resto % (nota * 100);
		resto = quociente;
		
		nota = 10;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00" );
		quociente = resto % (nota * 100);
		resto = quociente;
		
		nota = 5;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00" );
		quociente = resto % (nota * 100);
		resto = quociente;
		
		nota = 2;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00" );
		quociente = resto % (nota * 100);
		resto = quociente;
		
		System.out.println("MOEDAS:");
		
		moeda = 100;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 1.00" );
		quociente = resto % moeda;
		resto = quociente;
		
		moeda = 50;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.50" );
		quociente = resto % moeda;
		resto = quociente;
		
		moeda = 25;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.25" );
		quociente = resto % moeda;
		resto = quociente;
		
		moeda = 10;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.10" );
		quociente = resto % moeda;
		resto = quociente;
		
		moeda = 5;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.05" );
		quociente = resto % moeda;
		resto = quociente;
		
		moeda = 1;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.01" );
		
		sc.close();
	}

}
