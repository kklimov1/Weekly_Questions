public class Apr17 {
    public static int[] lenmul(int multiple, int length) {
        int[] l = new int[length];
        for (int i=0; i< length; i++) {
            l[i]=multiple*(i+1);
        }
        return l;
    }
}
