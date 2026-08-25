package programacao;

public class ex11 {

	public static void main(String[] args) {
		String nomeAluno = "Manuel Campos";
        int nota = 6;
        int frequencia = 75;

        String status = (nota >= 6 && frequencia >= 75) ? "Aprovado" : "Reprovado";

        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Situação: " + status);
	}

}
