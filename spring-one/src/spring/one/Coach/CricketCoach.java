package spring.one.Coach;


import spring.one.Fortune.Service.FortuneServiceInterface;



public class CricketCoach implements CoachInterface{
	
	private FortuneServiceInterface fortuneService;
	private String emailAddress;
	private String team;
	
	
	public CricketCoach() {
		System.out.println("inside no-arg constructor.");
	}
	
	
	public void setFortuneService(FortuneServiceInterface fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	
	public void setTeam(String team) {
		this.team = team;
	}
	
	public FortuneServiceInterface getFortuneService() {
		return fortuneService;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public String getTeam() {
		return team;
	}


	@Override
	public String getDailyWorkout() {
		String workout = "called dailyWorkout() in Coach ";
		
		return workout.toString() + "\n" + this.fortuneService.getFortune();
	}
}
