package spring.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.one.Coach.CoachInterface;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		CoachInterface theCoach = context.getBean("myCoach", CoachInterface.class);
		
		CoachInterface alphaCoach = context.getBean("myCoach", CoachInterface.class);
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\n Pointing to the same object: " + result);
		

		System.out.println("\n Memory location for theCoach: " + theCoach);
		System.out.println("\n Memory location for theCoach: " + alphaCoach + "\n");
		context.close();		
	}
}
