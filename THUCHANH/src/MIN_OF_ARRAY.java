import java.util.Scanner;

public class MIN_OF_ARRAY {
    public static void main(String[] args) {
        int size;
        int arr[];
        int min=0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập độ dài mảng:");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Độ dài yêu cầu nhỏ hơn 20!");
        } while (size > 20);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Các phần tử trong mảng:", "");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        min = arr[0];
        for (int j = 0; j < arr.length ; j++) {
            if (arr[j]<min) {
                min=arr[j];
            }
        }
        System.out.println("Giá trị nhỏ nhất của mảng là:"+min);
    }
}
