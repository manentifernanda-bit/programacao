package programçãoIf;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        System.out.print("Informe a idade do atleta: ");
        int idade = leia.nextInt();

        if (idade <= 12) {
            System.out.println("Categoria: Infantil");
        } else if (idade <= 17) {
            System.out.println("Categoria: Juvenil");
        } else if (idade <= 39) {
            System.out.println("Categoria: Adulto");
        } else {
            System.out.println("Categoria: Master");
        }

        leia.close();

	}

}
