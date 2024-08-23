package old_practice;

public class Equalignore {

	public static void main(String[] args) {
		Equalignore queen = new Equalignore ();
		queen.mamuni();
		Equalignore.ammu();
		
	}
   public void mamuni () {
	   String bird = ("SNOW");
	   String bird01 = ("NICE");
	   String bird02 = ("white");
	   String bird03 = ("black");
	   String bird04 = ("blue");
	   boolean apple = bird.equalsIgnoreCase("snow");
	   boolean apple01 = bird01.equalsIgnoreCase("nice");
	   boolean apple02 = bird02.equalsIgnoreCase("WHITE");
	   boolean apple03 = bird03.equalsIgnoreCase("BLACK");
	   boolean apple04 = bird04.equalsIgnoreCase("blue");
	   
	   System.out.println(apple);
	   System.out.println(apple01);
	   System.out.println(apple02);
	   System.out.println(apple03);
	   System.out.println(apple04);
	   
   }
   public static void ammu () {
	   String tom = ("green");
	   String tom01 = ("yellow");
	   String tom02 = ("orange");
	   String tom03 = ("pink");
	   String tom04 = ("golden");
	   boolean joy = tom.equalsIgnoreCase("green");
	   boolean joy01 = tom01.equalsIgnoreCase("yellow");
	   boolean joy02 = tom02.equalsIgnoreCase("ORANGE");
	   boolean joy03 = tom03.equalsIgnoreCase("pink");
	   boolean joy04 = tom04.equalsIgnoreCase("GOLDEN");
	   
	   System.out.println(joy);
	   System.out.println(joy01);
	   System.out.println(joy02);
	   System.out.println(joy03);
	   System.out.println(joy04);

	   
	   
	   
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
