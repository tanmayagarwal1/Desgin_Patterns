package Pattern;

public class Adapter implements MediaPlayer{
	AdvMediaPlayer player;
	public void play(String name) {
		if (name == "mp4") {
			player = new Mp4Player();
			player.mp4();
		}
		
		else {
			player = new VlcPlayer();
			player.vlc();
			
		}
	}
	

}
