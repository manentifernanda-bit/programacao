package programçãoIf;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int temp;
		
		System.out.println("Infore a temperatura em graus celsius");
		temp = leia.nextInt();
		
		if (temp >= 30)
		{
			System.out.println("Está quente");
		}
		else
		{
			System.out.println("A temperatura está agradável");
		}
		
		leia.close();
	}

}
