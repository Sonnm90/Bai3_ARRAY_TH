import java.util.Scanner;

public class TIM_GIA_TRI_TRONG_MANG {
    public static void main(String[] args) {
        int size;
        int arr[];
        int x;
        boolean check=false;
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
        System.out.println("Nhập giá trị cần tìm:");
        x = sc.nextInt();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] ==x) {
                check = true;
                System.out.println("Giá trị "+x+" có trong mảng ở vị trí thứ:" + j);
            };
        }
        if(!check)
            System.out.println("Giá trị không có trong mảng");

    }
}
