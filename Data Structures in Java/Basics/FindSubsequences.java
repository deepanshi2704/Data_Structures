public class FindSubsequences {
    public static void subsequences(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);

        // element chooses to be included
        subsequences(str, idx + 1, newString + currChar);

        // element chooses 'not' to be included
        subsequences(str, idx + 1, newString);
    }

    public static void main(String args[]) {
        String str = "abc";
        subsequences(str, 0, "");
    }
}
