package pl.com.bottega.generaldevelopmenttasks.animalsolid.model;

import pl.com.bottega.generaldevelopmenttasks.animalsolid.model.breed.Breedable;
import pl.com.bottega.generaldevelopmenttasks.animalsolid.model.breed.Oviparous;
import pl.com.bottega.generaldevelopmenttasks.animalsolid.model.breed.Viviparous;
import pl.com.bottega.generaldevelopmenttasks.animalsolid.model.voice.Barking;
import pl.com.bottega.generaldevelopmenttasks.animalsolid.model.voice.Mewling;
import pl.com.bottega.generaldevelopmenttasks.animalsolid.model.voice.Tweeting;
import pl.com.bottega.generaldevelopmenttasks.animalsolid.model.voice.Voiceable;

/**
 * Created by anna on 04.12.2016.
 */
public enum Species implements AnimalConfiguration{
    CAT("cat", new Mewling(), new Viviparous()),
    DOG("dog", new Barking(), new Viviparous()),
    SPARROW("sparrow", new Tweeting(), new Oviparous());

    private String name;
    private Voiceable voiceable;
    private Breedable breedable;

    Species(String name, Voiceable voiceable, Breedable breedable) {
        this.name = name;
        this.voiceable = voiceable;
        this.breedable = breedable;
    }

    public String getName() {
        return name;
    }

    public Voiceable getVoiceable() {
        return voiceable;
    }

    public Breedable getBreedable() {
        return breedable;
    }
}
