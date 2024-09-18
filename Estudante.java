package encapsulando;

public class Estudante {
	private String nome;
	private double nota1;
	private double nota2;
	
	//construtor
	public Estudante(String nome, double nota1, double nota2){
	this.nome = nome;
	setNota1(nota1);
	setNota2(nota2);

	}
	//getter e setter para nome
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//getter e seter para nota1 com validaçao
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		if (nota1>=0 && nota1<=10) {
			this.nota1=nota1;
		}
		else {
			System.out.println("nota 1 invalida! deve estar entre 0 e 10 ");
		}
	}
	
	//getter e seter para nota2 com validaçao
		public double getNota2() {
			return nota2;
		}
		public void setNota2(double nota2) {
			if (nota2>=0 && nota2<=10) {
				this.nota2=nota2;
			}
			else {
				System.out.println("nota 2 valida! deve estar entre 0 e 10 ");
			}
		}
	
	//metodo para calcular a media
	public double calcularMedia() {
		return (nota1+nota2)/2;
	}
	//metodo para exibir as informaçoes do estudante
	public void exibirInformacoes() {
		System.out.println("esdante: "+ nome + "media: "+calcularMedia());
	}

}

