package techcognitives.child2.animal;

import techcognitives.child.animal.Bird;

public class Eagle extends Bird{

	public Eagle() {
		super();
	}


	public String showInfo() {
		return "Eagle [withfeather=" + withfeather + ", canfly=" + canfly + ", height=" + height + ", weight=" + weight
				+ ", animal=" + animal + ", bloodtype=" + bloodtype + "]";
	}
	
}
