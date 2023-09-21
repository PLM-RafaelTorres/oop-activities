public class Activity2Test3{
    public static void main(String[] args) {
        // The code below has an error, identify the error and make a general conclusion
        boolean blFound = false;
        switch(blFound)
        {
            case true:  System.out.println("Hello");
                        break;
            case false: System.out.println("Goodbye");
                        break;
            default:    System.out.println("This is never executed");
        }

        // This code will not compile as switch statements cannot be performed on a value of type boolean. 
        // It only works on byte, short, char, int and a few special classes that wrap certain primitive types such as Character, String, Byte, Short, and Integer.
        // Even if the code were to somehow work, the default statement will never be executed as the switch statement will always evaluate to either true or false only.
        // Therefore, it would much more appropriate and intuitive to use if-else statements in evaluating boolean values.
    }
}