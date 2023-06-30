public class MissingElement {
    public static int findMissingElement(int[] A, int N) {
        int sum = (N * (N + 1)) / 2;

        for (int i = 0; i < N - 1; i++) {
            sum -= A[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] A1 = {1, 2, 3, 5};
        int N1 = 5;
        int missingElement1 = findMissingElement(A1, N1);
        System.out.println("Missing element: " + missingElement1);

        int[] A2 = {6, 1, 2, 8, 3, 4, 7, 10, 5};
        int N2 = 10;
        int missingElement2 = findMissingElement(A2, N2);
        System.out.println("Missing element: " + missingElement2);
    }
}
