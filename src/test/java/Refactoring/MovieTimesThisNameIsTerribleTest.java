package Refactoring;


import Entities.Movies;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieTimesThisNameIsTerribleTest {

    @Test
    void movieGenres() {
        MovieTimesThisNameIsTerrible variables = new MovieTimesThisNameIsTerrible();
        List<Movies> movies = variables.tooManyVariables();

        assertEquals(3, movies.size());
        assertEquals("Sci-Fi", movies.get(0).getMovieGenre());
        assertEquals("Fantasy", movies.get(1).getMovieGenre());
        assertEquals("Fantasy", movies.get(2).getMovieGenre());
    }
}