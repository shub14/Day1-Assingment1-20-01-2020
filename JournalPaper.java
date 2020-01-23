package projectday1;

class JournalPaper extends WrittenItem{
	 JournalPaper(int ID, String title, int no_of_copies,String author) {
		super(ID, title, no_of_copies,author);
		// TODO Auto-generated constructor stub
	}

	private int year_published;
	
	public int getYear_published() {
		return year_published;
	}
	public void setYear_published(int year_published) {
		this.year_published = year_published;
	}
}