package projectday1;

public class WrittenItem extends Item{
	private String author;
	WrittenItem(int ID,String title,int no_of_copies,String author){
		super(ID,title, no_of_copies);
		this.author=author;
			}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}