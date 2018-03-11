package spring.one.Fortune.Service;

import java.util.ArrayList;
import java.util.Random;

public class RandomFortuneService implements FortuneServiceInterface {

	private String[] fortunes = {
		"Beware of the wolf in sheep's clothing",
		"Diligence is the mother of good luck",
		"The journey is the reward"
	};
	
	private Random randomFortuneIndex = new Random();

	
	/* (non-Javadoc)
	 * @see spring.one.Fortune.Service.FortuneServiceInterface#getFortune()
	 */
	@Override
	public String getFortune() {		
		return this.fortunes[this.randomFortuneIndex.nextInt(this.fortunes.length)];
	}
}
