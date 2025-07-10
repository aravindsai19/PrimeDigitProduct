import java.util.*;

class example {
    int ran, pos;

    example(int x, int y) {
        ran = x;
        pos = y;
        int count = 0, num = 2;
        while (true) {
            if (isPrime(num)) {
                count++;
                if (count == ran) {
                    int sum = num;
                    while (sum > 9) {
                        int temp = sum;
                        sum = 0;
                        while (temp != 0) {
                            sum += temp % 10;
                            temp /= 10;
                        }
                    }
                    System.out.println(num * sum);
                    break;
                }
            }
            num++;
        }
    }

    boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }
}

public class primedigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ran = s.nextInt();
        int pos = s.nextInt();
        new example(ran, pos);
    }
}
