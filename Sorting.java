
import java.util.*;
import java.util.stream.IntStream;

public class Sorting {

    /*
     * Overview of Insertion Sort:
     * Insertion Sort is a sorting algorithm which sorts the list by
     * shifting elements in the correct position one at a time.
     * It compares the input elements by the subList that is sorted
     * If the current element is greater then, it leaves it in place and moves onto the next element
     *and finds the correct position and moves it to that position.
     *This is done by shifting the elements, when one element is larger, it moves the larger element one position ahead.
     */


    /*
     * This is a routine that will be able to sort the list in order by its generic type.
     * The generic type can be comparable and will ultimately be the determining factor of the sorted list
     * The sorting algorithm we decided to choose is insertion sort.
     * Its input is a nearly sorted list that is dependent upon the distortion factor
     * The output will be a sorted array.
     * Precondition: nearly sorted list from k distortion factor, generic and comparable
     * PostCondition: sorted list that is generic.
     * routine header should be static with a generic that is comparable and input list of type generic
     */

      public static<T extends Comparable<T>> List<T> insertionSort(List<T> inputList, int k){

      List<T> outputList = new ArrayList<>(inputList);

      for(int i = 1; i < outputList.size(); i++) {
          T currentVal = outputList.get(i);
          int j = i - 1;


          while (checkConditions(outputList, currentVal, j, k, i)) {
              outputList.set(j + 1, outputList.get(j));
              j--;
          }

          outputList.set(j + 1, currentVal);
        }

          return outputList;
      }

      // this check for the innner loop which allows the elements before the current index swap its values at the current index
      //checks to see the distortion factor and if the list element at the jth index (before) the current val at the ith index
     // is greater element at the current index. Also if j is inbounds, if any are false, inner loop condition terminates.
      private static<T extends Comparable<T>> boolean checkConditions(List<T> outputList, T currentVal, int j, int k, int i){
          return j >= i - k && j >= 0 && outputList.get(j).compareTo(currentVal) > 0;
      }

    
    /*
     * Best Case: O(N) : if it already sorted, there are no comparisons, only 1 loop that makes one pass or moves.
     * Worst Case: O(N * k) : Nested loops with N moves and one loop is bounded by k
     * Average Case: O(N * k): Nested loop with N moves and is bounded by k in nested loop.
     */











}
