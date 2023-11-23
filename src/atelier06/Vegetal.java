package atelier06;

public class Vegetal {
	private String espèces;
	private int lon_feuilles = 0;
		
	public Vegetal(String type, int feuilles) {
		espèces = type;
		lon_feuilles = feuilles;
		
	}
	public void feuille() {
		System.out.println("je suis " + espèces + "j'ai" + lon_feuilles + "CM");
	}
	
	public void agrandir() {
		System.out.println("Je grandis tous les soirs.");
	}
}