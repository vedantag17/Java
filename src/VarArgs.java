import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,5,6,56,4,8,7,9,51);
        multiple(2,3,"Vedant","Agrawal");
    }
    static void multiple(int a, int b, String ...v) {
       // System.out.println(Arrays.toString(a,b,v));
    }
    static void fun(int ...a) {
        System.out.println(Arrays.toString(a));
    }

}
