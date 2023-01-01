import java.util.HashSet;

public class FindUniqueSubsequences {
    public static void uniquesubsequences(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currChar = str.charAt(idx);
        uniquesubsequences(str, idx + 1, newString + currChar, set);
        uniquesubsequences(str, idx + 1, newString, set);
    }

    public static void main(String args[]) {
        String str = "aaaa";
        HashSet<String> set = new HashSet<>();
        uniquesubsequences(str, 0, " ", set);
    }
}
