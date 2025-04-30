import java.util.ArrayList;
import java.util.List;

class King extends ChessPiece {
    public King(String position) {
        super(position);
    }

    public List<String> getValidMoves() {
        List<String> possibleMoves = new ArrayList<>();

        // King can move by 1 step in any of 8 directions
        int[][] moves = {
                {-1, 0}, {1, 0}, {0, -1}, {0, 1}, // Horizontal and Vertical
                {-1, -1}, {-1, 1}, {1, -1}, {1, 1} // Diagonals
        };

        for (int[] move : moves) {
            int newCol = column + move[0];
            int newRow = row + move[1];

            if (isValidPosition(newCol, newRow)) {
                possibleMoves.add(columnToChar(newCol) + String.valueOf(newRow));
            }
        }

        return possibleMoves;
    }
}
