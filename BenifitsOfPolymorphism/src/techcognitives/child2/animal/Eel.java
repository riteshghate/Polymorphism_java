package techcognitives.child2.animal;

import techcognitives.child.animal.Fish;

public class Eel extends Fish {

	private String special;

	public Eel() {
		super();
		this.special = "Electric Shock";
	}

	public String showInfo() {
		return "Eel [special=" + special + ", liveinwater=" + liveinwater + ", gills=" + gills + ", height=" + height
				+ ", weight=" + weight + ", animal=" + animal + ", bloodtype=" + bloodtype + "]";
	}

}
