
public class Kartenliste {

	Spielkarte[] kartenArray;
	
	public Kartenliste(Spielkarte[] kartenArray){
		this.kartenArray = kartenArray;
	}
	public static void main(String[] args)
	{
		Spielkarte[] kartenliste1 = Kartenstapel.kartenArrayx;
		Kartenliste kartenlistex = new Kartenliste(kartenliste1);
		kartenlistex.kartenlisteausgabe();
		
		
	}
	public void kartenlisteausgabe(){
		for(int i = 0; i<kartenArray.length;i++){
			//System.out.println(kartenliste[i]); gibt ID aus
			System.out.println("   "+kartenArray[i].getwertOben()+"\n"+kartenArray[i].getwertUnten()+"  "+"  "+kartenArray[i].getwertLinks()+"\n"+"   "+kartenArray[i].getwertRechts());
			System.out.println("");
		}
}
}
