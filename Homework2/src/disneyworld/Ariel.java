package disneyworld;

public class Ariel {

	public static void main(String[] args) {
		Ariel girl = new Ariel();
		girl.Pink(100,100,100,100,100);
		girl.blue("morning", " man", " lady", " forest");
		
	}
    public void Pink (int red,int blue,int white,int black,int gray) {
    	int allcolor = red+blue+white+black+gray;
    	System.out.println(allcolor);
    }
    public void blue (String good,String bad,String nice,String lion) {
    	String result = good+bad+nice+lion;
    	System.out.println(result);
    }
    
    
}
