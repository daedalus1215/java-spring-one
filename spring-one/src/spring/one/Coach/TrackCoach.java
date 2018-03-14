package spring.one.Coach;

public class TrackCoach implements CoachInterface {

	public TrackCoach() {
		System.out.println("no-arg constructors");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}
	
	
	
	// add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	// add a destroy method
	public void doMyDestroyStuff() {
		System.out.println("TrackCoach: inside method doMyDestroyStuff");
	}
}
