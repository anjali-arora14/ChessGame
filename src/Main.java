//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // Test cases for each piece
        ChessPiece pawn = new Pawn("G1");
        ChessPiece king = new King("D5");
        ChessPiece queen = new Queen("E4");

        System.out.println("Pawn moves from G1: " + pawn.getValidMoves());
        System.out.println("King moves from D4: " + king.getValidMoves());
        System.out.println("Queen moves from D4: " + queen.getValidMoves());
        }

}