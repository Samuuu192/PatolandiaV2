package sara.projects.patolandia;

public interface FlyWithWings extends FlyBehavior {
	@Override
	public default void fly() {
		System.out.println("Voando...");
	}
}
