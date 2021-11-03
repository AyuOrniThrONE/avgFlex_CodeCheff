import java.util.Scanner;

public class averageFlex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (1 <= t && t <= 1000) {
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int[] freq = new int[n];
                if (1 <= n && n <= 100) {
                    for (int j = 0; j < n; j++) {
                        freq[j] = sc.nextInt();
                    }
                    int count = 0;
                    for (int j = 0; j < n; j++) {
                        int low = 0;
                        int more = 0;
                        for (int k = 0; k < n; k++) {
                            if (freq[k] <= freq[j]) {
                                low++;
                            }
                            if (freq[k] > freq[j]) {
                                more++;
                            }
                        }
                        if (low > more) {
                            count++;
                        }
                    }
                    System.out.println(count);
                }
            }
        }
    }
}
