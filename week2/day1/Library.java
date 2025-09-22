package week2.day1;

//Create a class to manage books
public class Library {
	
	//addBook method is created to add the books
	public String addBook(String bookTitle)
	{
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	//issueBook method is created to print print issued books
	public void issueBook()
	{
		System.out.println("Book issued successfully");
	}

	//methods are called by creating object for the Library class
	public static void main(String[] args) 
	{
		Library libObject = new Library();
		System.out.println(libObject.addBook("The Lord of the Rings"));
		libObject.issueBook();

	}

}
