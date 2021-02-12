package techcognitives.animal.main;

public class Animal {
	protected int height;
	protected int weight;
	protected String animal;
	protected String bloodtype;

	public Animal() {
		this.height = 0;
		this.weight = 0;
		this.animal = "unknown";
		this.bloodtype = "unknown";
	}

	public String showInfo() {
		return "Animal [height=" + height + ", weight=" + weight + ", animal=" + animal + ", bloodtype=" + bloodtype
				+ "]";
	}

}
