package main;

class Book{
	String title;
	String author;
	final int bookID;
    static int bookCounter = 1000;
	final static String LIBRARY_NAME = "Central_Library";
	
	
	Book(){
		title = "Unknown";
		author = "Unknown";
		bookID = bookCounter++;
	}
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
		bookID = bookCounter++;
	}
	
	void displayInfo(){
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Book ID: " + bookID);
	}
	void displayInfo(boolean showLibrary){
		if(showLibrary == true) {
			System.out.println(LIBRARY_NAME);
		}

	}
	
	void displayTotalBooks(){
		System.out.println("Total Book Count: " + bookCounter);

	}
}

public class library {
	public static void main(String[] args) {
		Book b1 = new Book("Harry Potter","J K Rowling");
	}
}
