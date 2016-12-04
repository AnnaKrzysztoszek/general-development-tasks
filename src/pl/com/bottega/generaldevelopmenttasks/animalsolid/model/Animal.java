package pl.com.bottega.generaldevelopmenttasks.animalsolid.model;

import pl.com.bottega.generaldevelopmenttasks.animalsolid.model.breed.Breedable;
import pl.com.bottega.generaldevelopmenttasks.animalsolid.model.voice.Voiceable;

/**
 * Created by anna on 04.12.2016.
 */
public class Animal {

    private String name;
    private Voiceable voiceable;
    private Breedable breedable;

    public Animal(String name, Voiceable voiceable, Breedable breedable) {
        this.name = name;
        this.voiceable = voiceable;
        this.breedable = breedable;
    }

    public void giveVoice() {
        voiceable.voice(this);
    }

    public void giveBreed() {
        breedable.breed(this);
    }
}
