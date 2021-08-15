package Pattern;

public class Context {
	Operations ops;
	public Context(Operations ops) {
		this.ops = ops;
	}
	
	public void run(int x, int y) {
		ops.doOperation(x, y);
	}

}
