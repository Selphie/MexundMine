	
public class Spielkarte{

	int wertOben;
	int wertUnten;
	int wertLinks;
	int wertRechts;
	String element;
	String besitzer;
	static Spielkarte Heulechse = new Spielkarte(1,1,5,4,"","Spieler1");
	static Spielkarte FongoOngo = new Spielkarte(5,1,3,1,"","Spieler1");
	public static void main(String[] args){
		//Monsterkarten
		Spielkarte Heulechse = new Spielkarte(1,1,5,4,"","Spieler1");
		Spielkarte FongoOngo = new Spielkarte(5,1,3,1,"","Spieler1");
		Spielkarte Beiﬂk‰fer = new Spielkarte(1,3,5,3,"","Spieler1");
		Spielkarte Purpurmaus = new Spielkarte(6,1,2,1,"","Spieler1");
		Spielkarte Prinula = new Spielkarte(2,1,5,3,"","Spieler1");
		Spielkarte Geira = new Spielkarte(2,4,4,1,"Donner", "Spieler1");
		Spielkarte Gesper = new Spielkarte(1,4,1,5,"","Spieler1");
		Spielkarte FocaDouble = new Spielkarte(3,2,1,5,"Erde","Spieler1");
		Spielkarte BloodSoul = new Spielkarte(2,6,1,1,"","Spieler1");
		Spielkarte Stichraupe = new Spielkarte(4,4,3,2,"","Spieler1");
		Spielkarte Cockatrice = new Spielkarte(2,2,6,1,"Donner","Spieler1");
	}
	
	public int getwertOben(){
		return wertOben;
	}
	public int getwertUnten(){
		return wertUnten;
	}
	public int getwertLinks(){
		return wertLinks;
	}
	public int getwertRechts(){
		return wertRechts;
	}
	public String getelement(){
		return element;
	}
	public String getbesitzer(){
		return besitzer;
	}
	public void setwertOben(int x){
		this.wertOben = x;
	}
	public void setwertUnten(int x){
		this.wertUnten = x;
	}
	public void setwertLinks(int x){
		this.wertLinks = x;
	}
	public void setwertRechts(int x){
		this.wertRechts = x;
	}
	public void setelement(String x){
		this.element = x;
	}
	public void setbesitzer(String y){
		this.besitzer = y;
	}
	
	public Spielkarte(int wertOben, int wertUnten, int wertLinks, int wertRechts, String Element, String besitzer){
		
		this.wertOben = wertOben;
		this.wertUnten = wertUnten;
		this.wertLinks = wertLinks;
		this.wertRechts = wertRechts;
		this.element = element;
		this.besitzer = besitzer;
	
	}
}
