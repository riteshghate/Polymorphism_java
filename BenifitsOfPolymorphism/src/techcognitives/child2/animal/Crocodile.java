package techcognitives.child2.animal;

import techcognitives.child.animal.Reptile;

public class Crocodile extends Reptile{

	public Crocodile() {
		super();
		egg = "harshell";
	}


	public String showInfo() {
		return "Crocodile [skin=" + skin + ", backbone=" + backbone + ", egg=" + egg + ", height=" + height
				+ ", weight=" + weight + ", animal=" + animal + ", bloodtype=" + bloodtype + "]";
	}

	
	
}
