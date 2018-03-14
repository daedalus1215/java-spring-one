package spring.one.Coach;

public class TrackCoach implements CoachInterface {

	public TrackCoach() {
		System.out.println("no-arg constructors");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}
}
