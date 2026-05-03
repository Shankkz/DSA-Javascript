import java.util.*;

class Solution {
    String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> res = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return res;
        backtrack(digits, 0, new StringBuilder());
        return res;
    }

    private void backtrack(String d, int i, StringBuilder sb) {
        if (i == d.length()) {
            res.add(sb.toString());
            return;
        }

        String letters = map[d.charAt(i) - '0'];

        for (char c : letters.toCharArray()) {
            sb.append(c);
            backtrack(d, i+1, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}