package programçãoIf;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int num;
		
		System.out.println("Informe o número ");
		num = leia.nextInt();
		
		if(num > 0)
		{
			System.out.println("O número é positivo");
		}
		
		leia.close();
	}

}
