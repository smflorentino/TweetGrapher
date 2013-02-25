package code;

public class Word {
	private int _count;
	private String _word;
	
	public Word(String w, int c) {
		_count=c;
		_word=w;
	}
	
	public int getCount() {
		return _count;
	}
	
	public String getWord() {
		return _word;
	}
}
