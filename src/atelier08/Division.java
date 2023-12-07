package atelier08;

public class Division {

	public static void main(String[] args) {
		
			int i = 1000, j;
			try {
			do {
				i--;
				j = 1 / i;
			} while (true);
			
		} catch (java.lang.ArithmeticException e) {
			System.out.println("il y a une erreur");
			e.printStackTrace();
			e.getMessage();
		}

	}

}
