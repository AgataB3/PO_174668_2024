public class isEqualOrNull {
    public static <T> boolean isEqualOrNull(T x, T y) {
        if ((x == null && y == null) || x.equals(y)) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int obiekt1 = 6;
        int obiekt2 = 6;
        System.out.println(isEqualOrNull(obiekt1, obiekt2));
    }
}
