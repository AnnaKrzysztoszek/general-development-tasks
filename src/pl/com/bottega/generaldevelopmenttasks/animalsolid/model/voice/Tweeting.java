package pl.com.bottega.generaldevelopmenttasks.animalsolid.model.voice;

import pl.com.bottega.generaldevelopmenttasks.animalsolid.model.Animal;

/**
 * Created by anna on 04.12.2016.
 */
public class Tweeting implements Voiceable {

    @Override
    public void voice(Animal animal) {
        System.out.println("tweet tweet");
    }
}
