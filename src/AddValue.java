import java.util.Scanner;

public class AddValue {
    public static int enterSizeArray() {
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = sc.nextInt();
            if (size > 10) {
                System.out.println("Size does not exceed 10");
            }
        } while (size > 10);
        return size;
    }

    public static void enterNumberToArray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public static void display(int[] arr, String type) {
        if (type.equals("before")) {
            System.out.print("Before: ");
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
        } else if (type.equals("after")) {
            System.out.print("After: ");
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static int enterNumberToAdd() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    public static int enterIndexToAdd() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a index number: ");
        return sc.nextInt();
    }

    public static void addNumberToArray(int[] arr1, int[] arr2) {
        int number=enterNumberToAdd();
        int index = enterIndexToAdd();
        if (index <= 1 && index > arr1.length - 1) {
            System.out.println("Not add number in array");
        } else {
            for (int i = 0; i < arr1.length + 1; i++) {
                if (i < index) {
                    arr2[i] = arr1[i];
                } else if (i == index) {
                    arr2[i] = number;
                } else {
                    arr2[i] = arr1[i - 1];
                }
            }
        }
    }
}