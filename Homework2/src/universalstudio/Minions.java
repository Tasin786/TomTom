package universalstudio;

public class Minions {

	public static void main(String[] args) {
		Minions.yellow(10.10, 10.10, 20.00, 30.00, 10.10);
	}
   public static void yellow (double sky,double moon,double sun,double sea,double hill) {
	   double world = sky*moon*sun*sea*hill;
	   System.out.println(world);
	   
   }
}
