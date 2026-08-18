package programacao;

public class ex14 {

	public static void main(String[] args) {
		String nome = "Carlos Silva";
        double salario = 3500.00;
        int tempoEmpresaAnos = 5;

        double bonus = (tempoEmpresaAnos >= 5) ? 500.00 : 0.00;

        double salarioFinal = salario + bonus;

        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Bônus: R$ " + bonus);
        System.out.println("Salário Final: R$ " + salarioFinal);
	}

}
