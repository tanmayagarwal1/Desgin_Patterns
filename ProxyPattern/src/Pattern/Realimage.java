package Pattern;

public class Realimage implements Image{
	private String s;
	public Realimage(String s) {
		this.s = s;
		load(s);
	}
	
	private void load(String s) {
		System.out.println("Loading from " + s);
	}
	
	public void display() {
		System.out.println("Running image");
	}

}
