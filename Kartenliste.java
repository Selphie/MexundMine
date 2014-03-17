import java.util.Vector;


public class Kartenliste {
	
	private Vector <Spielkarte> kartenpool = new Vector<Spielkarte>();

	public Kartenliste(Kartenstapel k){
		kartenpool = new Vector<Spielkarte>();
		for(int i = 0; i < 5; i++){
			Spielkarte j = k.popRandomKarte();
			kartenpool.add(j);
			System.out.println("       "+j.getwertOben()+"\n"+j.getwertLinks()+"  "+j.kartenname+"  "+j.getwertRechts()+"\n"+"       "+j.getwertUnten()+"\n");
		}
	}
	
	public static void main(String[] args){
		Kartenstapel a = new Kartenstapel();
		Kartenliste kl = new Kartenliste(a);
		}
	


}
