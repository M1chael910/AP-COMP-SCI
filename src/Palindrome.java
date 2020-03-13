import com.sun.codemodel.internal.JForEach;
import com.sun.media.sound.SF2InstrumentRegion;

import javax.swing.*;

public class Palindrome {

    public static void main(String[] args) {
//        String enteredString = getInput();
//        String palindrome = removeCharacters(enteredString);
//        System.out.println(palindrome);
    }


    public static String getInput() {
        String word = JOptionPane.showInputDialog("Enter a word");
        return word;
    }

    public static String removeCharacters(String enteredString) {
        String newWord = "";
        String word = enteredString;
        int length = word.length();
        while (word.indexOf(" ") != -1) {

        }


        word.indexOf(" ");




        for (int i = 0; i <= length; i++) {
            String letter = word.substring(i, i + 1);



            System.out.println(letter);


        }
        return word;
    }

//    public static String reverse(String word) {
//
//
//    }

//    public static String determineIfPalindrome(String firstWord) {
//
//
//
//    }



}
