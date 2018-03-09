package spring.one.Coach;

import spring.one.Fortune.Service.FortuneServiceInterface;

public class BaseballCoach implements CoachInterface {
	
	private FortuneServiceInterface fortuneService;
	
	/**
	 * 
	 * @param theFortuneService
	 */
	public BaseballCoach(FortuneServiceInterface theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	
	/* (non-Javadoc)
	 * @see spring.one.CoachInterface#getDailyWorkout()
	 */
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice \n" .concat(this.fortuneService.getFortune());		
	}
}
