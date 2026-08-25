package programçãoswitch;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Escolha o turno:");
        System.out.println("1 - Manhã");
        System.out.println("2 - Tarde");
        System.out.print("Digite o código do turno: ");
        int turno = leia.nextInt();

        System.out.print("Digite o código do turno (1 ou 2): ");
        turno = leia.nextInt();

        switch (turno) {
            case 1: 
                System.out.println("\nEscolha a disciplina (Manhã):");
                System.out.println("1 - Matemática");
                System.out.println("2 - Português");
                System.out.println("3 - Física");
                System.out.print("Digite o código da disciplina: ");
                int disciplinaManha = leia.nextInt();

                switch (disciplinaManha) {
                    case 1:
                        System.out.println("Disciplina: Matemática");
                        break;
                    case 2:
                        System.out.println("Disciplina: Português");
                        break;
                    case 3:
                        System.out.println("Disciplina: Física");
                        break;
                    default:
                        System.out.println("Disciplina inválida para o turno da manhã.");
                        break;
                }
                break;

            case 2: // Turno Tarde
                System.out.println("\nEscolha a disciplina (Tarde):");
                System.out.println("1 - História");
                System.out.println("2 - Geografia");
                System.out.println("3 - Biologia");
                System.out.print("Digite o código da disciplina: ");
                int disciplinaTarde = leia.nextInt();

                switch (disciplinaTarde) {
                    case 1:
                        System.out.println("Disciplina: História");
                        break;
                    case 2:
                        System.out.println("Disciplina: Geografia");
                        break;
                    case 3:
                        System.out.println("Disciplina: Biologia");
                        break;
                    default:
                        System.out.println("Disciplina inválida para o turno da tarde.");
                        break;
                }
                break;

            default:
                System.out.println("Turno inválido.");
                break;
        }

        leia.close();
    }
}