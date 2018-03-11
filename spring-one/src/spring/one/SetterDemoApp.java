package spring.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.one.Coach.CoachInterface;
import spring.one.Coach.CricketCoach;

public class SetterDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println("Email address of coach: " + theCoach.getEmailAddress());
		System.out.println("Team is: " + theCoach.getTeam());
		context.close();
	}

}
