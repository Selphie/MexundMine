
public class Spielkarte {
	
	int[][] karte = new int[3][3];
	
	karte[0][1] = 5;
	karte[1][0] = 3;
	karte[1][2] = 3;
	karte[2][1] = 2;
	
	System.out.println("   "+karte[0][1]+"\n"+karte[1][0]+"     "+karte[1][2]+"\n"+"   "+karte[2][1]);

	
}
