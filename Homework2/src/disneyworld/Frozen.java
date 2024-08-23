package disneyworld;

public class Frozen {

	public static void main(String[] args) {
		Frozen Doll = new Frozen();
		Doll.Fruit("love"," hate",  " soso",  " notreally",  " favorite");
		
	}
    public void Fruit (String orange,String banana,String apple,String grape,String cherry ) {
    	String allfruit = orange+banana+apple+grape+cherry;
    	System.out.println(allfruit);
    }
}
