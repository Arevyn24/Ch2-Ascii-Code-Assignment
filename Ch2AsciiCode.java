
package ch2asciicode;
/*This program is designed to display the ascii value of a word by
 *assigning the ascii code of each letter to its own variable, validating the
 *word by outputting each variable, and then adding up the value of each
 *variable
 */

public class Ch2AsciiCode {

    public static void main(String[] args) {
        char uprH = 72;
        char lwrU = 117;
        char lwrF = 102;
        char lwrL = 108;
        char lwrE = 101;
        char lwrP = 112;
        double asciiSum;
        
        System.out.println("The word is 'Hufflepuff'");
        System.out.print(uprH + " ");
        System.out.print(lwrU + " ");
        System.out.print(lwrF+ " ");
        System.out.print(lwrF + " ");
        System.out.print(lwrL + " ");
        System.out.print(lwrE + " ");
        System.out.print(lwrP + " ");
        System.out.print(lwrU + " ");
        System.out.print(lwrF + " ");
        System.out.println(lwrF + " ");
        
        asciiSum = uprH + lwrU + lwrF + lwrF + lwrL + lwrE + lwrP + 
                lwrU + lwrF + lwrF;
        
        System.out.println("The sum of the word is: " + asciiSum);
    }
    
}
