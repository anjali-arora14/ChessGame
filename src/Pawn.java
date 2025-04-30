import java.util.ArrayList;
import java.util.List;

// Class to represent a Pawn
class Pawn extends ChessPiece {
    public Pawn(String position) {
        super(position);
    }

    public List<String> getValidMoves() {
        List<String> possibleMoves = new ArrayList<>();

        // Pawn can move 1 step forward (only vertically)
        if (row < 8) { // Checking it's not at the last row (8th row)
            possibleMoves.add(columnToChar(column) + String.valueOf(row + 1));
        }

        return possibleMoves;
    }
}