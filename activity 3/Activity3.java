// Bayna, Clarence L.
// Deldoc, Rojo Lirio S.
// Torres, Rafael Sebastian dC.

import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args) {
        int intCounter1 = 0, intCounter2 = 0, intNum = 0;
        long longSum = 0;
        byte byteACount = 0, byteECount = 0, byteICount = 0, byteOCount = 0, byteUCount = 0;
        String strSentence = "", strWord = "";
        boolean blIsPalindrome = true, blIsPrime = true;
        Scanner s = new Scanner(System.in);

        // 1. Display the sum of the given series given n as the number of terms: 
        // 1 + 3 + 5 + 7 + . . . + 2n -1
        // Ex. Enter n: 3
        //     The sum of the series is 9

        System.out.print("Enter n: ");
        intNum = s.nextInt();
       
        for(intCounter1 = 1; intCounter1 <= intNum; ++intCounter1)
            longSum += 2L * intCounter1 - 1;

        System.out.println("The sum of the series is " + longSum);
      
        // 2. Display the given figure below given n as the number of lines:
        // Ex. Enter n: 5
        //   
        //     *
        //     **
        //     ***
        //     ****
        //     *****
        
        System.out.print("\nEnter n: ");
        intNum = s.nextInt();
        for (intCounter1 = 1; intCounter1 <= intNum; ++intCounter1)
        {
            for (intCounter2 = 1; intCounter2 <= intCounter1; ++intCounter2)
                System.out.print("*");
            System.out.println();
        }
        
        // 3. Tell whether a given number is a prime number.
        // Ex. Enter n: 13
        //     13 is a prime number

        System.out.print("\nEnter n: ");
        intNum = s.nextInt();
        for (intCounter1 = 2; intCounter1 * intCounter1 <= intNum && blIsPrime; ++intCounter1)
        {
            if(intNum % intCounter1 == 0)
                blIsPrime = false;
        }

        if(!blIsPrime || intNum <= 1)    
            System.out.println(intNum + " is not a prime number.");
        else
            System.out.println(intNum + " is a prime number.");

        // 4. Display the occurence of each vowel given a sentence.
        // Ex. Enter the sentence: hello love goodbye
        //     There is no a.
        //     There are 3 e's
        //     There is no i.
        //     There are 4 o's.
        //     There is no u.

        s.nextLine(); // clears Scanner buffer
        System.out.print("\nEnter the sentence: ");
        strSentence = s.nextLine().toLowerCase();
        for(intCounter1 = 0; intCounter1 < strSentence.length(); ++intCounter1)
        {
            switch(strSentence.charAt(intCounter1)) // switch ba o if else? may pake ba si sir don
            {
                case 'a': ++byteACount;
                          break;
                case 'e': ++byteECount;
                          break;
                case 'i': ++byteICount;
                          break;
                case 'o': ++byteOCount;
                          break;
                case 'u': ++byteUCount;
                          break;
            }
        }

        printCount(byteACount, 'a');
        printCount(byteECount, 'e');
        printCount(byteICount, 'i');
        printCount(byteOCount, 'o');
        printCount(byteUCount, 'u');

       
        // 5. Display the reversed digit of a given number
        // Ex. Enter n: 325634
        //     The reversed digit is 436523

        System.out.print("\nEnter n: ");
        intNum = s.nextInt();
        System.out.print("The reversed digit is: ");

        while(intNum != 0)
        {
            System.out.print(intNum % 10);
            intNum /= 10;
        }

        // 6. Tell whether a given word is a palindrome
        // Ex. Enter a word: civic
        //     civic is a palindrome.
        // 
        //     Enter a word: civil
        //     civil is not a palindrome.

        s.nextLine(); // clears Scanner buffer
        System.out.print("\n\nEnter a word: ");
        strWord = s.nextLine().toLowerCase();

        intCounter1 = 0;
        intCounter2 = strWord.length() - 1;
        while(intCounter1 < intCounter2 && blIsPalindrome)
        {
            if(strWord.charAt(intCounter1) != strWord.charAt(intCounter2))
                blIsPalindrome = false;

            ++intCounter1;
            --intCounter2;
        }
        
        if(blIsPalindrome)
            System.out.println(strWord + " is a palindrome.");
        else
            System.out.println(strWord + " is not a palindrome.");
    }    

    private static void printCount(byte byteCount, char charVowel)
    {
        switch(byteCount)
        {
            case 0:  System.out.println("There is no " + charVowel + ".");
                     break;
            case 1:  System.out.println("There is 1 " + charVowel + ".");
                     break;
            default: System.out.println("There are " + byteCount + " " + charVowel + "'s.");
        }
    }
    
}