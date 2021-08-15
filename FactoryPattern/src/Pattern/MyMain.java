package Pattern;

public class MyMain {

	public static void main(String[] args) {
		Shape obj = Factory.build("circle");
		System.out.println(obj.draw());

	}

}
