package Refactoring;

import Entities.Movies;

import java.util.List;

public class Variables {

    public List<Movies> tooManyVariables(){

        Movies lordOfTheRings = new Movies("The Lord of the Rings", "Fantasy");
        Movies harryPotter = new Movies("Harry Potter", "Fantasy");
        Movies alien = new Movies("Harry Potter", "Sci-fi");


        List<Movies> movieList = List.of(lordOfTheRings, harryPotter, alien);

        return movieList;
    }

}
