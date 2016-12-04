package pl.com.bottega.generaldevelopmenttasks.animalsolid.model.voice;

import pl.com.bottega.generaldevelopmenttasks.animalsolid.model.Animal;

/**
 * Created by anna on 04.12.2016.
 */
public class Mewling implements Voiceable{

    @Override
    public void voice(Animal animal) {
        System.out.println("mew mew");
    }
}
