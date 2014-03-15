
public class Kartenstapel {

	//public Spielkarte[] kartenstapel;
	
	
	public static void main(String[] args){
		Spielkarte a = new Spielkarte(1,2,3,4,"Spieler1");
		Spielkarte b = new Spielkarte(1,2,3,4,"Spieler1");
		Spielkarte[] kartenstapel1 = {a,b};
		System.out.print(kartenstapel1[0]+"  "+kartenstapel1[1]);
	}



}
