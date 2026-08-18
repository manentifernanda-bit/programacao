package programacao2;

public class ex3 {

	public static void main(String[] args) {
		double distancia = 420.0;
        double litros = 35.0;

        double consumoMedio = distancia / litros;
        double litrosPara100Km = 100 / consumoMedio;

        System.out.printf("Consumo médio: %.2f km/l%n", consumoMedio);
        System.out.printf("Litros necessários para percorrer 100 km: %.2f litros%n", litrosPara100Km);

	}

}
