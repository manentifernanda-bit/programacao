package programacao2;

public class ex4 {

	public static void main(String[] args) {
		double nota1 = 7.5;
        double nota2 = 8.0;
        double nota3 = 9.2;

        double soma = nota1 + nota2 + nota3;
        double media = soma / 3;

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.printf("Soma das notas: %.2f%n", soma);
        System.out.printf("Média final: %.2f%n", media);

	}

}
