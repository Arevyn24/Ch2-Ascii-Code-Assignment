
package ch2asciicode;
/*This program is designed to display the ascii value of a word by
 *assigning the ascii code of each letter to its own variable, validating the
 *word by outputting each variable, and then adding up the value of each
 *variable
 */

public class Ch2AsciiCode {

    public static void main(String[] args) {
        char uprH = 'H';
        char lwrU = 'u';
        char lwrF = 'f';
        char lwrL = 'l';
        char lwrE = 'e';
        char lwrP = 'p';
        int asciiSum;
        
        System.out.println("The word is 'Hufflepuff'");
        System.out.println(uprH + " " + lwrU + " " + lwrF + " " + lwrF + " " +
                lwrL + " " + lwrE + " " + lwrP + " " + lwrU + " " + lwrF +
                 " " + lwrF);
        
        asciiSum = uprH + lwrU + lwrF + lwrF + lwrL + lwrE + lwrP + 
                lwrU + lwrF + lwrF;
        
        System.out.println("The sum of the word is: " + asciiSum);
    }
    
}
