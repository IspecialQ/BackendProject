package lesson3;

public class IsPolyndrome {
    public static boolean checkPolyndrome(String word) throws TooShortLenghtOfWordException {
        if (word.length() == 1) {
        throw new TooShortLenghtOfWordException();
        }
        int lengthOfThisWord = word.length();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(word.length() - lengthOfThisWord) == (word.charAt(lengthOfThisWord - 1))) {
            lengthOfThisWord--;
            }
            else return false;
        }
        return true;
    }
}