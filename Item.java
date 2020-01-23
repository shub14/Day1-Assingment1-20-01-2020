package projectday1;

public abstract class Item {


	private int ID;
	private String title;
	private int no_of_copies;

	public Item(int ID,String title,int no_of_copies){
		System.out.println("Constructor called");
		this.setID(ID);
		this.setTitle(title);
		this.setNo_of_copies(no_of_copies);
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNo_of_copies() {
		return no_of_copies;
	}

	public void setNo_of_copies(int no_of_copies) {
		this.no_of_copies = no_of_copies;
	}
	

}
 
