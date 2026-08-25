package programçãoIf;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int nota;
		
		System.out.println("Informe a nota");
		nota = leia.nextInt();
		
		if (nota >= 90) {
            System.out.println("Classificação: Excelente");
        } else if (nota >= 70) {
            System.out.println("Classificação: Bom");
        } else if (nota >= 50) {
            System.out.println("Classificação: Regular");
        } else {
            System.out.println("Classificação: Insuficiente");
        }

        leia.close();

	}

}
