package programçãoIf;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        System.out.print("Leia a média final do aluno: ");
        double media = leia.nextDouble();

        if (media >= 7.0) {
            System.out.println("Aluno aprovado!");
            if (media >= 9.5) {
                System.out.println("Aluno aprovado com distinção!");
            }
        }

        leia.close();
	}

}
