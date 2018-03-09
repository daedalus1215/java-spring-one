package spring.one.Coach;


import spring.one.Fortune.Service.FortuneServiceInterface;



public class CricketCoach implements CoachInterface{
	
	private FortuneServiceInterface fortuneService;

	
	public CricketCoach() {
	
	}
	
	
	public void setFortuneService(FortuneServiceInterface fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "ddddddddddddd";
	}
}
