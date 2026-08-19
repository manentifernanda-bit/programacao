package scanner2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Informe a idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Informe o curso: ");
        String curso = scanner.nextLine();

        System.out.print("Informe a altura: ");
        double altura = scanner.nextDouble();

        System.out.print("Informe a média final: ");
        double mediaFinal = scanner.nextDouble();

        System.out.print("Está matriculado? (true/false): ");
        boolean estaMatriculado = scanner.nextBoolean();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("Altura: " + altura);
        System.out.println("Média final: " + mediaFinal);
        System.out.println("Está matriculado: " + estaMatriculado);

        scanner.close();
    }
}