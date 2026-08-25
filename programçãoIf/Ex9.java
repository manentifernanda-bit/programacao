package programçãoIf;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int n1, n2;
		
		System.out.println("Informe o primeiro número");
		n1 = leia.nextInt();
		
		System.out.println("Informe o segundo número");
		n2 = leia.nextInt();
		
		if (n1 > n2)
		{
			System.out.println("O primeiro número é maior");
		}
		else
		{
			System.out.println("O segundo número é maior");
		}
		
		leia.close();

	}

}
