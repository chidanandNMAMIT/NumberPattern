package numpattern;

import java.util.HashSet;
import java.util.Set;

public class InterviewQuestion {

	public static void main(String[] args) {
		
		
		Set<Integer> s1 = new HashSet<Integer>();
		s1.add(2);
		s1.add(5);
		s1.add(8);
		s1.add(6);
		
		Set<Integer>  s2 = new HashSet<Integer> ();
		s2.add(2);
		s2.add(8);
		
		s1.retainAll(s2);
		System.out.println(s1);
	}

}
