package library;

/*
 * Library class: Manages the collection of books in the library
 * provides methods to interact with the library's inventory (get set).
 */

public class Library {
	private int size;
	private Book[] arr; // - array of Books

	// Constructor initializes empty array in size of 'size'
	public Library(int size) {
		this.size = size;
		arr = new Book[size];
	}

	// Method to set a book at a specific position in the library
	public void setBook(int bookNum, String title, Author auth) {
		if (bookNum >= 0 && bookNum < size)
			arr[bookNum] = new Book(title, auth);
	}

	// Method to get a book at a specific position in the library
	public Book getBook(int bookNum) {
		// In case book number not valid
		// if the place empty return null
		if (bookNum >= 0 && bookNum < size)
			return arr[bookNum];
		else
			return null;
	}

}
