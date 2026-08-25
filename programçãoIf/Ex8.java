package programçãoIf;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int idade;
		
		System.out.println("Informe sua idade ");
		idade = leia.nextInt();
		
		if(idade >= 18){
			
			System.out.println("O usuário é maior de idade");
		}
		else
		{
			System.out.println("O usuário é menor de idade");
		}
		
		leia.close();
	
	}

}
