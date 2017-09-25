package pkg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Colle {
	public static void main(String[] args) {
		
		
		ArrayList ar= new ArrayList();
		
		for(int i=0;i<10;i++){
			ar.add(i);
		}
		System.out.println(ar);
		Collections.sort(ar);
		System.out.println(ar);
		//Collections.reverse(ar);
		System.out.println(ar);
		Collections.sort(ar, Collections.reverseOrder());
		System.out.println(ar);
		
ArrayList ar1= new ArrayList(ar);
System.out.println(ar1.size());
System.out.println(ar.equals(ar1));
  List<Object> l1 = Collections.emptyList();
  System.out.println(l1.size());

  System.out.println(l1.isEmpty());
  Object[] uuu = ar.toArray();
  int[] a={1,1,1,1,1,1,1,2};
  for(int i=0;i<a.length;i++){
	  int oo = a[i];
	  l1.add(oo);
  }
  ar.clear();
  boolean ppp = ar.contains(2);
  
  


	}

}
