
public class Main {
	public static void main(String[] args) {
		Persona p = new Persona("Fabio", 165);
		Studente s = new Studente("Giacomo", 170, "ID134");
		Persona p1 = new Studente("Francesco", 184, "ID156");
		s.getMatricola();
		p1.getNome();
//		p1.getMatricola();
		System.out.println(p);
		System.out.println(s);
		System.out.println(p1);
	}
}
