package practice_string_class;

public class Just_do_it {

	public static void main(String[] args) {
		Just_do_it love = new Just_do_it ();
		love.manara();
		love.dipika();
		love.alia();
		love.sonam();
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

  public void alia (){
   String life = ("  nabila   ");
  String lunch = ("     alvi        ");
 String night = ("      anam   ");
   String result = life.trim();
   String result2 = lunch.trim();
   String result5 = night.trim();
   System.out.println(result);
   System.out.println(result2);
   System.out.println(result5);
  }
   
   public void sonam() {
	   String fruit = ("orange");
	   String makeup = ("lipstic");
	   boolean result8 = fruit.equalsIgnoreCase("ORANGE");
	   boolean result9 = makeup.equalsIgnoreCase("lipstic");
	   System.out.println(result8);
	   System.out.println(result9);


   }
}









