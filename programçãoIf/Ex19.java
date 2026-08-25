package programçãoIf;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        System.out.print("Informe a idade: ");
        int idade = leia.nextInt();
        leia.nextLine();

        System.out.print("Informe o sexo (homem/mulher): ");
        String sexo = leia.nextLine();

        if (idade < 0) {
            System.out.println("Ninguém pode ter idade menor que zero!");
        } else if (idade <= 12) {
            System.out.println("É uma criança.");
        } else if (idade <= 17) {
            System.out.println("É um adolescente.");
        } else {
            if (sexo.equalsIgnoreCase("homem")) {
                if (idade <= 64) {
                    System.out.println("É um homem adulto.");
                } else {
                    System.out.println("É um homem idoso.");
                }
            } else if (sexo.equalsIgnoreCase("mulher")) {
                if (idade <= 62) {
                    System.out.println("É uma mulher adulta.");
                } else {
                    System.out.println("É uma mulher idosa.");
                }
            } else {
                System.out.println("Sexo inválido.");
            }
        }

        leia.close();
	

	}

}
