import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

public class Activity3 {
    public static void main(String[] args) {
        int intCounter1 = 0, intCounter2 = 0, intTerm = 0, intSum = 0, intLines = 0, intNumber = 0, intReversed = 0;
        String strSentence = "", strWord = "";
        final String strVowels = "aeiou";
        boolean blIsPrime = true, blIsPalindrome = true;
        Map<Character, Integer> mapVowelCount = new LinkedHashMap<>();
        Scanner s = new Scanner(System.in);

        // 1. Display the sum of the given series given n as the number of terms: 
        // 1 + 3 + 5 + 7 + . . . + 2n -1
        // Ex. Enter n: 3
        //     The sum of the series is 9

        System.out.print("Enter n: ");
        intTerm = s.nextInt();
        for(intCounter1 = 1; intCounter1 <= intTerm; ++intCounter1)
            intSum += 2*intCounter1 - 1;
        
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

        for(intCounter1 = 1; intCounter1 <= intLines; ++intCounter1)
        {
            for(intCounter2 = 0; intCounter2 < intCounter2; ++intCounter2)
                System.out.print("*");
            System.out.println();
        }

        // 3. Tell whether a given number is a prime number.
        // Ex. Enter n : 13
        //     13 is a prime number

        System.out.print("\nEnter n: ");
        intNumber = s.nextInt();

        for(intCounter1 = 2; intCounter1 <= Math.sqrt(intNumber) && blIsPrime; ++intCounter1)
            if(intNumber % intCounter1 == 0)
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

        s.nextLine(); // clears Scanner buffer

        System.out.print("\nEnter the sentence: ");
        strSentence = s.nextLine();

        /*
           intCountA = 0, intCountE = 0, intCountI = 0, intCountO = 0, intCountU = 0;
           for(intCounter1 = 0; intCounter1 < strSentence.length(); ++intCounter1)
           {
                char c = strSentence.toLowerCase().charAt(intCounter1);
                if(c == 'a')
                    intCountA++;
                else if(c == 'e')
                    intCountE++;
                else if(c == 'i')
                    intCountI++;
                else if(c == 'o')
                    intCountO++;
                else if(c == 'u')
                    intCountU++;
            }

            if(intCountA == 0)
                System.out.println("There is no a.");
            else if(intCountA == 1)
                System.out.println("There is 1 a.");
            else
                System.out.println("There are " + intCountA + " a's.");
            
            if(intCountE == 0)
                System.out.println("There is no e.");
            else if(intCountE == 1)
                System.out.println("There is 1 e.");
            else
                System.out.println("There are " + intCountE + " e's.");
            
            if(intCountI == 0)
                System.out.println("There is no i.");
            else if(intCountI == 1)
                System.out.println("There is 1 i.");
            else
                System.out.println("There are " + intCountI + " i's.");

            if(intCountO == 0)
                System.out.println("There is no o.");
            else if(intCountO == 1)
                System.out.println("There is 1 o.");
            else
                System.out.println("There are " + intCountO + " o's.");
            
            if(intCountU == 0)
                System.out.println("There is no u.");
            else if(intCountU == 1)
                System.out.println("There is 1 u.");
            else
                System.out.println("There are " + intCountU + " u's.");
         */
        
        for(intCounter1 = 0; intCounter1 < strVowels.length(); ++intCounter1)
            mapVowelCount.put(strVowels.charAt(intCounter1), 0);
    
        for(intCounter1 = 0; intCounter1 < strSentence.length(); ++intCounter1)
        {
            char c = strSentence.toLowerCase().charAt(intCounter1);
            if(strVowels.contains(c + ""))
                mapVowelCount.replace(c, mapVowelCount.get(c) + 1);
        }

        mapVowelCount.forEach((charKey, intValue) -> 
        {
            if(intValue == 0)
                System.out.println("There is no " + charKey + ".");
            else if(intValue == 1)
                System.out.println("There is 1 " + charKey + ".");
            else
                System.out.println("There are " + intValue + " " + charKey + "'s.");
        });

        // 5. Display the reversed digit of a given number
        // Ex. Enter n : 325634
        //     The reversed digit is 436523

        System.out.print("\nEnter n: ");
        intNumber = s.nextInt();
        while(intNumber > 0)
        {
            intReversed *= 10;
            intReversed += intNumber % 10;
            intNumber /= 10; 
        }
        System.out.println("The reversed digit is " + intReversed);

        // 6. Tell whether a given word is a palindrome
        // Ex. Enter a word: civic
        //     civic is a palindrome.
        // 
        //     Enter a word: civil
        //     civil is not a palindrome.

        s.nextLine(); // clears Scanner buffer

        System.out.print("\nEnter a word: ");
        strWord = s.nextLine();
    
        intCounter1 = 0;
        intCounter2 = strWord.length() - 1;
        while(intCounter1 < intCounter2 && blIsPalindrome)
            if(strWord.charAt(intCounter1++) != strWord.charAt(intCounter2--))
                blIsPalindrome = false;

        if(blIsPalindrome)
            System.out.println(strWord + " is a palindrome.");
        else
            System.out.println(strWord + " is not a palindrome.");

    }    
}