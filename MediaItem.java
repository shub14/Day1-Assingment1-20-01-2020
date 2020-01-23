package projectday1;

public abstract class MediaItem extends Item{
	MediaItem(int ID,String title,int no_of_copies,int Added){
		super(ID,title, no_of_copies);
		this.Added=Added;
	}
	public int getAdded() {
		return Added;
	}
	public void setAdded(int added) {
		Added = added;
	}
	private int Added;
}
