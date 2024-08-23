package universalstudio;

public class Hulk {

	public static void main(String[] args) {
    Hulk.Big("samara", " shafin", " sohana", " shakil", " setara");
	}
    public static void Big (String firstname,String lastname,String email,String phone,String DOB) {
    	String allresult = firstname+lastname+email+phone+DOB;
    	System.out.println(allresult);
    }
}
