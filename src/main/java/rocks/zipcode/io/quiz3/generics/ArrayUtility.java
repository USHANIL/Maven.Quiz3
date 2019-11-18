package rocks.zipcode.io.quiz3.generics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        for (SomeType tt: array
             ) {
            if (getNumberOfOccurrences(tt)%2 != 0)
                return tt;
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        for (SomeType tt: array
        ) {
            if (getNumberOfOccurrences(tt)%2 == 0)
                return tt;
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
       Integer noOfOccurence = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(valueToEvaluate)) {
                noOfOccurence++;
            }
        }
        return noOfOccurence;


    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {

        return Arrays.stream(array).filter(item-> predicate.apply(item))
                .toArray(this::getNewArray);
    }

    private SomeType[] getNewArray(int size){
        return (SomeType[]) Array.newInstance(array.getClass().getComponentType(), size);
    }
}
