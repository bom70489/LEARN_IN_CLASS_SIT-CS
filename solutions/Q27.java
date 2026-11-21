import java.util.Arrays;
import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        double[] scores = new double[total];
        for (int i = 0; i < total; i++) {
            scores[i] = sc.nextDouble();
        }

        double[] sorted = scores.clone();
        Arrays.sort(sorted);

        
        double pos10 = (10.0 * (total + 1)) / 100.0;
        double pos30 = (30.0 * (total + 1)) / 100.0;
        double pos50 = (50.0 * (total + 1)) / 100.0;
        double pos70 = (70.0 * (total + 1)) / 100.0;
        double pos90 = (90.0 * (total + 1)) / 100.0;

        
        int i10 = (int) pos10 - 1;
        double p10 = sorted[i10] + (pos10 - (int) pos10) * (sorted[i10 + 1] - sorted[i10]);

        int i30 = (int) pos30 - 1;
        double p30 = sorted[i30] + (pos30 - (int) pos30) * (sorted[i30 + 1] - sorted[i30]);

        int i50 = (int) pos50 - 1;
        double p50 = sorted[i50] + (pos50 - (int) pos50) * (sorted[i50 + 1] - sorted[i50]);

        int i70 = (int) pos70 - 1;
        double p70 = sorted[i70] + (pos70 - (int) pos70) * (sorted[i70 + 1] - sorted[i70]);

        int i90 = (int) pos90 - 1;
        double p90 = sorted[i90] + (pos90 - (int) pos90) * (sorted[i90 + 1] - sorted[i90]);

        
        StringBuilder result = new StringBuilder();
        for (double s : scores) {
            if (s > p90) result.append("A ");
            else if (s > p70) result.append("B ");
            else if (s > p50) result.append("C ");
            else if (s > p30) result.append("D ");
            else if (s > p10) result.append("E ");
            else result.append("F ");
        }

        System.out.println(result);
        sc.close();
    }
}