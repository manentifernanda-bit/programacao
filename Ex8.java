package programçãoswitch;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Escolha a sala:");
        System.out.println("1 Sala 1");
        System.out.println("2 Sala 2");
        System.out.print("Digite o número da sala: ");
        int sala = leia.nextInt();

        switch (sala) {
            case 1:
                System.out.println("\nFILMES - SALA 1");
                System.out.println("1 - Aventura");
                System.out.println("2 - Comédia");
                System.out.println("3 - Ficção Científica");
                System.out.print("Digite o número do filme: ");
                int filmeSala1 = leia.nextInt();

                switch (filmeSala1) {
                    case 1:
                        System.out.println("Filme selecionado: Aventura");
                        break;
                    case 2:
                        System.out.println("Filme selecionado: Comédia");
                        break;
                    case 3:
                        System.out.println("Filme selecionado: Ficção Científica");
                        break;
                    default:
                        System.out.println("Código de filme inválido para a Sala 1.");
                        break;
                }
                break;

            case 2:
                System.out.println("\nFILMES - SALA 2");
                System.out.println("1 - Terror");
                System.out.println("2 - Romance");
                System.out.println("3 - Animação");
                System.out.print("Digite o número do filme: ");
                int filmeSala2 = leia.nextInt();

                switch (filmeSala2) {
                    case 1:
                        System.out.println("Filme selecionado: Terror");
                        break;
                    case 2:
                        System.out.println("Filme selecionado: Romance");
                        break;
                    case 3:
                        System.out.println("Filme selecionado: Animação");
                        break;
                    default:
                        System.out.println("Código de filme inválido para a Sala 2.");
                        break;
                }
                break;

            default:
                System.out.println("Sala inválida.");
                break;
        }

        leia.close();
    }
}