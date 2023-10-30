package sqlGen;

public class Main {

	public static void main(String[] args) {
		Gerador g = new Gerador("Idade", "INT", true, true);
		System.out.println(g.gerar());
	}

}
