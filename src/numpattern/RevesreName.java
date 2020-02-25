package numpattern;

public class RevesreName {

	public static void main(String[] args) {

		String st = "My name is java";
		StringBuffer res = new StringBuffer(st.replaceAll(" ", "")).reverse();//avajsiemanyM
		for (int i = 0; i < st.length(); i++) {							//av ajsiemanyM -->first traverse
			if (st.charAt(i) == ' ') {									//av ajsi emanyM -->Second traverse
				res.insert(i, ' ');										//insert (inserts at given index)			
			}
		}
		
		System.out.println(st);
		System.out.println(res);

	}
}
