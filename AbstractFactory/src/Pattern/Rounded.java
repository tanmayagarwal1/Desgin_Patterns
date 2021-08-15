package Pattern;

public class Rounded implements Factory{
	public Shape build(String name) {
		if (name == "2") {
			return new RoundedTraingle();
		}
		
		else if (name == "3") {
			return new RoundedSquare();
		}
		
		return null;
	}

}
