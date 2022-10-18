package sara.projects.patolandia;

public class Patolandia {
	public static void main(String[] args) {
		Mallard mallard = new Mallard("Pateta");
		RedHead redHead = new RedHead("Donald");
		Rubber rubber = new Rubber("Armenitas");
		Decoy decoy = new Decoy("Áristioteles");
		
		mallard.display();
		mallard.fly();
		mallard.quack();
		
		redHead.display();
		redHead.fly();
		redHead.quack();
		
		rubber.display();
		rubber.fly();
		rubber.quack();
		
		decoy.display();
		decoy.fly();
		decoy.quack();
	}
}
