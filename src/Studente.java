
public class Studente extends Persona { // ereditarietà
	String matricola;

	public Studente(String nome, int altezza, String matricola) {
		super(nome, altezza);
		this.matricola = matricola;
	}

	public String getMatricola() {
		return matricola;
	}

	public String toString() { // override
		return   "nome: " + nome + " altezza: " + altezza + " matricola: " + matricola;
	}

	public void setDati(String nome, int altezza, String matricola) { // overloading
		this.nome = nome;
		this.altezza = altezza;
		this.matricola = matricola;
	}
	
	public void setDati(String nome, int altezza) { // overloading
		this.nome = nome;
		this.altezza = altezza;
	}
	
	public void setDati(String nome) { // overloading
		this.nome = nome;
	}
}
