import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Activity3 {
    public static void main(String[] args) {
        int intTerm = 0, intSum = 0, intLines = 0, intNumber = 0, intReversed = 0;
        String strSentence = "", strWord = "";
        final String strVowels = "aeiou";
        boolean blIsPrime = true, blIsPalindrome = true;
        Map<Character, Integer> map = new HashMap<>();
        Scanner s = new Scanner(System.in);
        // 1. Display the sum of the given series given n as the number of terms: 
        // 1 + 3 + 5 + 7 + . . . + 2n -1
        // Ex. Enter n: 3
        //     The sum of the series is 9
        System.out.print("Enter n: ");
        intTerm = s.nextInt();
        for(int i = 1; i <= intTerm; ++i)
            intSum += 2*i - 1;
        
        System.out.println("The sum of the series is " + intSum);

        // 2. Display the given figure below given n as the number of lines:
        // Ex. Enter n : 5
        //   
        //     *
        //     **
        //     ***
        //     ****
        ///    *****

        System.out.print("\nEnter n: ");
        intLines = s.nextInt();

        for(int i = 1; i <= intLines; ++i)
        {
            for(int j = 0; j < i; ++j)
                System.out.print("*");
            System.out.println();
        }

        // 3. Tell whether a given number is a prime number.
        // Ex. Enter n : 13
        //     13 is a prime number


        System.out.print("\nEnter n: ");
        intNumber = s.nextInt();

        for(int i = 2; i <= Math.sqrt(intNumber) && blIsPrime; ++i)
            if(intNumber % i == 0)
                blIsPrime = false;

        if(!blIsPrime || intNumber <= 1)
            System.out.println(intNumber + " is not a prime number.");
        else 
            System.out.println(intNumber + " is a prime number.");

        
        // 4. Display the occurence of each vowel given a sentence.
        // Ex. Enter the sentence: hello love goodbye
        //     There is no a.
        //     There are 3 e's
        //     There is no i.
        //     There are 4 o's.
        //     There is no u.

        s.nextLine();

        System.out.print("\nEnter the sentence: ");
        strSentence = s.nextLine();
        
        for(int i = 0; i < strVowels.length(); ++i)
            map.put(strVowels.charAt(i), 0);
    
        for(int i = 0; i < strSentence.length(); ++i)
        {
            char c = strSentence.toLowerCase().charAt(i);
            if(strVowels.contains(c + ""))
                map.replace(c, map.get(c) + 1);
        }

        map.forEach((key, value) -> 
        {
            if(value == 0)
                System.out.println("There is no " + key + ".");
            else if(value == 1)
                System.out.println("There is 1 " + key + ".");
            else
                System.out.println("There are " + value + " " + key + "'s.");
        });

        // 5. Display the reversed digit of a given number
        // Ex. Enter n : 325634
        //     The reversed digit is 436523

        System.out.print("\nEnter n: ");
        intNumber = s.nextInt();
        while(intNumber > 0)
        {
            intReversed  = 10 * intReversed + intNumber % 10;
            intNumber /= 10; 
        }
        System.out.println("The reversed digit is " + intReversed);

        // 6. Tell whether a given word is a palindrome
        // Ex. Enter a word: civic
        //     civic is a palindrome.
        // 
        //     Enter a word: civil
        //     civil is not a palindrome.

        s.nextLine();
        System.out.print("\nEnter a word: ");
        strWord = s.nextLine();

        int i = 0, j = strWord.length() - 1;
        while(i < j && blIsPalindrome)
            if(strWord.charAt(i++) != strWord.charAt(j--))
                blIsPalindrome = false;

        if(blIsPalindrome)
            System.out.println(strWord + " is a palindrome.");
        else
            System.out.println(strWord + " is not a palindrome.");

    }    
}