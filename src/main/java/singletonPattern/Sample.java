package singletonPattern;

public class Sample {
	
	  // 1. The self-referencing static variable you asked about (set to null)
    public static Sample variable = null;

    // 2. A private constructor (prevents anyone else from using 'new DatabaseConnection()')
    private Sample() {
        System.out.println("Connection created!");
    }

    // 3. A static method that creates the object only if it doesn't exist yet
    public static Sample getInstance() {
        if (variable == null) {
            // Lazy initialization: It only creates the object the FIRST time this is called
            variable = new Sample(); 
        }
        return variable; // Returns the single shared object
    }
}



