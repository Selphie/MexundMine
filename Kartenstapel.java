
public class Kartenstapel {

	static Spielkarte[] kartenstapelx;
	public Kartenstapel(Spielkarte[] kartenstapelx){
		this.kartenstapelx = kartenstapelx;
	}
	public static void main(String[] args){
		Spielkarte[] kartenstapel1 = {Spielkarte.Heulechse,Spielkarte.FongoOngo};
		Kartenstapel kartenstapelx = new Kartenstapel(kartenstapel1);
		kartenstapelx.kartenstapelausgabe();
	}
	public void kartenstapelausgabe(){
		for(int i = 0; i<kartenstapelx.length;i++){
			//System.out.println(kartenliste[i]); gibt ID aus
			System.out.println("   "+kartenstapelx[i].getwertOben()+"\n"+kartenstapelx[i].getwertUnten()+"  "+"  "+kartenstapelx[i].getwertLinks()+"\n"+"   "+kartenstapelx[i].getwertRechts());
			System.out.println("");
		}


	}
	/*public Spielkarte[] getkartenstapel(){
		return kartenstapelx;
	}
	public void setkartenstapel(Spielkarte[] kartenstapelx){
		this.kartenstapelx = kartenstapelx;
	}*/
	
}
