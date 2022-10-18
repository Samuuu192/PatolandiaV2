package sara.projects.patolandia;

public interface FlyNoWay extends FlyBehavior {
	@Override
	public default void fly() {
		System.out.println("...");
	}
}
