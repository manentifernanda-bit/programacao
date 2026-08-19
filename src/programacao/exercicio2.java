package programacao;

public class exercicio2 {

	public static void main(String[] args) {
		String nomeDoProduto = "Fone de Ouvido Bluetooth";
        String codigo = "PRD-10293";
        double preco = 149.90;
        int quantidadeEstoque = 35;

        System.out.println("Nome: " + nomeDoProduto);
        System.out.println("Código: " + codigo);
        System.out.printf("Preço: R$ %.2f%n", preco);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque + " unidades");
	}

}
