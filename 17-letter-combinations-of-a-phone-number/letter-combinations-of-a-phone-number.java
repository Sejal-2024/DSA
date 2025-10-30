class Solution {
    Map<Character, String> phoneMap = new HashMap<Character, String>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};

    List<String> output = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return output;
        }
        backtrack("", digits);
        return output;
    }

    private void backtrack(String combination, String next_digits) {
        if (next_digits.length() == 0) {
            output.add(combination);
            return;
        }

        Character digit = next_digits.charAt(0);
        String letters = phoneMap.get(digit);

        for (char letter : letters.toCharArray()) {
            backtrack(combination + letter, next_digits.substring(1));
        }
    }
}