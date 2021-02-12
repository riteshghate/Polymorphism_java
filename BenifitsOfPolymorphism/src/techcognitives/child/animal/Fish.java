package techcognitives.child.animal;

import techcognitives.animal.main.Animal;

public class Fish extends Animal{
	protected boolean liveinwater;
	protected boolean gills;
	
	public Fish() {
		height = 8;
		weight = 80;
		animal = "aquatic animal";
		bloodtype = "warmblood";
		this.liveinwater = true;
		this.gills = true;
	}

	public String showInfo() {
		return "Fish [liveinwater=" + liveinwater + ", gills=" + gills + ", height=" + height + ", weight=" + weight
				+ ", animal=" + animal + ", bloodtype=" + bloodtype + "]";
	}

	
	
}
