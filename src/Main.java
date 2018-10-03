import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static int[] findInFirstButNotInSecond(int[] src, int[] excluded) {
        int[] dest = new int[src.length];
        int iDest = 0;
        int iSrc = 0;
        int iExcl = 0;
        while (iSrc < src.length) {
            if (iExcl >= excluded.length || src[iSrc] < excluded[iExcl]) {
                // If source element is smaller than the next excluded element, or there are no more excluded elements
                // add it to the destination and move onto the next one
                dest[iDest] = src[iSrc];
                iSrc++;
                iDest++;
            } else if (src[iSrc] > excluded[iExcl]) {
                // If source element is larger, move the pointer on excluded array forward and re-evaluate
                iExcl++;
            } else if (src[iSrc] == excluded[iExcl]) {
                // If both elements are equal, we have a hit - ignore and move on
                iSrc++;
                iExcl++;
            }
        }

        // Return only the filled part of the array
        int[] result = new int[iDest];
        System.arraycopy(dest, 0, result, 0, iDest);
        return result;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 5, 7, 34, 56};
        int[] array2 = {2, 5, 6, 34};
        int[] array3 = {2, 4, 6};
        int[] array4 = {1, 2, 4};

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(findInFirstButNotInSecond(array1, array2)));
        System.out.println();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(findInFirstButNotInSecond(array1, array3)));
        System.out.println();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array4));
        System.out.println(Arrays.toString(findInFirstButNotInSecond(array1, array4)));
        System.out.println();
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(findInFirstButNotInSecond(array2, array3)));
        System.out.println();
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array4));
        System.out.println(Arrays.toString(findInFirstButNotInSecond(array2, array4)));
        System.out.println();
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));
        System.out.println(Arrays.toString(findInFirstButNotInSecond(array3, array4)));
        System.out.println();
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(findInFirstButNotInSecond(array2, array1)));
        System.out.println();
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(findInFirstButNotInSecond(array3, array1)));
        System.out.println();
        System.out.println(Arrays.toString(array4));
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(findInFirstButNotInSecond(array4, array1)));
        System.out.println();
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(findInFirstButNotInSecond(array3, array2)));
        System.out.println();
        System.out.println(Arrays.toString(array4));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(findInFirstButNotInSecond(array4, array2)));
        System.out.println();
        System.out.println(Arrays.toString(array4));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(findInFirstButNotInSecond(array4, array3)));
        System.out.println();
    }
}
