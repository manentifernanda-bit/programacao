package programacao;

public class exercicio3 {

	public static void main(String[] args) {
		int a = 20;
        int b = 6;

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        double divisao = a / b;
        int resto = a % b;

        System.out.println("Valores utilizados: " + a + " e " + b);
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.printf("Divisão: %.2f%n", divisao);
        System.out.println("Resto da divisão (módulo): " + resto);
	}

}
