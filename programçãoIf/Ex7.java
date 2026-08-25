package programçãoIf;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int nota;
		
		System.out.println("Informe a nota");
		nota = leia.nextInt();
		
		if (nota >= 7) {
			
			System.out.println("O aluno passou");
		}
		else
		{
			System.out.println("O aluno reprovou");
		}
	
		leia.close();

	}

}
