package programçãoIf;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        System.out.print("Informe o peso (kg): ");
        double peso = leia.nextDouble();

        System.out.print("Informe a altura (m): ");
        double altura = leia.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("IMC: " + imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Magreza / Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Classificação: Peso normal / Saudável");
        } else if (imc <= 29.9) {
            System.out.println("Classificação: Sobrepeso (Pré-obesidade)");
        } else if (imc <= 34.9) {
            System.out.println("Classificação: Obesidade Grau I");
        } else if (imc <= 39.9) {
            System.out.println("Classificação: Obesidade Grau II");
        } else {
            System.out.println("Classificação: Obesidade Grau III (Grave)");
        }

        leia.close();

	}

}
