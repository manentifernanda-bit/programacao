package programçãoIf;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		double media;
		
		System.out.println("Informe a média");
		media = leia.nextDouble();
		
		if (media >= 9)
		{
			System.out.println("Conceito A");
		}
		else if (media >= 7)
		{
			System.out.println("Conceito B");
		}
		else if (media >= 5)
		{
			System.out.println("Conceito C");
		}
		else
		{
			System.out.println("Conceito D");
		}
		
		leia.close();
		
		
	}

}
