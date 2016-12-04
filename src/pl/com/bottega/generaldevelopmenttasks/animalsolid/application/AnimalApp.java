package pl.com.bottega.generaldevelopmenttasks.animalsolid.application;

import pl.com.bottega.generaldevelopmenttasks.animalsolid.model.Animal;
import pl.com.bottega.generaldevelopmenttasks.animalsolid.model.AnimalFactory;
import pl.com.bottega.generaldevelopmenttasks.animalsolid.model.Species;

/**
 * Created by anna on 04.12.2016.
 */
public class AnimalApp {

    public static void main(String[] args) {
        Animal cat = AnimalFactory.create(Species.CAT);
        cat.giveVoice();
        cat.giveBreed();

        Animal dog = AnimalFactory.create(Species.DOG);
        dog.giveVoice();
        dog.giveBreed();

        Animal sparrow = AnimalFactory.create(Species.SPARROW);
        sparrow.giveVoice();
        sparrow.giveBreed();
    }
}
