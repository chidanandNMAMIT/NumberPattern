package numpattern;

public class FloyedTriangle {

	public static void main(String[] args) {
		int number=1;
		int row=5;
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=i; j++) {
			System.out.print(number +" ");
			number++;
			}
			System.out.println();
		}

	}

}
