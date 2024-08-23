package arraylist_01;

import java.util.ArrayList;

public class Arraylistofgenaric {

	public static void main(String[] args) {
		Arraylistofgenaric.good();
	}
      public static void good () {
    	  ArrayList<String> bad = new ArrayList<String> ();
    	  bad.add("morning");
    	  
    	  bad.add("night");
    	  bad.add("day");
    	  bad.add("nice");
    	  bad.remove(2);
    	 System.out.println(bad);
    	 
    	 for (String ball:bad) {
    	 System.out.println(ball);
    	  
    	 int coco= bad.size();
    	  System.out.println(coco);
    	  
      }
      }
}

