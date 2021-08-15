package Pattern;

public class MyMain {

	public static void main(String[] args) {
		Context Helper = new Context(new Adder());
		Helper.run(5, 10);

	}

}
