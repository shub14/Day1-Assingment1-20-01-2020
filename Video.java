package projectday1;

public class Video extends MediaItem{
	Video(int ID, String title, int no_of_copies,int Added) {
		super(ID, title, no_of_copies,Added);
		// TODO Auto-generated constructor stub
	}
	private String director;
	private int year_released;
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getYear_released() {
		return year_released;
	}
	public void setYear_released(int year_released) {
		this.year_released = year_released;
	}
	
}
