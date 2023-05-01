import java.util.ArrayList;
import java.util.List;

public class May1 {

    public static Integer diff(Integer[] arr) {
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();

        for (Integer i : arr) {
            if (i%2==0) evens.add(i);
            else {
                odds.add(i);
            }
        }
        Integer sumOdd = odds.stream().mapToInt(x ->x).sum();
        Integer sumEven = evens.stream().mapToInt(x->x).sum();
        if (sumEven>sumOdd) return sumEven-sumOdd;
        else {
            return sumOdd-sumEven;
        }
    }
}
