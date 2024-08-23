package practice_string_class;

public class i_did {

	public static void main(String[] args) {
		i_did hate = new i_did ();
		hate.alia();
		hate.sumaiya();
		hate.samara();
	}
	public void alia (){
		  String life = ("  nabila   ");
		  String lunch = ("     alvi        ");
		 String night = ("      anam   ");
		  String result = life.trim();
		  String result2 = lunch.trim();
		 String result3 = night.trim();
		  System.out.println(result);
	   System.out.println(result2);
		 System.out.println(result3);
	}
   public void sumaiya () { 
		   String fruit = ("orange");
		   String makeup = ("lipstic");
		   boolean result8 = fruit.equalsIgnoreCase("ORANGE");
		   boolean result9 = makeup.equalsIgnoreCase("lipstic");
		   System.out.println(result8);
		   System.out.println(result9);
}
    public void samara () {
    	String cake = ("SAMOSA");
    	String butter = ("BREAD");
    	boolean friday = cake.equals("samosa");
    	boolean saturday = butter.equals("bread");
    	System.out.println(friday);
    	System.out.println(saturday);
    }
    public void manara () {
 	   String name = ("sohana rahaman");
 	   String name2 = ("mohammad hasan");
 	   String name3 = ("tasin tabassum");
 	   boolean result = name2.startsWith("hasan");
 	  boolean koko = name.endsWith("rahaman");
 	 boolean lolo = name3.startsWith("tasin");
 	 System.out.println(lolo);
 	 System.out.println(koko);
 	 System.out.println(result);
   }
    public void dipika () {
 	   String dhaka = ("bangla");
 	   String orlando = ("florida");
 	   char tom = dhaka.charAt(4);
 	   char joy = orlando.charAt(5);
 	   System.out.println(tom);
 	   System.out.println(joy);
     }
    
    
}