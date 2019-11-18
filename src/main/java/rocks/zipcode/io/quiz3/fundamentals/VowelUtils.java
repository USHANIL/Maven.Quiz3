package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        return getIndexOfFirstVowel(word).intValue() != -1;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        char[] charArray = word.toCharArray();
        Integer index = -1;
        for (int i = 0; i < charArray.length; i++) {
            if(isVowel(charArray[i])){
                index = i;
                break;
            }
        }
        return index;
    }


    public static Boolean startsWithVowel(String word) {
        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(Character character) {
        Character ch = Character.toUpperCase(character);
        return (ch=='A' || ch=='E' || ch=='I' ||
                ch=='O' || ch=='U');
    }
}
