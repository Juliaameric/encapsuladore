package encapsulando;

public class ObjetoProduto {

	public static void main(String[] args) {
		Produto prod = new Produto("queijo prato", 50.000);
		
		//mostra valores iniciais
		System.out.println(prod.getNome()+ " " + prod.getPreco());
		
		prod.setPreco(53);
		System.out.println(prod.getPreco());
		
		prod.setPreco(56);
		System.out.println(prod.getPreco());
		
		prod.setNome("queijo parmesao");
		prod.setPreco(80);
		System.out.println(prod.getNome());
		System.out.println(prod.getPreco());
	}

}
