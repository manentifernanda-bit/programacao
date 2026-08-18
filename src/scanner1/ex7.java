package scanner1;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salario = 3875.90;

        int salarioInteiro = (int) salario;

        double salarioConvertido = salarioInteiro;

        System.out.println("Salário original : " + salario);
        System.out.println("Parte inteira : " + salarioInteiro);
        System.out.println("Convertido novamente : " + salarioConvertido);

	}

}
