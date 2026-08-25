package programçãoswitch;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Escolha o setor:");
        System.out.println("1 - Bebidas");
        System.out.println("2 - Lanches");
        System.out.print("Digite o código do setor: ");
        int setor = leia.nextInt();

        switch (setor) {
            case 1: // Setor de Bebidas
                System.out.println("\n--- BEBIDAS ---");
                System.out.println("1 - Água");
                System.out.println("2 - Refrigerante");
                System.out.println("3 - Suco");
                System.out.print("Digite o código do produto: ");
                int bebida = leia.nextInt();

                switch (bebida) {
                    case 1:
                        System.out.println("Item selecionado: Água");
                        break;
                    case 2:
                        System.out.println("Item selecionado: Refrigerante");
                        break;
                    case 3:
                        System.out.println("Item selecionado: Suco");
                        break;
                    default:
                        System.out.println("Código de bebida inválido.");
                        break;
                }
                break;

            case 2: // Setor de Lanches
                System.out.println("\n--- LANCHES ---");
                System.out.println("1 - Cachorro-quente");
                System.out.println("2 - Hambúrguer");
                System.out.println("3 - Pizza");
                System.out.print("Digite o código do produto: ");
                int lanche = leia.nextInt();

                switch (lanche) {
                    case 1:
                        System.out.println("Item selecionado: Cachorro-quente");
                        break;
                    case 2:
                        System.out.println("Item selecionado: Hambúrguer");
                        break;
                    case 3:
                        System.out.println("Item selecionado: Pizza");
                        break;
                    default:
                        System.out.println("Código de lanche inválido.");
                        break;
                }
                break;

            default:
                System.out.println("Setor inválido.");
                break;
        }

        leia.close();
    }
}