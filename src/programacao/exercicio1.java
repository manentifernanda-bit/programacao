
package programacao;

import java.util.Scanner;

public class exercicio1 {

		public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);

		
		String nome;

		int idade;

		double altura;

		double peso;

		char sexo;

		

		System.out.println("Informe o nome do aluno: ");

		nome = leia.nextLine();

		

		System.out.println("Informe a idade do aluno: ");

		idade = leia.nextInt();

		

		System.out.println("Informe a altura do aluno: ");

		altura = leia.nextDouble();

		

		System.out.println("Informe o peso do aluno: ");

		peso = leia.nextDouble();

		

		System.out.println("Informe o sexo do aluno (M/F): ");

		sexo = leia.next().charAt(0);

		

		System.out.println("Informe a matricula do aluno: (true para ativa, false para inativa )");

		boolean matriculaAtiva = leia.nextBoolean();

		

		System.out.println("Nome: "+ nome);

		System.out.println("Idade: "+ idade + "anos");

		System.out.println("Altura: "+ altura + "m");

		System.out.println("Peso: "+ peso + "kg");

		System.out.println("Sexo: "+ sexo);

		System.out.println("Matricula: "+ matriculaAtiva);



	}



}