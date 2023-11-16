package atelier05;
/**
 * On propose de considérer la carafe comme un objet ayant deux attributs privés
 * (contenu_ et capacité_) et l’interface publique suivante reprenant les
 * opérations ci dessus (Remplir, Vider, Contenu, Capacité et Transvaser)
 */

public class Carafe {
	private int contenu_, capacité_;
	/** constructeur est toujours dans le class et toujours avec le même nom du class et il n'y a pas de return,
	 *  pour initiatiser les attribut
	 * un accesseur est un accès à un attribut
	 * accesseur en lecture, il modifie les attributs
	 * accesseur en écriture, il modifie pas les arrtibuts
	 * privite, utilise seule pour la classe
	 */
    public Carafe(int capacité) {
    	capacité_= capacité;
    	contenu_= 0;
    }
	// accenseurs en lecture 
    public int Contenu() {
    	return contenu_;
    }
    // accesseurs en écriture
    public int Capacité() {
		return capacité_;

	}
	public void Remplir() {
		contenu_ = capacité_;
	}

	public void Vider() {
		contenu_ = 0;
	}

	private void Contenu(int val) {
		contenu_ = val;
	}
   //autre methodes
	/**
	 * 
	 * @param c
	 */
	
	public void Transvaser(Carafe c) {
		int resteC = c.Capacité() - c.Contenu();
		System.out.println(resteC);
		// this.Contenu() > resteC2 on ne peut vider complétement this mais on remplit complétement c2
		// this.Contenu() < resteC2 on vide complétement this mais on ne remplit pas complétement c2
		
		if (this.Contenu() > resteC) {
			c.Remplir();
			this.Contenu(this.Contenu()-resteC);
			
		}
		else {
			c.Contenu(c.Contenu()+ this.Contenu());
			this.Vider();
			
		}
			
			// deux carafes this et c2 
			// transvaser le contenu de this dans c2
			// plusieurs cas
			// c2 est déjà pleine ou this vide, on ne transvase rien
			
		

	}
}
