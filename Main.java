import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] num2 = makeArray(17,7);
        Arrays.stream(num2).forEach(System.out::println);
    }

    public static int[] makeArray(int start, int len) {
        int[] num2 = new int[len];
        num2[0] = start;
        for ( int i=1; i<len; i++){
            num2[i] = num2[i-1]+start;
        }
        return num2;
    }
}
