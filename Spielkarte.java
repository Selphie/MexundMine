
public class Spielkarte {

	int wertOben;
	int wertUnten;
	int wertLinks;
	int wertRechts;

	public static void main(String[] args){
		//System.out.println("   "+karte[0][1]+"\n"+karte[1][0]+"     "+karte[1][2]+"\n"+"   "+karte[2][1]);
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

	public void setwertOben(int x){
		wertOben = x;
	}
	public void setwertUnten(int x){
		wertUnten = x;
	}
	public void setwertLinks(int x){
		wertLinks = x;
	}
	public void setwertRechts(int x){
		wertRechts = x;
	}
}