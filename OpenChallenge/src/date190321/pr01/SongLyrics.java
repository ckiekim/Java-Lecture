package date190321.pr01;

import java.util.Arrays;

public class SongLyrics extends Song {
	private String lyrics;

	public SongLyrics(String title, String artist, String album, String[] composer, int year, int track, String lyrics) {
		super(title, artist, album, composer, year, track);
		this.lyrics = lyrics;
	}
 
	@Override
	public void show() {
		super.show();
		System.out.println("가사");
		System.out.println(lyrics);
	}
}
