package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String[] words = str.split(" ");



        StringBuilder result = new StringBuilder();
        result.append(str.substring(1));
        result.append(str.substring(0,1));
        result.append("ay");
        return result.toString();

    }
}
