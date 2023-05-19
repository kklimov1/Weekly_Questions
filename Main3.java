import java.util.*;
import java.util.stream.Collectors;

public class Main3 {
    public static void main ( String[] args ) {
        /*
        Integer[] myInt = new Integer[5];
        String hello = "Hello there!";
        List<Integer> myArrList = new ArrayList<>();
        myArrList.add(47);
        myArrList.add(56);
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println(myInt.length +" " + hello.length() + " " + myArrList.size());
        for (int i=1; i<11; i++) {
            map.put(i, i+1);
        }
        for (Integer o : map.keySet()) {
            System.out.println(map.get(o));
        }
        System.out.println("Hello there!");

        MyInt is = (a, b) -> {
            System.out.println("In a functional interface fam.");
            System.out.println(a);
            System.out.println(" "+b);
        };
        is.myFunction("a", "sdf");

        Sorter func = (l) -> {
            Collections.sort(l , Comparator.comparing(String::length));
        };
        List<String> myweek = Arrays.asList("apple", "banana", "pear", "watermelon", "kiwi");
        func.sort(myweek);
        myweek.forEach(System.out::println);

        List<Integer> unfilteredL = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5, 7);
        InFu intFunction = (l) -> {
            List<Integer> nIe = new ArrayList<>();
            for (Integer s : l) {
                if (!nIe.contains(s)) nIe.add(s);
            }
            return nIe;
        };

        List<Integer> filteredInteger = intFunction.r(unfilteredL);

        filteredInteger.forEach(x -> System.out.print(x +" "));

        DoubleList d = (v)-> {
            Double max = Double.MIN_VALUE;
            for (Double c : v) {
                if (c > max) max = c;
            }
            return max;
        };
        */

        /*
        List<Double> jDoubleee = Arrays.asList(3.3, 1.1, 2.2, 5.5, 4.4);
        System.out.println(d.findMax(jDoubleee));

        List<Double> myList = Arrays.asList(2.5, 4.7, 1.2, 8.9, 3.1);

        System.out.println(myList.stream().mapToDouble(Double::doubleValue).sum() / myList.size());
        List<Integer> nondiv = unfilteredL.stream()
                .filter(i -> !(i%2==0 || i%3==0)).collect(Collectors.toList());
        nondiv.stream().forEach(System.out::println);
        List<Integer> newx = Arrays.asList(8, 7, 6, 5, 4, 3, 2, 1, 100, 200, 300, 400);
        Integer max = newx.stream().mapToInt(i -> i).max().orElseThrow();
        Integer min = newx.stream().mapToInt(i -> i).min().orElseThrow();
        System.out.println(max);
        System.out.println(min);
        */

        Integer[] myArray = {2,3,4 };
        Integer[] myArray2 = { 1,4};
        double m = Med2Arrays.findMedianArrays(myArray, myArray2);
        System.out.println(m);

        LinkedList<Integer> ll0 = new LinkedList<>();
        LinkedList<Integer> ll1 = new LinkedList<>();

        ll0.add(2);
        ll0.add(3);
        ll0.add(4);

        ll1.add(0);
        ll1.add(5);
        //Mergek.func(ll0, ll1);
    }

    public static boolean divisible2and3(Integer cv) {
        if (cv%2==0 || cv%3==0) return false;
        else return true;
    }
}
