package Pattern;

public class Adapter implements MediaPlayer{
	AdvPlayer player;
	public void run(String s) {
		if (s == "mp4") {
			player = new Mp3();
			player.runmp3();
		}
		
		else if (s == "vlc") {
			player = new Vlc();
			player.runvlc();
		}
	}

}
