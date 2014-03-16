
public class Kartenliste {

	Spielkarte[] kartenlistex;
	
	public Kartenliste(Spielkarte[] kartenstapelx){
		this.kartenlistex = kartenstapelx;
	}
	public static void main(String[] args)
	{
		Spielkarte[] kartenliste1 = Kartenstapel.kartenstapelx;
		Kartenliste kartenlistex = new Kartenliste(kartenliste1);
		kartenlistex.kartenlisteausgabe();
		
		
	}
	public void kartenlisteausgabe(){
		for(int i = 0; i<kartenlistex.length;i++){
			//System.out.println(kartenliste[i]); gibt ID aus
			System.out.println("   "+kartenlistex[i].getwertOben()+"\n"+kartenlistex[i].getwertUnten()+"  "+"  "+kartenlistex[i].getwertLinks()+"\n"+"   "+kartenlistex[i].getwertRechts());
			System.out.println("");
		}
}
}
