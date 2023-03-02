import java.util.Arrays;
import java.util.Scanner;

public class DAO_NGUOC_MANG {
    public static void main(String[] args) {
        int size;
        int arr[];
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
        for (int j = 0; j < arr.length / 2; j++) {
            int temp = arr[j];
            arr[j] = arr[size - 1 - j];
            arr[size - 1 - j] = temp;
        }
//        System.out.printf("\n%-20s%s","Mảng sau khi đảo ngược:"," ");
//        for (int j = 0; j < arr.length; j++) {
//            System.out.print(arr[j] + "\t");
//
//        }
String str= Arrays.toString(arr);
        System.out.println(str);
    }
}
