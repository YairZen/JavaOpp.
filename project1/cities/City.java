package cities;

/*
 * City class: Represents individual cities in a city network
 * and manages connections to other cities.
 */

public class City {
	private String name;
	private Road[] roads;
	private int numRoads;

	// Constructor initializes empty array in size of 'size'
	public City(String name) {
		this.name = name;
		roads = new Road[10]; // max of roads
		this.numRoads = 0; // initialize to 0
	}

	// Adds the road to the city's list of roads
	public void connect(Road r) {
		if (numRoads < 10) {
			roads[numRoads] = r;
			numRoads++; // Increment numRoads after adding a road
		}
	}

	// Returns the nearest city or null if no city is connected.
	public City nearestCity() {
		if (numRoads == 0) // no city is connected
			return null;

		// initialize the minimum and nearest city to first road - and his city
		int minimumLength = roads[0].getLength();
		City nearestCity; // nearestCity variable for result
		// Road of minimumLength connect 2 cities, we choose the 'other' city
		if (this == roads[0].getCity1()) // "this" is the current object of city
			nearestCity = roads[0].getCity2();
		else
			nearestCity = roads[0].getCity1();

		// we already check 0, start from 1
		for (int i = 1; i < numRoads; i++) {
			City city1 = roads[i].getCity1();
			City city2 = roads[i].getCity2();
			City otherCity;
			if (this == city1)
				otherCity = city2;
			else
				otherCity = city1;

			// calculate the minimum length, and set the City nearest by him
			int tempLength = roads[i].getLength();
			if (tempLength < minimumLength) {
				minimumLength = tempLength;
				nearestCity = otherCity;
			}
		}
		return nearestCity;

	}

	// Method to get the name of the city
	public String toString() {
		return name;
	}

}
