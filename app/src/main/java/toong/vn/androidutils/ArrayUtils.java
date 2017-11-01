package toong.vn.androidutils;

/**
 * Created by PhanVanLinh on 01/11/2017.
 * phanvanlinh.94vn@gmail.com
 */

public class ArrayUtils {

    public static boolean contains(int[] array, int elem) {
        return getArrayIndex(array, elem) != -1;
    }

    /** Return the index of {@code needle} in the {@code array}, or else {@code -1} */
    public static int getArrayIndex(int[] array, int needle) {
        if (array == null) {
            return -1;
        }
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == needle) {
                return i;
            }
        }
        return -1;
    }
}
