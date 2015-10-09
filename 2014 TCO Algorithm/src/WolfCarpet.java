public class WolfCarpet {

    public long count(int r1, int c1, int r2, int c2) {

        long colOdd = 0;
        long rowOdd = 0;
        rowOdd = (r2 - r1) / 2;
        if (!isEven(r2)) {
            rowOdd++;
        }
        if (!isEven(r1)) {
            rowOdd++;
        }
        if (!isEven(r1) && !isEven(r2)) {
            rowOdd--;
        }

        colOdd = (c2 - c1) / 2;
        if (!isEven(c2)) {
            colOdd++;
        }
        if (!isEven(c1)) {
            colOdd++;
        }
        if (!isEven(c1) && !isEven(c2)) {
            colOdd--;
        }

        long total = (r2 - r1 + 1) * 1L * (c2 - c1 + 1);
        return total - (colOdd * rowOdd);

    }

    private boolean isEven(int x) {
        return ((x % 2) == 0);
    }
}
