package techcognitives.animal;

import java.util.ArrayList;
import java.util.List;

import techcognitives.animal.main.Animal;
import techcognitives.child.animal.Bird;
import techcognitives.child.animal.Fish;
import techcognitives.child.animal.Reptile;
import techcognitives.child2.animal.Crocodile;
import techcognitives.child2.animal.Eagle;
import techcognitives.child2.animal.Eel;

public class Main {
	
	public static void main(String args[]) {
		List<Animal> animals = new ArrayList<>();
		Animal animal = new Animal();/*
										 * System.out.println(animal.showInfo());
										 */
		
		Animal reptile = new Reptile();/*
										 * System.out.println(reptile.showInfo());
										 */
		Animal croco = new Crocodile();/*
										 * System.out.println(croco.showInfo());
										 */
		
		Animal bird = new Bird();/*
									 * System.out.println(bird.showInfo());
									 */
		Animal eagle = new Eagle();/*
									 * System.out.println(eagle.showInfo());
									 */
		
		Animal fish = new Fish();/*
									 * System.out.println(fish.showInfo());
									 */
		Animal eel = new Eel();/*
								 * System.out.println(eel.showInfo());
								 */
		
		animals.add(animal);
		animals.add(reptile);
		animals.add(croco);
		animals.add(eel);
		animals.add(bird);
		animals.add(eagle);
		animals.add(fish);
		listAnimals(animals);
	}

	private static void listAnimals(List<Animal> animals) {
		for(Animal animal:animals) {
			System.out.println(animal.showInfo());
		}
	}
}
