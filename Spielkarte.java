

public class Spielkarte{

	int wertOben;
	int wertUnten;
	int wertLinks;
	int wertRechts;
	String kartenname;
	String element;
	String besitzer;

	static Spielkarte Heulechse = new Spielkarte(1,1,5,4,"Heulechse","","Spieler1");
	static Spielkarte FongoOngo = new Spielkarte(5,1,3,1,"FongoOngo","","Spieler1");
	static Spielkarte Beisskaefer = new Spielkarte(1,3,5,3,"Beisskaefer","","Spieler1");
	static Spielkarte Purpurmaus = new Spielkarte(6,1,2,1,"Purpurmaus","","Spieler1");
	static Spielkarte Prinula = new Spielkarte(2,1,5,3,"Prinula","","Spieler1");
	static Spielkarte Geira = new Spielkarte(2,4,4,1,"Geira","Donner", "Spieler1");
	static Spielkarte Gesper = new Spielkarte(1,4,1,5,"Gesper","","Spieler1");
	static Spielkarte FocaDouble = new Spielkarte(3,2,1,5,"FocaDouble","Erde","Spieler1");
	static Spielkarte BloodSoul = new Spielkarte(2,6,1,1,"BloodSoul","","Spieler1");
	static Spielkarte Stichraupe = new Spielkarte(4,4,3,2,"Strichraupe","","Spieler1");
	static Spielkarte Cockatrice = new Spielkarte(2,2,6,1,"Cockatrice","Donner","Spieler1");
	public static void main(String[] args){
	

		//System.out.println("   "+karte1.wertoben[0][1]+"\n"+karte[1][0]+"     "+karte[1][2]+"\n"+"   "+karte[2][1]);
		//Monsterkarten
		
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
	public String getkartenname(){
		return kartenname;
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
	public void setkartenname(String kartenname){
	this.kartenname = kartenname;
	}
	public void setelement(String x){
		this.element = x;
	}
	public void setbesitzer(String y){
		this.besitzer = y;
	}
	
	public Spielkarte(int wertOben, int wertUnten, int wertLinks, int wertRechts, String kartenname, String Element, String besitzer){
		
		this.wertOben = wertOben;
		this.wertUnten = wertUnten;
		this.wertLinks = wertLinks;
		this.wertRechts = wertRechts;
		this.kartenname = kartenname;
		this.element = element;
		this.besitzer = besitzer;
	
	}
	
}
