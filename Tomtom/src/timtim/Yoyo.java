package timtim;

public class Yoyo {

	public static void main(String[] args) {
      Yoyo good = new Yoyo();
      good.tom();
      good.startwith();
      good.mamuni();
      good.abid();
      good.sohana();
	} 
    public void tom () {
    	int a = 200;
    	System.out.println(a);
    }
    
    public void startwith () {
    	String shakil = ("tasin tabassum");
    	boolean hasan = shakil.startsWith("tasin");
    	System.out.println(hasan);
    }
    public void mamuni () {
    	String ammu = ("mazeda begum");
    	boolean choto = ammu.endsWith("mazeda");
    	System.out.println(choto);
    
    }
    public void abid () {
    	String fardin = ("mohammad hussain");
    	boolean kaka = fardin.startsWith("hussain");
    	System.out.println(kaka);
    	  }
    public void sohana () {
    	String manara = ("farhana ismail");
    	boolean not = manara.endsWith("farhana");
    	System.out.println(not);
    }
    
    
}
