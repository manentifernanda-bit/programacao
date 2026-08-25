package programçãoswitch;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("CARDÁPIO");
        System.out.println("1 Cachorro-quente");
        System.out.println("2 Hambúrguer");
        System.out.println("3 Pizza");
        System.out.println("4 Refrigerante");
        System.out.println("5 Suco");
        System.out.print("\nDigite o código do produto desejado (1 a 5): ");
        
        int codigo = leia.nextInt();

        switch (codigo) {
            case 1:
                System.out.println("Produto: Cachorro-quente");
                break;
            case 2:
                System.out.println("Produto: Hambúrguer");
                break;
            case 3:
                System.out.println("Produto: Pizza");
                break;
            case 4:
                System.out.println("Produto: Refrigerante");
                break;
            case 5:
                System.out.println("Produto: Suco");
                break;
            default:
                System.out.println("Produto inválido.");
                break;
        }

        leia.close();
    }
}