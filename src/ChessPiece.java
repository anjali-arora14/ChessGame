import java.util.List;

abstract class ChessPiece {

    protected int column;
    protected int row;

    public ChessPiece(String position) {
        this.column = position.charAt(0) - 'A';  // Converting col (A-H) to (0-7)
        this.row = Integer.parseInt(String.valueOf(position.charAt(1)));
    }

    // Check if a position is within the bounds of the chessboard
    protected boolean isValidPosition(int col, int row) {
        return col >= 0 && col < 8 && row >= 1 && row < 9;
    }

    // converting column index to letter
    protected String columnToChar(int col) {
        return String.valueOf((char) (col + 'A'));
    }

    // Abstract method to be implemented by each piece to get valid moves
    public abstract List<String> getValidMoves();
}
