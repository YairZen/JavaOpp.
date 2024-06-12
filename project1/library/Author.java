package library;

/*
 * Author class: Manages author information and calculates author age.
 */

public class Author {
	private String name;
	private int birthYear;

	public Author(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	public String getName() {
		return name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	// Method to return the author's age given the current year
	public int getAge(int thisYear) {
		return (thisYear - birthYear);
	}

	public String toString() {
		return name + "(" + birthYear + ")";
	}

}
