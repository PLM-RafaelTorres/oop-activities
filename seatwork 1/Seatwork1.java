import java.util.Scanner;
import java.lang.Math;

public class Seatwork1{
    public static class Functions {
        public boolean prime(int intNumber){
            for(int intCounter = 2; intCounter <= Math.sqrt(intNumber); ++intCounter){
                if(intNumber % intCounter == 0)
                    return false;
            }
            return true;
        }
        public int reverseNumber(int intNumber, int intReversed){
            if (intNumber == 0)
                return intReversed;
            intReversed *= 10;
            intReversed += (intNumber % 10);
            return reverseNumber(intNumber/10, intReversed);
        }
        public static boolean palindrome(String strWord, int intCounter){
            if(intCounter == strWord.length() / 2)
                return true;
            if(strWord.charAt(intCounter) != strWord.charAt(strWord.length() - 1 - intCounter))
                return false;
            return palindrome(strWord, intCounter + 1);
        }
        public int floor(double dblNumber){
            return (int)dblNumber;
        }
        public int ceil(double dblNumber){
            int intFloor = floor(dblNumber);
            return (dblNumber - intFloor == 0) ? intFloor : intFloor + 1;
        }

        public static int sumOfSeries(int intNumber){
            return (intNumber % 2 == 0) ? -intNumber : intNumber; 
        }
        public static int vowels(String strWord){
            int intVowels = 0, intCounter = 0;
            char chrLetter = '\0';
            String strVowels = "aeiou";
            strWord = strWord.toLowerCase();
            for(intCounter = 0; intCounter < strWord.length(); ++intCounter){
                chrLetter = strWord.charAt(intCounter);
                if(strVowels.contains("" + chrLetter))
                    ++intVowels;
            }
            return intVowels;
        }
        public static int consonants(String strWord){
            int intConsonants = 0, intCounter = 0;
            char chrLetter = '\0';
            String strVowels = "aeiou";
            strWord = strWord.toLowerCase();
            for(intCounter = 0; intCounter < strWord.length(); ++intCounter){
                chrLetter = strWord.charAt(intCounter);
                if(Character.isAlphabetic(chrLetter) && !strVowels.contains("" + chrLetter))
                    ++intConsonants;
            }
            return intConsonants;
        }
    }

    public static void main(String[] args) {
        int intNumber = 0;
        double dblNumber = 0.00;
        String strWord = "";
        boolean blIsPrime = false, blIsPalindrome = false;
        Scanner s = new Scanner(System.in);
        Functions f = new Functions();

        System.out.print("Enter a number to determine if it's prime: ");
        intNumber = s.nextInt();
        blIsPrime = f.prime(intNumber);
        if(blIsPrime)
            System.out.println(intNumber + " is prime.");
        else
            System.out.println(intNumber + " is not prime");
       

        System.out.print("\nEnter a number to reverse its digits: ");
        intNumber = s.nextInt();
        System.out.println("The reversed number is : " + f.reverseNumber(intNumber, 0));
        System.out.println();

        s.nextLine();
        System.out.print("\nEnter a word to determine if it is a palindrome: ");
        strWord = s.nextLine();
        blIsPalindrome = Functions.palindrome(strWord, 0);
        if(blIsPalindrome)
            System.out.println(strWord + " is a palindrome.");
        else
            System.out.println(strWord + " is not a palindrome.");
       

        System.out.print("\nEnter a number to determine its floor and ceiling values: ");
        dblNumber = s.nextDouble();
        System.out.println("Its floor value is " + f.floor(dblNumber));
        System.out.println("Its ceiling value is " + f.ceil(dblNumber));
       
        System.out.print("\nEnter n to get its sum of series: ");
        intNumber = s.nextInt();
        System.out.println("The sum of the series is " + Functions.sumOfSeries(intNumber));


        s.nextLine();
        System.out.print("\nEnter the string: ");
        strWord = s.nextLine();
        System.out.println("There are " + Functions.vowels(strWord) + " vowels");
        System.out.println("There are " + Functions.consonants(strWord) + " consonants");
    }
}