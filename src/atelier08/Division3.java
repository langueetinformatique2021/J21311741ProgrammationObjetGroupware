package atelier08;

public class Division3 {
	public static void main(String[] args) throws ArithmeticException {
		// trait de l'exception ici
		
		try {
			division();
		} catch (ArithmeticException e) {
			System.out.println("il y a une erreur");
			System.out.println(e.getMessage());
			System.exit(0);
		}

	}

	public static void division() throws ArithmeticException {

		int i = 1000, j;
		do {
			i--;
			j = 1 / i;
		} while (true);

	}
}


