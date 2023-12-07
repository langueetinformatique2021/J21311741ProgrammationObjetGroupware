package atelier08;

public class Division2 {
	public static void main(String[] args) {
		
		int i = 1000, j;
		try {
		do {
			i--;
			j = 1 / i;
		} while (true);
		
	} catch (ArithmeticException e) {
		System.out.println("il y a une erreur");
		System.out.println(e.getMessage());
		System.exit(0);
	}
	
	}
}
