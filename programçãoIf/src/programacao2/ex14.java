package programacao2;

public class ex14 {

	public static void main(String[] args) {
		boolean chovendo = true;
        boolean guardaChuva = false;
        boolean carroDisponivel = true;

        System.out.println("chovendo && guardaChuva: " + (chovendo && guardaChuva));

        System.out.println("guardaChuva || carroDisponivel: " + (guardaChuva || carroDisponivel));

        System.out.println("!chovendo: " + (!chovendo));
 
        System.out.println("chovendo && (guardaChuva || carroDisponivel): " + (chovendo && (guardaChuva || carroDisponivel)));

        System.out.println("!(chovendo && guardaChuva): " + (!(chovendo && guardaChuva)));

	}

}
