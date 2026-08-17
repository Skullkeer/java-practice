public class ArraySearch {

    public static int indexOf(int[] theArray, int target) {
        for (int i = 0; i < theArray.length; ++i) {
            if (theArray[i] == target) {
                return(i);
            }
        }
        return -1;
    }

    public static void main() {
        int[] testArray = {1, 2, 3, 4, 5};
        IO.println(indexOf(testArray, 1));
    }
}
