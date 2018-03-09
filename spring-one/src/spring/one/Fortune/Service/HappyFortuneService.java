package spring.one.Fortune.Service;

public class HappyFortuneService implements FortuneServiceInterface {

	/* (non-Javadoc)
	 * @see spring.one.Fortune.Service.FortuneServiceInterface#getFortune()
	 */
	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}
}
