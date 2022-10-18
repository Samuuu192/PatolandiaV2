package sara.projects.patolandia;

public interface Squeak extends QuackBehavior {
	@Override
	public default void quack() {
		System.out.println("Squeak!");
	}
}
