package techcognitives.child.animal;

import techcognitives.animal.main.Animal;

public class Reptile extends Animal {
	protected String skin;
	protected boolean backbone;
	protected String egg;
	
	public Reptile() {
		height = 5;
		weight =20;
		animal = "Reptile";
		bloodtype = "cold";
		this.skin = "softskin";
		this.backbone = true;
		this.egg = "soft-shell";
	}

	public String showInfo() {
		return "Reptile [skin=" + skin + ", backbone=" + backbone + ", egg=" + egg + ", height=" + height + ", weight="
				+ weight + ", animal=" + animal + ", bloodtype=" + bloodtype + "]";
	}
	
	
}
