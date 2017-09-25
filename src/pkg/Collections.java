package pkg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;



public class Collections {
	public static void main(String[] args) {
		
		
		ArrayList ar= new ArrayList();
		ar.add("sdfdfsdf");
	java.util.Collections.addAll(ar, "sdfsdfsdf","sdfsdfsdf","fsdfsdf");
	System.out.println(ar.size());
	List<Object> dd = java.util.Collections.emptyList();
	System.out.println(dd.size());
	java.util.Collections.sort(ar);
	System.out.println(ar);
	java.util.Collections.sort(ar, java.util.Collections.reverseOrder());
	System.out.println(ar);
	ar.get(0);
	ar.remove(0);
	HashSet<String> hs= new HashSet<String>();
	java.util.Collections.addAll(hs, "1","2","3","4","5");
	System.out.println(hs.size());
	java.util.Collections.reverse(ar);
System.out.println(ar);
ArrayList<String> ar1= new ArrayList<>(hs);
System.out.println(ar);
java.util.Collections.reverse(ar1);
System.out.println(ar1);

	}

}
