package builder;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boss angel = 
				new Boss.Builder("Archimonde").atSize("Massive")
				.withHp(20).withType(Type.DEMON).build();
		
		System.out.println(angel.toString());
 		
	}

}
