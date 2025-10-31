class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> rowSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char current = board[i][j];
                if (current != '.') {
                    if (rowSet.contains(current)) {
                        return false; // Duplicate in row
                    }
                    rowSet.add(current);
                }
            }
        }

        // Check columns
        for (int j = 0; j < 9; j++) {
            Set<Character> colSet = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                char current = board[i][j];
                if (current != '.') {
                    if (colSet.contains(current)) {
                        return false; // Duplicate in column
                    }
                    colSet.add(current);
                }
            }
        }

        // Check 3x3 sub-boxes
        for (int block = 0; block < 9; block++) {
            Set<Character> blockSet = new HashSet<>();
            int startRow = (block / 3) * 3;
            int startCol = (block % 3) * 3;

            for (int i = startRow; i < startRow + 3; i++) {
                for (int j = startCol; j < startCol + 3; j++) {
                    char current = board[i][j];
                    if (current != '.') {
                        if (blockSet.contains(current)) {
                            return false; // Duplicate in 3x3 sub-box
                        }
                        blockSet.add(current);
                    }
                }
            }
        }

        return true;
    }
}