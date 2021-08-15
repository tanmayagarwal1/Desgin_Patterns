package Pattern;

public class Helper {
	private Circle circle;
	private Traiangle triangle;
	private Square sq;
	
	public Helper() {
		circle = new Circle();
		triangle = new Traiangle();
		sq = new Square(); 
	}
	
	public void sq() {
		sq.disp();
	}
	
	public void tri() {
		triangle.disp();
	}
	
	public void circle() {
		circle.disp();
	}
}
