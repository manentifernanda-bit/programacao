package programçãoIf;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
	        Scanner leia = new Scanner(System.in);

	        System.out.print("Informe a média: ");
	        double media = leia.nextDouble();

	        System.out.print("Informe o percentual de frequência (%): ");
	        double frequencia = leia.nextDouble();

	        if (media >= 7.0 && frequencia >= 75.0) {
	            System.out.println("Aluno aprovado!");
	            if (media >= 9.5) {
	                System.out.println("Aluno aprovado com mérito.");
	            }
	        } else {
	            System.out.println("Aluno reprovado.");
	        }

	        leia.close();
	}

}
