package programacao;

public class ex9 {

	public static void main(String[] args) {
		boolean possuiIngresso = true;
        boolean possuiDocumento = false;
        boolean acompanhanteMaiorIdade = true;

        boolean exp1 = possuiIngresso && possuiDocumento;
        boolean exp2 = possuiIngresso || possuiDocumento;
        boolean exp3 = !possuiDocumento;
        boolean exp4 = possuiIngresso && (possuiDocumento || acompanhanteMaiorIdade);
        boolean exp5 = !(possuiIngresso && possuiDocumento);

        System.out.println("1. possuiIngresso && possuiDocumento: " + exp1);
        System.out.println("2. possuiIngresso || possuiDocumento: " + exp2);
        System.out.println("3. !possuiDocumento: " + exp3);
        System.out.println("4. possuiIngresso && (possuiDocumento || acompanhanteMaiorIdade): " + exp4);
        System.out.println("5. !(possuiIngresso && possuiDocumento): " + exp5);

	}

}
