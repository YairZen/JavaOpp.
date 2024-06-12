package cities;

/*
 * Road class: Represents roads connecting cities and provides access
 * to information about the connected cities and the length of the road.
 */

public class Road {
	private City city1;
	private City city2;
	private int length;

	// Constructor initializes Road field, and add this road to city 1 and 2
	public Road(City city1, City city2, int length) {
		this.city1 = city1;
		this.city2 = city2;
		this.length = length;
		city1.connect(this); // "this" here is the current road
		city2.connect(this);

	}

	public City getCity1() {
		return city1;
	}

	public City getCity2() {
		return city2;
	}

	public int getLength() {
		return length;
	}

}
