package pl.com.bottega.generaldevelopmenttasks.animalsolid.model;

/**
 * Created by anna on 04.12.2016.
 */
public class AnimalFactory {

    public static Animal create(AnimalConfiguration animalConfiguration) {
        return new Animal(animalConfiguration.getName(), animalConfiguration.getVoiceable(), animalConfiguration.getBreedable());
    }
}
