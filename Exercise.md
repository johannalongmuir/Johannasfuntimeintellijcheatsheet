# Practice shortcuts exercise

### 1: Using Quick Info
- Go to the [Cinema](src/main/java/Refactoring/Cinema.java) class method `showingBadSpellingStuff()` 
- Use <kbd>Option</kbd> + <kbd>Enter</kbd> on "Wonde Woman" and "Supehero" to correct the spelling.
- Use <kbd>Option</kbd> + <kbd>Enter</kbd> on the method name to safe delete the method. Pay attention to the pop up, and select check for strings. 


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
  - Undo and inline the fantasy variable. 

### 5: Extract Constant
- Go to the class you renamed in section 2, [MoviesByLocation](src/main/java/Refactoring/MoviesByLocation.java).
- Use  <kbd>Option</kbd> + <kbd>Command</kbd> + <kbd>C</kbd> to extract "Sci-Fi" to a local constant. Make sure to select replace all occurrences.
- Use  <kbd>Option</kbd> + <kbd>Command</kbd> + <kbd>C</kbd> to extract "Fantasy", this time also select to move to another location and move to `Entities.Genres`.
- Feel free inline the local constant for SCI_FI, and then extract to the Genres class.
- Use quick select from section 1, to add `Genres` as static import (<kbd>Option</kbd> + <kbd>Enter</kbd>)

### Troubleshooting
- If you have issues running the tests, update your preferences in intelliJ
  - Build
  - Excecution
  - Deployment 
  - Select Gradle run tests using intelliJ
