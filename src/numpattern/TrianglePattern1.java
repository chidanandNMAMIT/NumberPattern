package numpattern;

public class TrianglePattern1 {

	public static void main(String[] args) {

		for (int i = 3; i >0; i--) {
			for (int j = 0; j<=3; j++)
			{
				if (i==j) 
				{
					System.out.print("* ");
				} 
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
