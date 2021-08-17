package Pattern;

public class SingleObject {
	private static  SingleObject obj = new SingleObject();
	private SingleObject() {};
	public static SingleObject getter() {
		return obj;
	}
	public void run() {
		System.out.println("This is now running");
	}
	

}
