import java.util.Arrays;
public class Test {
   public static void bubbleSort(Integer[] arr) {
      int j = 0;
      Integer tmp;
      boolean sorted = false;
      while (!sorted) {
         sorted = true;
         j++;
         for (int i = 0; i < arr.length - j; i++) {
            if (arr[i].compareTo(arr[i + 1]) > 0) {
               tmp = arr[i];
               arr[i] = arr[i + 1];
               arr[i + 1] = tmp;
               sorted = false;
            }
         }
      }
   }
   public static void main(String[] args) {
      Integer[] myArray = { 5, 2, 7, 3, 9 };
      bubbleSort(myArray);
      System.out.println(Arrays.toString(myArray));
   }
}
