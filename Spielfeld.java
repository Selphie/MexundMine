
public class Spielfeld {
	
	public static void main (String[] args){

	int[][] feld = new int[2][2];
	
	for(int i = 0; i<3; i++)
	{
		for(int j=0; j<3; j++){
			feld[i][j] = i;
			feld[i][j] = j;
			System.out.println(i+j);
		}

	}
}
}