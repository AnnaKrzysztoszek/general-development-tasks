package pl.com.bottega.generaldevelopmenttasks.animalsolid.model;

/**
 * Created by anna on 04.12.2016.
 */
public class AnimalFactory {

    public static Animal create(Species species) {
        return new Animal(species.getName(), species.getVoiceable(), species.getBreedable());
    }
}
