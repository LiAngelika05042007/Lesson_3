import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] sortedArr = sorting();
        System.out.println(Arrays.toString(sortedArr));
        double[] bot = {9.5, 10.1, 61.2, -1.5, -98.3, -2.3, 2.3, -32.4, -5.3, 58.6, 98.2, 7.5, 32.4, -12.3, 56.7};
        double sum = 0;//общая сумма положительных чисел
        int count = 0;//количество положительных чисел
        boolean firstNegative = false;//находит было ли найдено первое отрицательное число
        for (double num : bot) {
            if (num < 0) {
                firstNegative = true;
            } else if (firstNegative) {
                sum += num;
                count++;
            }
        }
        double average = sum / count;
        System.out.println("Среднее арифметическое положительных чисел - " + average);
    }
    public static int[]sorting() {
        int[] numbers = {5,1,4,2,3};
        int n = numbers.length;
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (numbers[j] < numbers[min]) {
                    min = j;
                }
            }
            int xs = numbers[min];
            numbers[min] = numbers[i];
            numbers[i] = xs;
            System.out.println(Arrays.toString(numbers));
        }
        return numbers;

    }
}












