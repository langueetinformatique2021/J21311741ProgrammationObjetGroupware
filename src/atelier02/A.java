package atelier02;
/**
 * A contient la méthode treize retournant la valeur true si un entier n passé en paramètre est
divisible par 13 (false dans le cas contraire
 * @author isha
 */
 
 public class A {
/**
 * returne la valeur true si un entier n passé en paramètre est divisible par 13(false dans la cas contraire)
 * @param n entier
 * @return true si divisible par 13 (false sinon)
 */

	public static boolean treize(int n) {
		
//calcul du reste d'une division par 13
		int n13 = n / 13;
		if (n == n13 * 13)
			return true;
		else
			return false;
	}

}
