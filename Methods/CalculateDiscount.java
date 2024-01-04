public class CalculateDiscount {
    static double sum(double... A) {
        if (A.length == 0) return Integer.MIN_VALUE;
        double m = 0;
        for(int i = 0; i < A.length; i++) {
            m = m + A[i];
        }
        if (m < 200) {
            m = m - ((10 * m) / 100);
        }
        else if (m < 500) {
            m = m - ((15 * m) / 100);
        }
        else if (m > 1000) {
            m = m - ((20 * m) / 100);
        }
      return m;
    }

    public static void main(String[] args) {
        System.out.print(sum(new double[]{10,5,6,7,666,33}));
    }
}
