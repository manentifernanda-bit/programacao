package programçãoswitch;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Escolha a categoria:");
        System.out.println("1 - Informática");
        System.out.println("2 - Telefonia");
        System.out.print("Digite o número da categoria: ");
        int categoria = leia.nextInt();

        switch (categoria) {
            case 1: // Informática
                System.out.println("\n--- INFORMÁTICA ---");
                System.out.println("1 - Notebook");
                System.out.println("2 - Mouse");
                System.out.println("3 - Teclado");
                System.out.print("Digite o código do produto: ");
                int produtoInformatica = leia.nextInt();

                switch (produtoInformatica) {
                    case 1:
                        System.out.println("Produto selecionado: Notebook");
                        break;
                    case 2:
                        System.out.println("Produto selecionado: Mouse");
                        break;
                    case 3:
                        System.out.println("Produto selecionado: Teclado");
                        break;
                    default:
                        System.out.println("Código inválido para a categoria Informática.");
                        break;
                }
                break;

            case 2: // Telefonia
                System.out.println("\n--- TELEFONIA ---");
                System.out.println("1 - Smartphone");
                System.out.println("2 - Carregador");
                System.out.println("3 - Fone de ouvido");
                System.out.print("Digite o código do produto: ");
                int produtoTelefonia = leia.nextInt();

                switch (produtoTelefonia) {
                    case 1:
                        System.out.println("Produto selecionado: Smartphone");
                        break;
                    case 2:
                        System.out.println("Produto selecionado: Carregador");
                        break;
                    case 3:
                        System.out.println("Produto selecionado: Fone de ouvido");
                        break;
                    default:
                        System.out.println("Código inválido para a categoria Telefonia.");
                        break;
                }
                break;

            default:
                System.out.println("Categoria inválida.");
                break;
        }

        leia.close();
    }
}