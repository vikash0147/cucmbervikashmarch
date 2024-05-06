package cucmbervikashmarch;
import java.util.ArrayList;
import java.util.List;

public class CombinationGenerator {
    public static void main(String[] args) {
        int n = 7; // Range from 1 to n
        int k = 3; // Combinations of size k

        List<List<Integer>> combinations = generateCombinations(n, k);
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }

    public static List<List<Integer>> generateCombinations(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        generateCombinationsHelper(n, k, 1, combination, result);
        return result;
    }

    private static void generateCombinationsHelper(int n, int k, int start, List<Integer> combination, List<List<Integer>> result) {
    	if (combination.size() == k) {
            result.add(new ArrayList<>(combination));
            return;
        }

        for (int i = start; i <= n; i++) {
        	System.out.println("i:-" +  i);
        	
            combination.add(i);
           
          System.out.println(" combination.add(i) :- " +combination  );
          generateCombinationsHelper(n, k, i + 1, combination, result);
          combination.remove(combination.size() - 1);
            
         
        }
        
       
    }

}