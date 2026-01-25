public class GuessNumHighOrLow {

    private static int pickedNumber = 42;

    private static int guess(int num) {
        if (num > pickedNumber) return -1;
        if (num < pickedNumber) return 1;
        return 0;
    }

    public static int guessNumber(int n) {
        int left = 1, right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int res = guess(mid);

            if (res == 0) {
                return mid;
            } else if (res == -1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println("Guessed Number: " + guessNumber(n));
    }
}
