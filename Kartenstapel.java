
public class Kartenstapel {

	private Spielkarte[] kartenArrayx;
	public Kartenstapel(Spielkarte[] kartenArrayx){
		this.kartenArrayx = kartenArrayx;
	}
	//diese Sachen muessen spaeter in die große Main
	public static void main(String[] args){
		Spielkarte[] kartenArray1 = {Spielkarte.Heulechse,Spielkarte.FongoOngo};
		Kartenstapel kartenstapelx = new Kartenstapel(kartenArray1);
		Spielkarte[] kartenArray2 = {Spielkarte.Heulechse,Spielkarte.FongoOngo};
		Kartenstapel kartenstapely = new Kartenstapel(kartenArray2);
	}
	//braucht man vermutlich spaeter nichtmehr, weil Kartenstapel nicht ausgegeben werden soll
	/*public void kartenstapelausgabe(){
		for(int i = 0; i<kartenArrayx.length;i++){
			//System.out.println(kartenliste[i]); gibt ID aus
			System.out.println("   "+kartenArrayx[i].getwertOben()+"\n"+kartenArrayx[i].getwertUnten()+"  "+"  "+kartenArrayx[i].getwertLinks()+"\n"+"   "+kartenArrayx[i].getwertRechts());
			System.out.println("");
		}
	*/


}
	
