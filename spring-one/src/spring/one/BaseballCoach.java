package spring.one;

public class BaseballCoach implements CoachInterface {

	/* (non-Javadoc)
	 * @see spring.one.CoachInterface#getDailyWorkout()
	 */
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}
}
