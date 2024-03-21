package intd5;

public class TestEnvoyer {

	public static void main(String[] args) {

		EnvoyerMessage c = new EnvoyerMessage("mailhost", 25);
		String sujet = "Envoyer un message";
		String message = "cours";
		String ex = "lxy031888@gmail.com";
		String des = "ilgii1@laposte.net";
		c.envoyer(ex, des, sujet, message);
		c.fin();

	}

}
