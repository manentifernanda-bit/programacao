package scanner2;
import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Informe o valor unitário do produto: ");
        double valorUnitario = scanner.nextDouble();

        System.out.print("Informe a quantidade de produtos comprados: ");
        int quantidade = scanner.nextInt();

        System.out.print("Informe a quantidade de parcelas: ");
        int parcelas = scanner.nextInt();

        double valorTotal = valorUnitario * quantidade;
        double valorParcela = valorTotal / parcelas;

        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("Valor unitário do produto: R$ " + valorUnitario);
        System.out.println("Quantidade de produtos comprados: " + quantidade);
        System.out.println("Valor total da compra: R$ " + valorTotal);
        System.out.println("Quantidade de parcelas: " + parcelas);
        System.out.println("Valor de cada parcela: R$ " + valorParcela);

        scanner.close();
    }
}