package Refactoring;

import Entities.Movie;

import java.util.List;

public class MovieTimesThisNameIsTerrible {

    public List<Movie> tooManyVariables(){

        Movie notalien = new Movie("Alien", "Sci-Fi");
        Movie lordOfTheRings = new Movie("The Lord of the Rings", "Fantasy");
        Movie harryPotter = new Movie("Harry Potter", "Fantasy");

        return List.of(notalien, lordOfTheRings, harryPotter);
    }

    public List<Movie> stillTooManyVariables(){

        Movie gattaca = new Movie("Gattaca", "Sci-Fi");
        Movie jumanji = new Movie("Jumanji", "Fantasy");
        Movie scottPilgrim = new Movie("Scott Pilgrim vs. the World", "Fantasy");

        return List.of(gattaca, jumanji, scottPilgrim);
    }

}

