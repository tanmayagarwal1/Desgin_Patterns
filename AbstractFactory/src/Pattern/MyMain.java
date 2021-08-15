package Pattern;

public class MyMain {

	public static void main(String[] args) {
		Factory factory = FactoryBuilder.builder(false);
		Shape my_shape = factory.build("1");
		System.out.println(my_shape.draw());

	}

}
