package techcognitives.child.animal;

import techcognitives.animal.main.Animal;

public class Bird extends Animal {
	protected boolean withfeather;
	protected boolean canfly;
	
	public Bird() {
		height = 2;
		weight = 20;
		animal = "bird";
		bloodtype = "warmblood";
		this.withfeather = true;
		this.canfly = true;
	}

	public String showInfo() {
		return "Bird [withfeather=" + withfeather + ", canfly=" + canfly + ", height=" + height + ", weight=" + weight
				+ ", animal=" + animal + ", bloodtype=" + bloodtype + "]";
	}
	
	
}
