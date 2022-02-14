# Practice shortcuts exercise

The exercises are intended to be completed in order however if you wish to complete in any order, note that the naming might be slightly different. 

### 1: Using Quick Info
- Go to the [Cinema](src/main/java/Refactoring/Cinema.java) class method `showingBadSpellingStuff()` 
- Use <kbd>Option</kbd> + <kbd>Enter</kbd> on "Wonde Woman" and "Supehero" to correct the spelling.
- Use <kbd>Option</kbd> + <kbd>Enter</kbd> on the method name `showingBadSpellingStuff()` to safe delete the method. Pay attention to the pop up, and select check for strings. 


### 2: Renaming 
- Use <kbd>Shift</kbd> + <kbd>F6</kbd> or <kbd>Function</kbd> <kbd>Shift</kbd> + <kbd>F6</kbd> if can't see F keys on MAC.
- Go to the [MovieTimesThisNameIsTerrible](src/main/java/Refactoring/MovieTimesThisNameIsTerrible.java) class. The name for this class, and its matching test class isn't great. 
- Use <kbd>Shift</kbd> + <kbd>F6</kbd> on the class name to rename it to `MoviesByLocation` 
  - Select the option to update test class names. 
  - Select to update local variable name.
- Use <kbd>Shift</kbd> + <kbd>F6</kbd> to rename the variable `notalien` in the `tooManyVariables()` method, to alien. 
- Use <kbd>Shift</kbd> + <kbd>F6</kbd> to rename following method names. 
  - `tooManyVariables()` ->  `showingAtTheCinema()`
  - `stillTooManyVariables()` -> `showingAtMyMums()`

### 3: Extract Variables 
- Go to the class you renamed in section 2, [MoviesByLocation](src/main/java/Refactoring/MoviesByLocation.java).
- Use <kbd>Option</kbd> + <kbd>Command</kbd> + <kbd>V</kbd> to extract the following variables
  - "Sci-Fi" 
  - "Fantasy". Select replace all

### 4: Inline Variables
- Go to the class you renamed in section 2, [MoviesByLocation](src/main/java/Refactoring/MoviesByLocation.java).
- Use <kbd>Option</kbd> + <kbd>Command</kbd> + <kbd>N</kbd> to inline the following variables created in section 3
  - The variable name itself created section 3 for "Sci-Fi".
  - Go to where the variable fantasy is used for lordOfTheRings and inline the variable. Inline this occurance only and keep the variable.
  - Undo
  - Inline the fantasy variable for all occurances. 
- Inline methods, using the same command will be covered in section 8.

### 5: Extract Constant
- Go to the class you renamed in section 2, [MoviesByLocation](src/main/java/Refactoring/MoviesByLocation.java).
- Use  <kbd>Option</kbd> + <kbd>Command</kbd> + <kbd>C</kbd> to extract "Sci-Fi" to a local constant. Make sure to select replace all occurrences.
- Use  <kbd>Option</kbd> + <kbd>Command</kbd> + <kbd>C</kbd> to extract "Fantasy", this time also select to move to another location and move to `Entities.Genres`.
- Inline the local constant for SCI_FI with <kbd>Option</kbd> + <kbd>Command</kbd> + <kbd>N</kbd>
- Use <kbd>Option</kbd> + <kbd>Command</kbd> + <kbd>C</kbd>  to extract "SCI_FI" to the Genres class.
- Use quick select from section 1, to add `Genres` as static import (<kbd>Option</kbd> + <kbd>Enter</kbd>)

### 6: Test classes and methods
- You can use <kbd>Command</kbd> + <kbd>N</kbd> to easily create test classes and setup methods
- Go to the [Cinema](src/main/java/Refactoring/Cinema.java) class.
- Use <kbd>Command</kbd> + <kbd>N</kbd> on the class name, and select generate a test for the method `showingtoday()`
  - Write a quick test:
     ```
    Cinema cinema = new Cinema();
    Movie movie = cinema.showingToday();
    assertEquals("Superhero", movie.getMovieGenre());
    ```
  - You can try writing cinema.showingToday().var to generate the Movie variable
- Use <kbd>Command</kbd> + <kbd>N</kbd> to create a new test for showing tomorrow
- Use  <kbd>Command</kbd> + <kbd>N</kbd> to generate a setUp method

### 7: Extract Field
- Go to the [CinemaTest](src/test/java/Refactoring/CinemaTest.java) class.
- Hover over the declaration of Cinema in the showingToday test. 
  - Use <kbd>Option</kbd> + <kbd>Command</kbd> + <kbd>F</kbd> to extract the field. 
  - Select initilize in field declaration.
- Remove the setup method if it is still there from the previous excercise
- Extract field with set-up method
  - Hover over the new Cinema field declaration and inline <kbd>Option</kbd> + <kbd>Command</kbd> + <kbd>N</kbd> removing the field.
  - Hover over new Cinema() and use <kbd>Option</kbd> + <kbd>Command</kbd> + <kbd>F</kbd> to extract the field again
  - Select Initilize in setUp
  - Select replace all occurances

  
### 8: Inline method
- This is the same process as inlining variables covered in section 4.
- Go to the [Cinema](src/main/java/Refactoring/Cinema.java) class.
- Use <kbd>Option</kbd> + <kbd>Command</kbd> + <kbd>N</kbd> to inline method `getMovieshowingNextWeek()`

### 9: Extract method
- Go to `showingToday()` in the [Cinema](src/main/java/Refactoring/Cinema.java) class.
- Select where movie variable is created and use <kbd>Option</kbd> + <kbd>Command</kbd> + <kbd>M</kbd> to extract method
- Replace all

### 10: Move methods and variables
- Move your method created in section 9 (getMovie()) method to the bottom of the class using <kbd>Shift</kbd> + <kbd>Command</kbd> + <kbd>Arrows</kbd>

### 11: Extras
- Quick documentation: <kbd>Control</kbd> + <kbd>J</kbd>
  - Test on `new Movie(...)` to show what parameters are needed
- Optimise your imports: <kbd>Control</kbd> + <kbd>Option</kbd> + <kbd>O</kbd>
  - Cinema.class has some unused imports that can be removed
- Show all usages: <kbd>Option</kbd> + <kbd>F7</kbd>
- Select next instance of a word: <kbd>Control</kbd> + <kbd>G</kbd>
  - Select first word "movie" in Cinema class
- Format your stuff: <kbd>Command</kbd> + <kbd>Option</kbd> + <kbd>L</kbd>
  - Cinema class has a few methods that will add spaces before the {
- Move to where your mouse last was: <kbd>Command</kbd> + <kbd>`[`</kbd> or <kbd>`]`</kbd>


### Troubleshooting
- If you have issues running the tests, update your preferences in intelliJ
  - Build
  - Excecution
  - Deployment 
  - Select Gradle run tests using intelliJ
