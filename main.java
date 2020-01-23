package projectday1;

public class main {

	  public static void main(String[] args) {
		  Item i = new WrittenItem(0,"python",10,"shubham");
		  System.out.println("Id: "+ i.getID() +"Title "+ i.getTitle() + "no_of_copies: "+ i.getNo_of_copies() );
		  i.setTitle("Java Book");
		  i.setID(1);
		  i.setNo_of_copies(10);
		  System.out.println(i.getTitle());
		  
		
		}
	  }

