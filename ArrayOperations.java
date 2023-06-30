import java.util.Arrays;

public class ArrayOperations {
    public static int[] addArrays(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int maxLength = Math.max(len1, len2);

        int[] result = new int[maxLength];

        for (int i = 0; i < maxLength; i++) {
            int num1 = (i < len1) ? arr1[i] : 0;
            int num2 = (i < len2) ? arr2[i] : 0;
            result[i] = num1 + num2;
        }

        return result;
    }

    public static int[] subtractArrays(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int maxLength = Math.max(len1, len2);

        int[] result = new int[maxLength];

        for (int i = 0; i < maxLength; i++) {
            int num1 = (i < len1) ? arr1[i] : 0;
            int num2 = (i < len2) ? arr2[i] : 0;
            result[i] = num1 - num2;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] additionResult = addArrays(arr1, arr2);
        System.out.println("Addition result: " + Arrays.toString(additionResult));

        int[] subtractionResult = subtractArrays(arr1, arr2);
        System.out.println("Subtraction result: " + Arrays.toString(subtractionResult));
    }
}
