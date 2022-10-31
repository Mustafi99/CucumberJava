package methodOverriding;

public class Main {

	public static void main(String[] args) {
		/*parentClass parent = new parentClass();
		parent.launchApp();
		
		childClass child = new childClass();
		child.launchApp();
		*/
		
		parentClass  upcast = new childClass();
		upcast.launchApp();
		
		
		
	}

}
