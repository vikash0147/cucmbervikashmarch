package cucmbervikashmarch;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ThreeSumCombinationsStream {
    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 0, 9, 5, 1, 3};
        List<List<Integer>> result = findThreeSumCombinations(arr, 9);

        result.forEach(System.out::println);
    }

    public static List<List<Integer>> findThreeSumCombinations(int[] arr, int targetSum) {
        return IntStream.range(0, arr.length - 2)
                .boxed()
                
                .flatMap(i -> IntStream.range(i + 1, arr.length - 1)
                        .boxed()
                        .flatMap(j -> IntStream.range(j + 1, arr.length)
                                .filter(k -> arr[i] + arr[j] + arr[k] == targetSum)
                                .mapToObj(k -> List.of(arr[i], arr[j], arr[k]))
                        )
                )
                .collect(Collectors.toList());
    }
}
