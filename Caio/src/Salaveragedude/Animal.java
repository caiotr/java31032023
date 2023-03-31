package Salaveragedude;

public class Animal {
	//atributos
		private String nome;
		private String raça;
		//constructor
		public Animal() {}
		public Animal(String nome, String raça) {
			this.nome = nome;
			this.raça = raça;
		}
		//metodos
		public void imprimir() {
			System.out.println(
					"Nome: "+this.nome+
					"\nRaça: "+this.raça);
		}
		//get set
		public void setNome(String nome) {
			this.nome = nome;
		}
		public void setPeso(String raça) {
			this.raça = raça;
		}
		public String getNome() {
			return nome;
		}
		public String getRaça() {
			return raça;
		}
		

}
