package sara.projects.patolandia;

public interface MuteQuack extends QuackBehavior {
	@Override
	public default void quack() {
		System.out.println("...!");
	}
}
