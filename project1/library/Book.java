package library;

/*
 * Book class: Represents individual books
 * provides access to book details and author information.
 */

public class Book {
	private String title;
	private Author auth;

	// Constructor receives name of the book and an instance of the Author class
	public Book(String title, Author auth) {
		this.title = title;
		this.auth = auth;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthorName() {
		return auth.getName();
	}

	public int getAuthorBirthYear() {
		return auth.getBirthYear();
	}

	public String toString() {
		return title + " written by " + auth.toString();
	}

}
