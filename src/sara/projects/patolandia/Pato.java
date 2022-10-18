package sara.projects.patolandia;

public class Pato {
	private String name;
	private String type;
	
	public Pato(String name,String type){
		this.name = name;
		this.type = type;
	}
	
	public void display() {
		System.out.format("\nSou %s, um Pato %s!\n",name,type);
	}
}
