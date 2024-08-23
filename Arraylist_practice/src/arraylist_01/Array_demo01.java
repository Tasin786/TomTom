package arraylist_01;

import java.util.ArrayList;

public class Array_demo01 {

	public static void main(String[] args) {
		Array_demo01 night = new Array_demo01 ();
		night.tom();
		
	}
   public void tom () {
	   ArrayList obj = new ArrayList ();
	   obj.add("tim");
	   obj.add("titi");
	   obj.add(100);
	   obj.add(100);
	   obj.add(10.10);
	   obj.add(20.20);
	  // System.out.println(obj);
	   
	   int jojo = obj.size();
	  // System.out.println(jojo);
	   
	   for (int i = 0 ; i < obj.size(); i ++) {
		   System.out.println(obj.get(i));

	   }
	   
	   
	   
	   
   }
}
