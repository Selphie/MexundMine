import java.util.Vector;

public class Kartenstapel {

	private Vector <Spielkarte> kartenpool = new Vector<Spielkarte>();

	public Kartenstapel(){	
		kartenpool.add(Spielkarte.Heulechse);
		kartenpool.add(Spielkarte.FongoOngo);
		kartenpool.add(Spielkarte.Beisskaefer);
		kartenpool.add(Spielkarte.Purpurmaus);
		kartenpool.add(Spielkarte.Prinula);
		kartenpool.add(Spielkarte.Geira);
		kartenpool.add(Spielkarte.Gesper);
	}

	public Spielkarte popRandomKarte()
	{
		int r = (int)(Math.random()*kartenpool.size());
		return kartenpool.remove(r);	
	}


}
