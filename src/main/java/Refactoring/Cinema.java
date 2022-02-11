package Refactoring;

import Entities.Movie;
import java.util.List;
import java.util.ArrayList;

public class Cinema {

    // Don't use the method use showingBadSpellingStuff as its not helpful

    public Movie showingToday(){
        Movie movie = new Movie("Wonder Woman", "Superhero");
        return movie;
    }

    public Movie showingTomorrow(){
        Movie movie = new Movie("Wonder Woman", "Superhero");
        return movie;
    }

    public Movie showingNextWeek(){
        Movie movie = getMovieshowingNextWeek();
        return movie;
    }

    private Movie getMovieshowingNextWeek() {
        return new Movie("Wonder Woman", "Superhero");
    }

    public Movie showingBadSpellingStuff(){
        Movie movie = new Movie("Wonde Woman", "Supehero");
        return movie;
    }

}
