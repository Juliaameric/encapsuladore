package encapsulando;

public class Produto {
	//atributos privados
	private String nome;
	private double preco;
	
	//construtor
	public Produto(String nome, double preco) {
		this.nome=nome;
		setPreco(preco);
	}
	
	// getter para o nome
	public String getNome() {
		return nome;
	}
	//setter para o nome
	public void setNome(String nome) {
		this.nome=nome;
	}
	//getter para preco 
	public double getPreco() {
		return preco;
	}
	//setter para preco com validade
	public void setPreco(double preco) {
		if (preco >= 0) {
			this.preco=preco;
		}
		else {
			System.out.println("preço invalido! nao pode ser negativo.");
			
		}
		
	}
	//metodo para exibir informaçoes do produto
	public void exibirinformaçoes() {
		System.out.println("+ nome +", "preço:"+ preco);
	}
}
