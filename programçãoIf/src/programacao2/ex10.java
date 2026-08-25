package programacao2;

public class ex10 {

	public static void main(String[] args) {
		int totalAlunos = 23;
        int grupos = 5;

        int divisaoInteira = totalAlunos / grupos;

        double divisaoFlutuante = (double) totalAlunos / grupos;

        System.out.println("Divisão inteira: " + divisaoInteira);
        System.out.println("Divisão em ponto flutuante: " + divisaoFlutuante);

	}

}
