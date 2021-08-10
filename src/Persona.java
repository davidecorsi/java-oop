
public class Persona {
	String nome;
	int altezza;

	public Persona(String nome, int altezza) {
		this.nome = nome;
		this.altezza = altezza;
	}

	public String getNome() {
		return nome;
	}

	public int getAltezza() {
		return altezza;
	}
	
	public String toString() {
		return "nome: " + nome + " altezza: " + altezza;
	}
}
