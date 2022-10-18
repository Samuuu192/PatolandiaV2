package sara.projects.patolandia;

public interface Quack extends QuackBehavior {
	@Override
	public default void quack() {
		System.out.println("Quack!");
	}
}
