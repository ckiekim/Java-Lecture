package date190321.pr01;

public class SongLyricsExample {
	public static void main(String[] args) {
		String lyrics = "Love of my life, you've hurt me\r\n" + 
				"You've broken my heart and now you leave me\r\n" + 
				"Love of my life, can't you see?\r\n" + 
				"Bring it back, bring it back\r\n" + 
				"Don't take it away from me, because you don't know\r\n" + 
				"What it means to me";
		String[] composer = new String[] {"Freddie Mercury"};
		
		SongLyrics sl = new SongLyrics("Love of My Life", "Queen", 
				"A Night at the Opera", composer, 1975, 9, lyrics);
		sl.show();
	}
}
