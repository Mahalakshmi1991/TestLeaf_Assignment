package week2.day1;

//Class Library Management is created to access the Library class by creating object
public class LibraryManagement 
{
	public static void main(String[] args) {
		Library libObject = new Library();
		System.out.println(libObject.addBook("The Harry Potter"));
		libObject.issueBook();

	}

}
