
public class Spielkarte {

	int wertOben;
	int wertUnten;
	int wertLinks;
	int wertRechts;
	String besitzer;

	public static void main(String[] args){
		//System.out.println("   "+karte1.wertoben[0][1]+"\n"+karte[1][0]+"     "+karte[1][2]+"\n"+"   "+karte[2][1]);
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
	public void setbesitzer(String y){
		this.besitzer = y;
	}
	
	public Spielkarte(int wertOben, int wertUnten, int wertLinks, int wertRechts, String besitzer){
		
		this.wertOben = wertOben;
		this.wertUnten = wertUnten;
		this.wertLinks = wertLinks;
		this.wertRechts = wertRechts;
		this.besitzer = besitzer;
	
	}
}