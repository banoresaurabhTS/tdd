package co.interleap.courses.tdd;

public class CabStatement {

	public static int BASE_DIST_FARE = 10;
	public static int BASE_TIME_FARE = 1;
	public double fare(double distance, double time) {
		return BASE_DIST_FARE * distance + BASE_TIME_FARE * time;
	}

}
