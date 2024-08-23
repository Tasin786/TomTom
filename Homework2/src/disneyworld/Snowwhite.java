package disneyworld;

public class Snowwhite {

	public static void main(String[] args) {
		Snowwhite blue = new Snowwhite();
		blue.Favorite(10.10, 10.00, 10.10, 10.10, 10.10);
	}
   public void Favorite (double hand,double leg, double eye,double head,double nose) {
	   double body = hand*leg*eye*head*nose;
	   System.out.println(body);
   }
}
