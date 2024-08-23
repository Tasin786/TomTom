package arraylist_01;

import java.util.ArrayList;

public class Arraylist_01_new2 {

	public static void main(String[] args) {
	
		Arraylist_01_new2.tabassum();
		
		
	}
    public static void tabassum () {
  
		ArrayList morning = new ArrayList ();
    	morning.add("night");
    	morning.add("evening");
    	morning.add("day");
    	morning.add(100);
    	morning.add(200);
    	morning.add(300);
    	morning.add(10.10);
    	morning.add(20.20);
    	morning.add(30.40);
    	System.out.println(morning);

        int coco = morning.size();
        System.out.println(coco);
        
        System.out.println(morning.get(2));
    	
    	for (int i = 0; i <morning.size();i++) {
    		System.out.println(morning.get(i));
    		
    		
    	}
    	
    }	    	
}
       	
    	
    	
    	
    	
    	
    	
    

