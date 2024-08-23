package practice_work;

public class LOOP__WORK {

	public static void main(String[] args) {
		LOOP__WORK obj = new LOOP__WORK ();
		obj.boby();
		obj.gold();
		obj.toy();
		obj.joy();
		obj.roy();
	}
   public void boby () { 
	   for (int i = 0 ; i <= 20 ; i = i + 2) {
		  System.out.println(i);

	   }
   } 
   public void gold () { 
	   for ( int i = 0 ; i <= 30 ; i = i + 3) {
		  System.out.println(i);
	   }
   }
   public void toy () { 
	   for ( int i = 20 ; i > 10 ; i --) {
		  System.out.println(i);
	   }
   }
   public void joy () { 
	   for ( int i = 20 ; i > 10 ; i = i - 3 ) {
		   System.out.println(i);
	   }
   }
   public void roy () { 
	   for ( int i = 20 ; i > 10 ; i = i - 2) {
		   System.out.println(i);
	   }
   }   
}
