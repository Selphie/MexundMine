import java.util.Vector;


public class Spieler {

	String spielername;
	
	public Spielkarte[] kartenliste;
	

	public Spieler(String spielername, Spielkarte[] kartenliste)
	{
		this.spielername = spielername;
		this.kartenliste = kartenliste;
	}
	
	public void kartenwerteausgabe(){
		for(int i = 0; i<kartenliste.length;i++){
			//System.out.println(kartenliste[i]); gibt ID aus
			System.out.println("   "+kartenliste[i].getwertOben()+"\n"+kartenliste[i].getwertUnten()+"  "+spielername.charAt(0)+"  "+kartenliste[i].getwertLinks()+"\n"+"   "+kartenliste[i].getwertRechts());
			System.out.println("");
		}
			}
	/*public static void main(String[] args)
	{
		Spielkarte a = new Spielkarte(1,2,3,4,"Spieler1");
		Spielkarte b = new Spielkarte(2,3,4,5,"Spieler1");
		Spielkarte[] kartenliste1 = {a,b};
		Spieler Spieler1 = new Spieler("mark", kartenliste1);
		Spieler1.kartenwerteausgabe();
	}*/
	public static void main(String[] args){
		int r = (int) (Math.random() * 7);
		Kartenstapel k = new Kartenstapel(null);
		Vector<Spielkarte> v = new Vector<Spielkarte>();
		
		System.out.println(r);
	//	Spielkarte[] kartenliste1 = Kartenliste.kartenlistex;
	//	Spieler Spieler1 = new Spieler("mark", kartenliste1);
	//	Spieler1.kartenwerteausgabe();
	}
}
