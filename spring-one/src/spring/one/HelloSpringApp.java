package spring.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.one.Coach.CoachInterface;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		CoachInterface theCoach = context.getBean("myCricketCoach", CoachInterface.class);
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		// close the context
		context.close();
	}

}
