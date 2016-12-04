package pl.com.bottega.generaldevelopmenttasks.animalsolid.model;

import pl.com.bottega.generaldevelopmenttasks.animalsolid.model.breed.Breedable;
import pl.com.bottega.generaldevelopmenttasks.animalsolid.model.voice.Voiceable;

/**
 * Created by anna on 04.12.2016.
 */
public interface AnimalConfiguration {
    String getName();
    Voiceable getVoiceable();
    Breedable getBreedable();
}
