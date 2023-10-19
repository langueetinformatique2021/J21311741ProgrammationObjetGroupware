package atelier02;
/**
 * permet de tester la méthode divise de la class B
 */
public class testB {
/**
 * 
 * @param args non utilisé
 */
	public static void main(String[] args) {

		for (int i = 0; i < 50; i++) {
			System.out.println(i + " " + B.divise(i));
		}
   }
}