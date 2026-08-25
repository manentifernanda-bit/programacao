package programçãoIf;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        System.out.print("Informe o usuário: ");
        String usuario = leia.nextLine();

        System.out.print("Informe a senha: ");
        String senha = leia.nextLine();

        if (!usuario.equals("admin")) {
            System.out.println("Usuário inexistente.");
        } else if (senha.equals("1234")) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Senha incorreta.");
        }

        leia.close();

	}

}
