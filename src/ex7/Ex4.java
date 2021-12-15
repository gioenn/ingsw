package ex7;

public class Ex4 {

    /*
        @requires text != null && word != null
        @ensures (\exists int l; 0 <= l < text.length - word.length;
            (\forall int j; 0 <= j < word.length;
             text[l+j] == word[j]))) <=> \result
        @assignable \nothing
     */
    public boolean subString(char[] text, char[] word){ return true; }
}
