package testjava1;

import java.util.Scanner;

class Stat {
    private float[] x = new float[50];
    private int num;

    private void sortArray(float[] arr, int size) {
        int i, j;
        float temp;
        for (i = 0; i < size; i++) {
            for (j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void showdata() {
        for (int i = 0; i < num; i++) {
            System.out.print(" " + x[i]);
        }
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        int number, i;

        System.out.print("How many numbers do you want to calculate average for: ");
        number = sc.nextInt();

        if (number > 50) {
            number = 50;
            System.out.println("Limiting count to maximum capacity of 50.");
        }

        for (i = 0; i < number; i++) {
            System.out.print("Enter Value " + (i + 1) + ": ");
            x[i] = sc.nextFloat();
        }
        num = number;
    }

    public float average() {
        float sum = 0.00f, mean;
        for (int i = 0; i < num; i++) {
            sum = sum + x[i];
        }
        mean = sum / num;
        return mean;
    }

    public float median() {
        float med;
        float[] temp_x = new float[50];
        for (int i = 0; i < num; i++) {
            temp_x[i] = x[i];
        }
        sortArray(temp_x, num);

        if (num % 2 == 1) {
            med = temp_x[num / 2];
        } else {
            med = (temp_x[num / 2 - 1] + temp_x[num / 2]) / 2.0f;
        }
        return med;
    }
}

public class TestJava1 {
    public static void main(String[] args) {
        Stat s1 = new Stat();

        s1.input();
        s1.showdata();
        System.out.println("\nAverage value is " + s1.average());
        System.out.println("Median is " + s1.median());

        System.out.print("\nShowdata : ");
        s1.showdata();
        System.out.println();
    }
}