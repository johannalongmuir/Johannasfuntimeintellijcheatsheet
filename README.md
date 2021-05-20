# IntelliJ Cheat Sheet

<kbd>Option</kbd> + <kbd>Enter</kbd> = quick fix

### RENAMING: <kbd>Shift</kbd> + <kbd>F6</kbd>

(or <kbd>Function</kbd> <kbd>Shift</kbd> + <kbd>F6</kbd> if can't see F keys on MAC). This will rename variable or method everywhere. 
Pay attention when using this as you may get a pop up box asking if you want to rename just this method or variable, or all of them.  

### EXTRACT VARIABLE: <kbd>Option</kbd> + <kbd>Command</kbd> + <kbd>V</kbd>
Will pull out selected as a variable within the method. Usually will be added on the line above the extraction. 

### INLINE VARIABLE / METHODS: <kbd>Option</kbd> + <kbd>Command</kbd> + <kbd>N</kbd>
Use with caution. Can bring variables or methods that have been extracted back in. Can be a useful tool if extracted a variable that should have been a constant for example. No longer need to declare the variable. 


### EXTRACT CONSTANT: <kbd>Option</kbd> + <kbd>Command</kbd> + <kbd>C</kbd>
Will pull out as a CONSTANT. Again will suggest if sees the same thing in multiple places and check if you want to just pull out the one constant or more.

### CREATE TEST CLASSES / METHODS: <kbd>Command</kbd> + <kbd>N</kbd>
Go to class name, use  <kbd>Command</kbd> + <kbd>N</kbd> and will create a test class for you with the same name and package structure.  
In Test classes use <kbd>Command</kbd> + <kbd>N</kbd> to create setup / breakdown tests and test methods.

### EXTRACT FIELD: <kbd>Option</kbd> + <kbd>Command</kbd> + <kbd>F</kbd>
Will pull variable to instance variable.

### EXTRACT METHOD: <kbd>Option</kbd> + <kbd>Command</kbd> + <kbd>M</kbd>
Extract method. Will help you by looking at other lines of code that look like they do the same thing and ask if you want to extract it on all. Also suggests things like what parameters to take in and will automatically assign the correct ones from where you have removed the method

### MOVE METHODS / VARIABLES / CONSTANTS: <kbd>Shift</kbd> + <kbd>Command</kbd> + <kbd>Arrows</kbd>
Moves methods/constants/variables up and down in code. Moving methods should move the whole method

### OPTIMISE IMPORTS: <kbd>Control</kbd> + <kbd>Option</kbd> + <kbd>0</kbd>
Removes unused imports