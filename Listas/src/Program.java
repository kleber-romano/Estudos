import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add("Marco");
		
		//Impress�o da lista completa
		System.out.println(list);
		
		//Impress�o de n�mero de elementos da lista
		System.out.println(list.size());
		
		//Decobrindo a posi��o de um elemento dentro da lista
		System.out.println("Index of Anna: " + list.indexOf("Anna"));
		
		//O que acontece quando o elemento buscado n�o est� na lista
		System.out.println("Index of Pedro: " + list.indexOf("Pedro"));
		
		System.out.println("-----------------------------------------");
		
		//Especificando a posi��o de uma nova entrada
		list.add(4, "Omar");
		System.out.println(list);
		
		//busca de elementos com base em par�metros espec�ficos
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		System.out.println(result);
		
		
		

	}

}
