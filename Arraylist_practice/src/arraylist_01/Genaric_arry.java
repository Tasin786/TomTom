package arraylist_01;

import java.util.ArrayList;

public class Genaric_arry {

	public static void main(String[] args) {
		Genaric_arry nice = new Genaric_arry ();
		nice.Shakil();
		
		
	}
   public void Shakil () {
	   
	   ArrayList<String> momo = new ArrayList<String> ();
	    
	   momo.add("java");
	   momo.add("mama");
	   momo.add("nava");
	   momo.add("tana");
	   momo.add("vava");
	   
	   for (String lolo:momo) {
		   
		   System.out.println(lolo);
	   }
   }
}
