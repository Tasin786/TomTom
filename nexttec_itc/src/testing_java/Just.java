package testing_java;

public class Just {

	public static void main(String[] args) {
		Just rainbo = new Just();
		rainbo.Moon("hair", " rose", " tree", " sun");
		Just.shakil("safin", " nihan", " shabab");
		
	}
   public void Moon (String black,String red,String green,String orange) {
	   String color = black+red+green+orange;
	   System.out.println(color);
	   
   }
   public static void shakil (String samara,String binty,String muntaseer) {
	   String fullname = samara+binty+muntaseer;
	   System.out.println(fullname);
   }
	public void mohammad (int ab,int bc,int cd) {
		int result = ab*bc*cd;
		System.out.println(result);
		
	}
}
