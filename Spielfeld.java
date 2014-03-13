/**
 * Hauptklasse für das Spielfeld
 * @author Myriel Fichtner, Mark Fichtner
 */
public class Spielfeld {
	
	// Hauptfunktion
	public static void main (String[] args){
		
		// Spielfeld initialisieren
		int[][] feld = new int[2][2];
		
		// Durch das Spielfeld iterieren
		for(int i = 0; i<3; i++)
		{
			// zuerst x-Koordinate, dann Y-Koordinate
			for(int j=0; j<3; j++){
				// Hier tun wir irgendwas komisches... ich weiss ned so recht was
				feld[i][j] = i;
				feld[i][j] = j;
				// und ich weiss auch ned, wieso man das da tut ^^
				System.out.println(i+j);
			}
		}
	}
}