package starPatterns;

public class StarPattern3 {

	public static void main(String[] args) {
		for(int i=1; i<=4; i++){
		    for(int j=i; j<=4; j++){
		        System.out.print("*");
		    }
		   
		    for(int k=4; k>=i; k--) {
		    	System.out.print("");
		    }
		    
		    System.out.println();
		}

	}

}
