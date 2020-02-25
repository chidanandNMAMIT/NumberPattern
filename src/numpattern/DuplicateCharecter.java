package numpattern;

public class DuplicateCharecter {

	public static void main(String[] args) {
		
		String str="indonesiain";
		String Duplicate="";
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j < str.length(); j++) {
				if(str.charAt(i)==str.charAt(j)) {
					if(!Duplicate.contains(str.valueOf(str.charAt(j)))) {
						Duplicate +=str.charAt(j);
						break;
					}
				}
			}
		}
		
		System.out.println(Duplicate);

	}

}
