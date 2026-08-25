package programçãoIf;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int idade;
		
		System.out.println("Informe a idade");
		idade = leia.nextInt();
		
		if(idade <= 12)
		{
			System.out.println("Criança");
		}
		else if(idade <= 17)
		{
			System.out.println("Adolescente");
		}
		else if (idade <=59 )
		{
			System.out.println("Adulto");
		}
		else
		{
			System.out.println("Idoso");
		}
		
		leia.close();
		
	}

}
