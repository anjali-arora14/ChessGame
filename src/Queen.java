import java.util.ArrayList;
import java.util.List;

class Queen extends ChessPiece {
    public Queen(String position) {
        super(position);
    }

    public List<String> getValidMoves() {
        List<String> possibleMoves = new ArrayList<>();

        // Queen can move in any number of steps in all 8 directions
        int[][] queenMoves = {
                {-1, 0}, {1, 0}, {0, -1}, {0, 1}, // Horizontal and Vertical
                {-1, -1}, {-1, 1}, {1, -1}, {1, 1} // Diagonals
        };

        for (int[] move : queenMoves) {
            int count = 1;
            while (true) {
                int newCol = column + move[0] * count;
                int newRow = row + move[1] * count;

                if (isValidPosition(newCol, newRow)) {
                    possibleMoves.add(columnToChar(newCol) + String.valueOf(newRow));
                    count++;
                } else {
                    break;
                }
            }
        }

        return possibleMoves;
    }
}
