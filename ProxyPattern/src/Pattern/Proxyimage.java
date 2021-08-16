package Pattern;

public class Proxyimage implements Image{
	Realimage img ;
	private String s;
	public Proxyimage(String s) {
		this.s = s;
	}
	
	public void display() {
		if (img == null) {
			img = new Realimage(s);
		}
		img.display();
		
	}

}
