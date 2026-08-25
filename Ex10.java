package programçãoswitch;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Escolha o curso:");
        System.out.println("1 - Informática");
        System.out.println("2 - Administração");
        System.out.println("3 - Engenharia");
        System.out.print("Digite o código do curso: ");
        int curso = leia.nextInt();

        switch (curso) {
            case 1: // Informática
                System.out.println("\n--- CURSO: INFORMÁTICA ---");
                System.out.println("1 - Programação");
                System.out.println("2 - Banco de Dados");
                System.out.println("3 - Redes");
                System.out.print("Digite o código da disciplina: ");
                int disciplinaInformatica = leia.nextInt();

                switch (disciplinaInformatica) {
                    case 1:
                        System.out.println("Disciplina selecionada: Programação");
                        break;
                    case 2:
                        System.out.println("Disciplina selecionada: Banco de Dados");
                        break;
                    case 3:
                        System.out.println("Disciplina selecionada: Redes");
                        break;
                    default:
                        System.out.println("Erro: Disciplina inválida para Informática.");
                        break;
                }
                break;

            case 2: // Administração
                System.out.println("\n--- CURSO: ADMINISTRAÇÃO ---");
                System.out.println("1 - Marketing");
                System.out.println("2 - Economia");
                System.out.println("3 - Contabilidade");
                System.out.print("Digite o código da disciplina: ");
                int disciplinaAdministracao = leia.nextInt();

                switch (disciplinaAdministracao) {
                    case 1:
                        System.out.println("Disciplina selecionada: Marketing");
                        break;
                    case 2:
                        System.out.println("Disciplina selecionada: Economia");
                        break;
                    case 3:
                        System.out.println("Disciplina selecionada: Contabilidade");
                        break;
                    default:
                        System.out.println("Erro: Disciplina inválida para Administração.");
                        break;
                }
                break;

            case 3: // Engenharia
                System.out.println("\n--- CURSO: ENGENHARIA ---");
                System.out.println("1 - Cálculo");
                System.out.println("2 - Física");
                System.out.println("3 - Desenho Técnico");
                System.out.print("Digite o código da disciplina: ");
                int disciplinaEngenharia = leia.nextInt();

                switch (disciplinaEngenharia) {
                    case 1:
                        System.out.println("Disciplina selecionada: Cálculo");
                        break;
                    case 2:
                        System.out.println("Disciplina selecionada: Física");
                        break;
                    case 3:
                        System.out.println("Disciplina selecionada: Desenho Técnico");
                        break;
                    default:
                        System.out.println("Erro: Disciplina inválida para Engenharia.");
                        break;
                }
                break;

            default:
                System.out.println("Erro: Curso inválido.");
                break;
        }

        leia.close();
    }
}