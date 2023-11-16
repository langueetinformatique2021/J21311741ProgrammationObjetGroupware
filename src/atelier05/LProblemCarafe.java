package atelier05;

public class LProblemCarafe {
	public static void main(String[] args) {
		Carafe c1, c2;

		c1 = new Carafe(4);
		c2 = new Carafe(7);
		
		c1.Remplir();
		c1.Transvaser(c2);
		c1.Remplir();
		c1.Transvaser(c2);
		c2.Vider();
		c1.Transvaser(c2);
		c1.Remplir();
		c1.Transvaser(c2);
		
		System.out.println(c2.Contenu());

	}
}
