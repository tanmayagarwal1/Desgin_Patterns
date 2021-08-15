package Pattern;

public class FactoryBuilder {
	public static Factory builder(boolean val) {
		if (val) {
			return new Rounded();
		}
		
		else {
			return new Smooth();
		}
		
	}

}
