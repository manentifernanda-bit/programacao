package programçãoIf;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int num;
		
		System.out.println("Informe um número");
		num = leia.nextInt();
		
		if (num % 2 == 0)
		{
			System.out.println("O número é par ");
		}
		else
		{
			System.out.println("O número é ímpar");
		}
		
		leia.close();
		
	}

}
