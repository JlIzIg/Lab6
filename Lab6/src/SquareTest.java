public class SquareTest {
    private Square[] squares;

    public Square[] getSquares() {
        return squares;
    }

    public void setSquares(Square[] squares) {
        this.squares = squares;
    }

    public SquareTest(Square[] squares) {
        this.squares = squares;
    }

    public SquareTest() {
    }

    public String getMaxAreaSquare() {
        int maxIndex = 0;
        for (int i = 0; i < squares.length - 1; i++) {
            if (squares[maxIndex].getArea() < squares[i + 1].getArea()) {
                maxIndex = i + 1;
            }
        }
        String maxAreaSquare = "The square with maximum area is " + maxIndex + ". It's area is " + squares[maxIndex].getArea() + ".";
        return maxAreaSquare;
    }
}
