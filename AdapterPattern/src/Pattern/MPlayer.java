package Pattern;

public class MPlayer implements MediaPlayer{
	Adapter adapter = new Adapter();
	public void play(String name) {
		if (name == "mp3") {
			System.out.println("Playing mp3");
		}
		
		else {
			adapter.play(name);
		}
		
	}

}
