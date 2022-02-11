package Refactoring;

import Entities.Movie;
import java.util.List;
import java.util.ArrayList;

public class Cinema {

    public Movie showingToday(){
        Movie movie = new Movie("Wonder Woman", "Superhero");
        return movie;
    }

    public Movie showingTomorrow(){
        Movie movie = new Movie("Wonder Woman", "Superhero");
        return movie;
    }

    public Movie showingNextWeek(){
        Movie movie = new Movie("Wonder Woman", "Superhero");
        return movie;
    }

    public Movie showingBadSpellingStuff(){
        Movie movie = new Movie("Wonde Woman", "Supehero");
        return movie;
    }

}
