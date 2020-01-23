package projectday1;

class CD extends MediaItem{
	CD(int ID, String title, int no_of_copies,int Added) {
		super(ID, title, no_of_copies,Added);
		// TODO Auto-generated constructor stub
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	private String artist,genre;
}