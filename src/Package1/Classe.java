package Package1;

public class Classe {

	public int niveau;
	public int groupe;
	
	public Classe(int niveau, int groupe) {
		this.groupe=groupe;
		this.niveau=niveau;
	}
	
	
	public int getGroupe() {
		return this.groupe;
	}
	
	public int getNiveau() {
		return this.niveau;
	}
	
	public void setGroupe(int groupe) {
		this.groupe=groupe;
	}
	
	public void setNiveau(int niveau) {
		this.niveau=niveau;
	}
	
	
}
