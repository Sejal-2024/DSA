class Solution {
    public List<String> generateParenthesis(int n) {
          List<String> ans = new ArrayList<>();
        dfs(0, 0, new StringBuilder(), n, ans);
        return ans;
    }

    private void dfs(int openCount, int closeCount, StringBuilder currentString, int n, List<String> ans) {
        if (openCount == n && closeCount == n) {
            ans.add(currentString.toString());
            return;
        }

        if (openCount < n) {
            currentString.append("(");
            dfs(openCount + 1, closeCount, currentString, n, ans);
            currentString.deleteCharAt(currentString.length() - 1); // Backtrack
        }

        if (closeCount < openCount) {
            currentString.append(")");
            dfs(openCount, closeCount + 1, currentString, n, ans);
            currentString.deleteCharAt(currentString.length() - 1); // Backtrack
        }
        
    }
}