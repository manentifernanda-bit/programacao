package programçãoswitch;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = leia.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = leia.nextInt();

        System.out.println("\nEscolha a operação:");
        System.out.println("1 Soma");
        System.out.println("2 Subtração");
        System.out.println("3 Multiplicação");
        System.out.println("4 Divisão");
        System.out.print("Digite o número da operação desejada: ");
        int operacao = leia.nextInt();

        switch (operacao) {
            case 1:
                int soma = num1 + num2;
                System.out.println("Resultado: " + num1 + " + " + num2 + " = " + soma);
                break;
                
            case 2:
                int subtracao = num1 - num2;
                System.out.println("Resultado: " + num1 + " - " + num2 + " = " + subtracao);
                break;
                
            case 3:
                int multiplicacao = num1 * num2;
                System.out.println("Resultado: " + num1 + " * " + num2 + " = " + multiplicacao);
                break;
                
            case 4:
                if (num2 == 0) {
                    System.out.println("Erro: Não é possível realizar divisão por zero.");
                } else {
                    double divisao = (double) num1 / num2;
                    System.out.println("Resultado: " + num1 + " / " + num2 + " = " + divisao);
                }
                break;
                
            default:
                System.out.println("Opção inválida.");
                break;
        }

        leia.close();
    }
}