import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @org.junit.jupiter.api.Test
    void insertionSort() {

        //Test 1
        List<Integer> inputList = new ArrayList<>();
        IntStream.of(2,1,3,5,4,7,6).forEach(inputList::add);
       assertEquals("[1, 2, 3, 4, 5, 6, 7]", Sorting.insertionSort(inputList,1).toString());

        //Test 2
        List<Integer> inputList2 = new ArrayList<>();
        IntStream.of(4,2,3,6,1).forEach(inputList2::add);
        assertEquals("[1, 2, 3, 4, 6]", Sorting.insertionSort(inputList2,4).toString());

        //Test 3
        List<String> inputList3 = new ArrayList<>();
        Stream.Builder<String> builder = Stream.builder();
        Stream<String> stream = builder.add("foo").add("calc").add("al").add("how").add("yak").build();
        stream.forEach(inputList3::add);
        assertEquals("[al, calc, foo, how, yak]", Sorting.insertionSort(inputList3,2).toString());

        //test 4
        List<Integer> inputList4 = new ArrayList<>();
        IntStream.of(1,2,3,4,5).forEach(inputList4::add);
        assertEquals("[1, 2, 3, 4, 5]", Sorting.insertionSort(inputList4,0).toString());

    }
}