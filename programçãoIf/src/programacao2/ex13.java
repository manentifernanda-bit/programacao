package programacao2;

public class ex13 {

	public static void main(String[] args) {
		boolean possuiCNH = true;
        boolean possuiCarro = false;
        boolean possuiDinheiro = true;

        System.out.println("possuiCNH && possuiCarro: " + (possuiCNH && possuiCarro));

        System.out.println("possuiCarro || possuiDinheiro: " + (possuiCarro || possuiDinheiro));

        System.out.println("!possuiCNH: " + (!possuiCNH));
        
        System.out.println("possuiCNH && possuiDinheiro: " + (possuiCNH && possuiDinheiro));
 
        System.out.println("!(possuiCarro || possuiDinheiro): " + (!(possuiCarro || possuiDinheiro)));
	}

}
