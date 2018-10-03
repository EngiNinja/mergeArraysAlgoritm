import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    /*
    * @param array1 array elements from which are kept
    * @param array2 array elements from which are deleted
     *finds elements from first array that are not in second
     */
    public static ArrayList<Integer> findInFirstButNotInSecond(int[] array1, int[] array2) {
        ArrayList<Integer> output = new ArrayList<>();

        int iterArray1 = 0;
        int iterArray2 = 0;
        int p1 = array1[iterArray1];
        int p2 = array2[iterArray2];
        Integer lastP2 = p2;
        Integer lastInsertedP1 = 0;
        boolean lastIter = false;

        while (true) {
            // cheks if its the last iteration or if it should stop
            if ((iterArray1 == array1.length - 1) && (iterArray2 == array2.length - 1)
                && lastIter) {
                break;
            } else if ((iterArray1 == array1.length - 1) && (iterArray2 == array2.length - 1)) {
                lastIter = true;
            }

            // magic
            if (p1 > p2) {
                if (iterArray2 != array2.length - 1) {
                    iterArray2++;
                } else {
                    if ((output.isEmpty()) || ((output.get(output.size() - 1) != p1) && (p1
                        != lastP2) && p1 != lastInsertedP1)) {
                        output.add(p1);
                        lastInsertedP1 = p1;
                    }
                    if (iterArray1 != array1.length - 1) {
                        iterArray1++;
                    }
                }
            } else if (p1 < p2) {
                if ((output.isEmpty()) || ((output.get(output.size() - 1) != p1) && (p1 != lastP2)
                    && p1 != lastInsertedP1)) {
                    output.add(p1);
                    lastInsertedP1 = p1;
                }
                if (iterArray1 != array1.length - 1) {
                    iterArray1++;
                } else if (iterArray2 != array2.length - 1) {
                    iterArray2++;
                }
            } else if (p1 == p2) {
                if (iterArray2 != array2.length - 1) {
                    iterArray2++;
                }
                if (iterArray1 != array1.length - 1) {
                    iterArray1++;
                }
            }
            lastP2 = p2;
            p1 = array1[iterArray1];
            p2 = array2[iterArray2];
        }
        return output;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 5, 7, 34, 56};
        int[] array2 = {2, 5, 6, 34};
        int[] array3 = {2, 4, 6};
        int[] array4 = {1, 2, 4};

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(findInFirstButNotInSecond(array1, array2));
        System.out.println();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array3));
        System.out.println(findInFirstButNotInSecond(array1, array3));
        System.out.println();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array4));
        System.out.println(findInFirstButNotInSecond(array1, array4));
        System.out.println();
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(findInFirstButNotInSecond(array2, array3));
        System.out.println();
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array4));
        System.out.println(findInFirstButNotInSecond(array2, array4));
        System.out.println();
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));
        System.out.println(findInFirstButNotInSecond(array3, array4));
        System.out.println();
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array1));
        System.out.println(findInFirstButNotInSecond(array2, array1));
        System.out.println();
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array1));
        System.out.println(findInFirstButNotInSecond(array3, array1));
        System.out.println();
        System.out.println(Arrays.toString(array4));
        System.out.println(Arrays.toString(array1));
        System.out.println(findInFirstButNotInSecond(array4, array1));
        System.out.println();
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array2));
        System.out.println(findInFirstButNotInSecond(array3, array2));
        System.out.println();
        System.out.println(Arrays.toString(array4));
        System.out.println(Arrays.toString(array2));
        System.out.println(findInFirstButNotInSecond(array4, array2));
        System.out.println();
        System.out.println(Arrays.toString(array4));
        System.out.println(Arrays.toString(array3));
        System.out.println(findInFirstButNotInSecond(array4, array3));
        System.out.println();
    }
}
