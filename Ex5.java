package programçãoswitch;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a letra representando o conceito do aluno (A, B, C, D, F): ");
        // Lê a linha digitada, pega o primeiro caractere e converte para maiúsculo para aceitar letras minúsculas também
        char conceito = leia.next().toUpperCase().charAt(0);

        switch (conceito) {
            case 'A':
                System.out.println("Excelente");
                break;
            case 'B':
                System.out.println("Bom");
                break;
            case 'C':
                System.out.println("Regular");
                break;
            case 'D':
                System.out.println("Insuficiente");
                break;
            case 'F':
                System.out.println("Reprovado");
                break;
            default:
                System.out.println("Conceito inválido.");
                break;
        }

        leia.close();
    }
}