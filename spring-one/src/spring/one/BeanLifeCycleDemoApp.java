package spring.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.one.Coach.CoachInterface;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		CoachInterface theCoach = context.getBean("myCoach", CoachInterface.class);
		
		System.out.println(theCoach.getDailyWorkout());
		context.close();		
	}

}
