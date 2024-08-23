package old_practice;

public class Startwithendwith {

	public static void main(String[] args) {
		Startwithendwith nothing = new Startwithendwith ();
		nothing.anjana();
		nothing.anjani();
		Startwithendwith.prianka();
		Startwithendwith.chopra();
		
	}
   public void anjana () {
	   String name = ("kumkum lamia");
	   String name01 = ("sunny biva");
	   String name02 = ("ammu abbu");
	   String name03 = ("mamuni uncel");
	   boolean result = name.startsWith("lamia");
	   boolean result01 = name01.startsWith("biva");
	   boolean result04 = name02.startsWith("ammu");
	   boolean result99 = name03.startsWith("mamuni");
	   System.out.println(result);
	   System.out.println(result01);
	   System.out.println(result04);
	   System.out.println(result99);
	   
   }
   
   public void anjani () {
	   String love = ("alia ranber");
	   String love01 = ("dipika ranveer");
	   String love02 = ("kiara sid");
	   String love03 = ("laila majnu");
	   String love04 = ("dilip shayra");
	   String love05 = ("virat anuska");
	   boolean married = love.endsWith("alia");
	   boolean married01 = love01.endsWith("ranveer");
	   boolean married02 = love02.endsWith("kiara");
	   boolean married03 = love03.endsWith("majnu");
	   boolean married04 = love04.endsWith("dilip");
	   boolean married05 = love05.endsWith("anuska");
	   
	   System.out.println(married);
	   System.out.println(married01);
	   System.out.println(married02);
	   System.out.println(married03);
	   System.out.println(married04);
	   System.out.println(married05);
    	
    	 }
	public static void prianka ()   {
		String life = ("nice beautiful");
		String life01 = ("hard work");
		String life02 = ("deep breath");
		String life03 = ("enjoy live");
		String life04 = ("just do");
		boolean right = life.startsWith("beautiful");
		boolean right01 = life01.startsWith("work");
		boolean right02 = life02.startsWith("breath");
		boolean right03 = life03.startsWith("live");
		boolean right04 = life04.startsWith("do");
	   
	   System.out.println(right);
	   System.out.println(right01);
	   System.out.println(right02);
	   System.out.println(right03);
	   System.out.println(right04);
 }
	public static void chopra () {
		String job = ("tommy hilfiger");
		String job01 = ("seven eleven");
		String job02 = ("universal studio");
		String job03 = ("gift shop");
		String job04 = ("gas station");
		boolean past = job.endsWith("tommy");
		boolean past01 = job01.endsWith("seven");
		boolean past02 = job02.endsWith("universal");
		boolean past03 = job03.endsWith("gift");
		boolean past04 = job04.endsWith("gas");
		
		System.out.println(past);
		System.out.println(past01);
		System.out.println(past02);
		System.out.println(past03);
		System.out.println(past04);
	
	}
}
