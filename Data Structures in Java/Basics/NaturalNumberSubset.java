import java.util.ArrayList;

public class NaturalNumberSubset {
    public static void printSubsets(ArrayList<Integer> Subsets) {
        for (int i = 0; i < Subsets.size(); i++) {
            System.out.print(Subsets.get(i));
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printSubsets(subset);
            return;
        }

        // to be added
        subset.add(n);
        findSubsets(n - 1, subset);

        // nit to be added
        subset.remove(subset.size() - 1);
        findSubsets(n - 1, subset);
    }

    public static void main(String args[]) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);
    }
}
