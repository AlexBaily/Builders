package builder;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boss boss1 = 
				new Boss.Builder("M.Bison").atSize("Medium")
				.withHp(20).withType(Type.HUMAN).build();
		
		System.out.println(boss1.toString());
 		
	}

}
