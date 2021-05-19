package Refactoring;

import Entities.Movies;

import java.util.List;

public class MovieTimesThisNameIsTerrible {

    public List<Movies> tooManyVariables(){

        Movies alien = new Movies("Harry Potter", "Sci-Fi");
        Movies lordOfTheRings = new Movies("The Lord of the Rings", "Fantasy");
        Movies harryPotter = new Movies("Harry Potter", "Fantasy");

        return List.of(alien, lordOfTheRings, harryPotter);
    }

}
