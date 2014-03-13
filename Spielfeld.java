
public class Spielfeld {
	
	public static void main (String[] args){

		// Spielfeld initialisieren
		int[][] feld = new int[3][3];
		
		// Durch das Spielfeld iterieren
		for(int i = 0; i<3; i++)
		{
			// zuerst x-Koordinate, dann Y-Koordinate
			for(int j=0; j<3; j++){
				
					System.out.print(i +""+ j+"  ");
					
				if(j==2){
					System.out.println("");
						}
				}
				
		 }
	}

}
