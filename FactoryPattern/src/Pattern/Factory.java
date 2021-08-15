package Pattern;

public class Factory {
	public static Shape build(String name) {
		if(name == "circle") {
			return new Circle();
		}
		
		else if (name == "rectangle") {
			return new Rectangle();
		}
		
		else if(name == "sqaure"){
			return new Square();
		}
		else {
			return null;
		}
	}

}
