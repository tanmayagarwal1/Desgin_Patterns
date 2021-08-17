package Pattern;

public class ConcMediaPlayer implements MediaPlayer{
	Adapter adapter = new Adapter();
	public void run(String s) {
		if (s == "mp3") {
			System.out.println("Running mp3");
		}
		else {
			adapter.run(s);
		}
		
	}

}
