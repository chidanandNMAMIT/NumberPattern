package numpattern;

public class TringlePattern {

	public static void main(String[] args) {
		
		int rows=5;
		for (int i = rows; i>=1; i--) {
			for(int j=1; j<=i; j++) {
			System.out.print(i+" ");// for Row constant print(i)
//				System.out.print(j+" ");  // for Coloumn constant print(J)
			}
			System.out.println();
		}
	}
}
