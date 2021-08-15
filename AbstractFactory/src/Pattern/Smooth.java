package Pattern;

public class Smooth implements Factory{
	public Shape build(String name) {
		if (name == "1") {
			return new Circle();
		}
		
		else if (name == "2") {
			return new Triangle();
		}
		
		else if (name == "3") {
			return new Square();
		}
		return null;
	}

}
