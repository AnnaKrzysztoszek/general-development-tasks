package pl.com.bottega.generaldevelopmenttasks.animalsolid.model.breed;

import pl.com.bottega.generaldevelopmenttasks.animalsolid.model.Animal;

/**
 * Created by anna on 04.12.2016.
 */
public class Oviparous implements Breedable {

    @Override
    public void breed(Animal animal) {
        System.out.println("oviparous");
    }
}
