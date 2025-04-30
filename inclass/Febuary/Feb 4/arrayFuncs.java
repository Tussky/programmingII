public class arrayFuncs {
    public static int sumArr(int[] arr){
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }

    public static int minArr(int[] arr){
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int maxArr(int[] arr){
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int avgArr(int[] arr){
        int total = 0;
        int count = 0;
        for (int num : arr) {
            count++;
            total += num;
        }
        return total/count;
    }
    // min, avg
}
