# IntelliJ Cheat Sheet

Use the [Exercise](Exercise.md) to practice these shortcuts.

### CONTEXT ACTIONS/QUICK FIX INFO: <kbd>Option</kbd> + <kbd>Enter</kbd>

Will give you suggested fixes where available

### RENAMING: <kbd>Shift</kbd> + <kbd>F6</kbd>

(or <kbd>Function</kbd> <kbd>Shift</kbd> + <kbd>F6</kbd> if can't see F keys on MAC). This will rename variable or
method everywhere. Pay attention when using this as you may get a pop up box asking if you want to rename just this
method or variable, or all of them.

### EXTRACT VARIABLE: <kbd>Option</kbd> + <kbd>Command</kbd> + <kbd>V</kbd>

Will pull out selected as a variable locally within the method. 
Usually will be added on the line above the extraction.

### EXTRACT CONSTANT: <kbd>Option</kbd> + <kbd>Command</kbd> + <kbd>C</kbd>

Will pull out as a CONSTANT. Again will suggest if sees the same thing in multiple places and check if you want to just
pull out the one constant or more. Will allow you to also declare this constant in the current class, or select the
class you would like to declare the constant.

### EXTRACT FIELD: <kbd>Option</kbd> + <kbd>Command</kbd> + <kbd>F</kbd>

Will pull variable to instance variable. Select where you want the variable to be declared. In test classes it will allow
you to declare the variable in setUp which will add to the existing setup method or create a new setUp method with the declaration.

### EXTRACT METHOD: <kbd>Option</kbd> + <kbd>Command</kbd> + <kbd>M</kbd>

Will pull out your selected code to a separate method. This will help you by looking at other lines of code that look
like they do the same thing and ask if you want to replace these lines of code with the new method call. Also suggests 
things like what parameters to take in and will automatically assign the correct ones from where you have extracted the method.

### INLINE VARIABLE / METHODS: <kbd>Option</kbd> + <kbd>Command</kbd> + <kbd>N</kbd>

Can bring variables or methods that have been extracted back in. Can be a useful tool if extracted a
variable that should have been a constant for example where you no longer need to declare the variable.

### GENERATE TO CREATE CONSTRUCTORS AND OVERRIDE METHODS <kbd>Command</kbd> + <kbd>N</kbd>

Use to easily generate override methods including toString() and constructors within a class.

### GENERATE TO CREATE TEST CLASSES / METHODS: <kbd>Command</kbd> + <kbd>N</kbd>
Go to class name, and use  <kbd>Command</kbd> + <kbd>N</kbd> and will create a test class for you with the same name and
package structure.  
In Test classes use <kbd>Command</kbd> + <kbd>N</kbd> to create setup / breakdown tests and test methods.



### MOVE METHODS / VARIABLES / CONSTANTS: <kbd>Shift</kbd> + <kbd>Command</kbd> + <kbd>Arrows</kbd>

Moves methods/constants/variables up and down in code. Moving methods should move the whole method

### OPTIMISE IMPORTS: <kbd>Control</kbd> + <kbd>Option</kbd> + <kbd>0</kbd>

Removes unused imports

### FORMATTING: <kbd>Command</kbd> + <kbd>Option</kbd> + <kbd>L</kbd>

Will update your formatting. Leaves line breaks you've added but will remove unneeded spaces and tabs from codebase.
Highlight the section you want to format or format whole class.


### NAVIGATE LAST POSITION OF MOUSE: <kbd>Command</kbd> + <kbd>`[`</kbd> or <kbd>`]`</kbd>

Will take you to the last place your mouse clicked.  <kbd>`[`</kbd> takes you backwards, <kbd>`]`</kbd> takes you
forwards.

### USAGES: <kbd>Option</kbd> + <kbd>F7</kbd>

Brings up all the places your selection is used in the codebase.

### QUICK DOCUMENTATION: <kbd>Control</kbd> + <kbd>J</kbd>

Shows what parameters are needed for a method including their data types. Also brings up basic documentation on data
types without having to go to the full documentation.

### ADD SELECTION FOR NEXT OCCURANCE: <kbd>Control</kbd> + <kbd>G</kbd>

Go to a word, each time you select <kbd>Control</kbd> + <kbd>G</kbd> it will highlight the next time that word is used.


### GENERATE SUGGESTED TYPE/NAME FROM METHOD RETURN WITH .var
You can use .var to help generate variable creation off a method call. Use as follows, 
`<class>.<methodName()>.var` . Can use setting that shows next to new variable when its created, to set default to use `var` or `final`. 

### NAVIGATE - DOUBLE TAP <kbd>shift</kbd>
Can use this to search project, libraries, actions etc. This is helpful if you don't remember the commands themselves.

### FIND ACTION - <kbd>Command</kbd> + <kbd>Shift</kbd> + <kbd>A</kbd>
Use this to take you to the Action tab of Navigation, then search for the action you want e.g. ‘generate’.

### PRESENTATION ASSISTANT PLUGIN:
Helpful plugin that allows others to see what shortcuts you are using when pairing/mobbing
