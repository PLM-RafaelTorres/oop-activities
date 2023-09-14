/*
 * Bayna, Clarence L.
 * Deldoc, Rojo Lirio S.
 * Torres, Rafael Sebastian dC.
 * CSC 0212-2
 */
import java.util.Scanner;
import java.lang.Math;

public class Activity1 {
    public static void main(String[] args) {
        int intPeso = 0, intCentimeter = 0, intFahrenheit = 0, intRadius = 0, intDiameter = 0, intRectLength = 0, intRectWidth = 0, intFirst = 0, intSecond = 0, intThird = 0, intMax = 0, intMin = 0, intPrelim = 0, intMidterm = 0, intFinals = 0, intRectArea = 0, intRectPerimeter = 0;
        double dblDollar = 0.00, dblInches = 0.00, dblCelsius = 0.00, dblKelvin = 0.00, dblCircleArea = 0.00, dblCircumference = 0.00, dblFinalGrade = 0.00;
        char chrChoice = ' ';
        Scanner s = new Scanner(System.in);

        // 1. Convert an input in peso and outputs its equivalent in US dollars
        System.out.print("Enter amount in peso: ");
        intPeso = s.nextInt();
        dblDollar = intPeso / 56.68;
        System.out.printf("The equivalent of %d pesos in US dollars is %.2f", intPeso, dblDollar);

        // 2. Convert an input in centimeters and outputs its equivalent to inches
        System.out.print("\n\nEnter length in centimeters: ");
        intCentimeter = s.nextInt();
        dblInches = intCentimeter / 2.54;
        System.out.printf("The equivalent of %d cm in inches is %.2f", intCentimeter, dblInches);

        // 3. Display the equivalent of Fahrenheit to Celsius and Kelvin.
        System.out.print("\n\nEnter fahrenheit: ");
        intFahrenheit = s.nextInt();
        dblCelsius = (intFahrenheit - 32) * 5 / 9.0;
        dblKelvin = dblCelsius + 273.15;
        System.out.printf("In Celsius: %.2f\nIn Kelvin: %.2f", dblCelsius, dblKelvin);

        // 4. Display the area, diameter and circumference of a circle given radius as an input.
        System.out.print("\n\nEnter radius: ");
        intRadius = s.nextInt();
        dblCircleArea = Math.PI * Math.pow(intRadius, 2);
        intDiameter = intRadius * 2;
        dblCircumference = 2 * Math.PI * intRadius;
        System.out.printf("The area of the circle is %.2f\nThe diameter of the circle is %d\nThe circumference of the circle is %.2f", dblCircleArea, intDiameter, dblCircumference);

        // 5. Display the area and perimeter of a rectangle given length and width as input.
        System.out.print("\n\nEnter length: ");
        intRectLength = s.nextInt();
        System.out.print("Enter width: ");
        intRectWidth = s.nextInt();
        intRectArea = intRectWidth * intRectLength;
        intRectPerimeter = 2 * (intRectWidth + intRectLength);
        System.out.print("The area of the rectangle is " + intRectArea + "\nThe perimeter of the rectangle is " + intRectPerimeter);
        
        // 6. Display the highest and lowest number among 3 integers.
        System.out.print("\n\nEnter first number: ");
        intFirst = s.nextInt();
        System.out.print("Enter second number: ");
        intSecond = s.nextInt();
        System.out.print("Enter third number: ");
        intThird = s.nextInt();
        intMax = intFirst;
        intMin = intFirst;

        if (intSecond < intMin) 
            intMin = intSecond;

        if (intSecond > intMax)
            intMax = intSecond;
        
        if (intThird < intMin) 
            intMin = intThird;
        
        if (intThird > intMax) 
            intMax = intThird;
        
        System.out.println("The highest number is " + intMax);
        System.out.println("The lowest number is " + intMin);
        /* 7. Given prelim, midterm and final grades and the formula below, display its course grade and remark.
            Final Grade = (prelim+midterm+finals)/3.0 
         
            Final Grade    Course Grade	   Remark
            96-100	       A+		        Excellent
            91-95          A                Oustanding
            86-90          B+               Very Good
            81-85          B                Satisfactory
            75-80          C                Good
            74 and below   F                Poor
        */
        System.out.print("\nEnter prelim grade: ");
        intPrelim = s.nextInt();
        System.out.print("Enter midterm grade: ");
        intMidterm = s.nextInt();
        System.out.print("Enter finals grade: ");
        intFinals = s.nextInt();
        dblFinalGrade = Math.round((intPrelim + intMidterm + intFinals) / 3.0);
        
        if (dblFinalGrade>= 96 && dblFinalGrade <= 100)
            System.out.println("A+ Excellent");
        else if (dblFinalGrade >= 91 && dblFinalGrade <= 95)
            System.out.println("A Oustanding");
        else if (dblFinalGrade >= 86 && dblFinalGrade <= 90)
            System.out.println("B+ Very Good");
        else if (dblFinalGrade >= 81 && dblFinalGrade <= 85)
            System.out.println("B Satisfactory");
        else if (dblFinalGrade >= 75 && dblFinalGrade <= 80)
            System.out.println("C Good");
        else if (dblFinalGrade >= 0 && dblFinalGrade <= 74)
            System.out.println("F Poor");
        else
            System.out.println("Invalid grade");
        
        /*8. Given the menu below, display the area or perimeter of a given rectangle given length and width as inputs.
            Menu
            [A]rea
            [P]erimeter
            Enter choice: A
            Enter length: 10
            Enter width: 10
            The area of the rectangle is 100 units.
         */

         // Note: All inputs are integers while outputs should be real numbers
        System.out.print("\nMenu\n[A]rea\n[P]erimeter\nEnter choice: ");
        chrChoice = s.next().toUpperCase().charAt(0);
        System.out.print("Enter length: ");
        intRectLength = s.nextInt();
        System.out.print("Enter width: ");
        intRectWidth = s.nextInt();
        switch(chrChoice)
        {
            case 'A': intRectArea = intRectLength * intRectWidth;
                      System.out.printf("The area of the rectangle is " + intRectArea + " units.");
                      break;
            case 'P': intRectPerimeter = 2 * (intRectLength + intRectWidth);
                      System.out.printf("The perimeter of the rectangle is " + intRectPerimeter + " units.");
                      break;
            default:  System.out.println("Invalid choice");
        }
    }    
}
