package numpattern;

public class ReversePyramid {

	public static void main(String[] args) {
	
		
		
		 for(int i=3; i>0; i--) {
			for(int j=i; j<3; j++) { 
				System.out.print(" ");
			}
			for(int k=i*2-1; k>0; k--) {
				System.out.print("*");
			}
			System.out.println();
		 }
		
			
		 
         }

	}


