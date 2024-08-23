package universalstudio;

public class Fiona {

	public static void main(String[] args) {
		Fiona.Moody(10, 20, 30, 40, 50);
	}
   public static void Moody (int baby,int girl,int woman,int man,int boy) {
	   int gender = baby*girl*woman*man*boy;
	   System.out.println(gender);
   }
}
