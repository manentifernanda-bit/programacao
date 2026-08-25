package programçãoIf;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int idade;
		
		System.out.println("Informe a idade");
		idade = leia.nextInt();
		
		if (idade >= 60)
		{
			System.out.println("O cliente possui desconto ");
		}
		
		leia.close();
		
	}

}
