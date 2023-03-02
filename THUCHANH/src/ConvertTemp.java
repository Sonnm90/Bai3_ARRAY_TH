import java.util.Scanner;

public class ConvertTemp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double f;
        double c;
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Chuyển đổi độ F-> độ C");
            System.out.println("2. Chuyển đổi độ C-> độ F");
            System.out.println("0. Thoát");
            choice = input.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Nhập vào độ F");
                    f= input.nextInt();
                    System.out.println("Độ F-> độ C:"+ fahrenheitToCelcius(f));
                    break;
                }

                case 2: {
                    System.out.println("Nhập vào độ C");
                    c= input.nextInt();
                    System.out.println("Độ C-> độ F:"+ celciusToFahrenheit(c));
                    break;
                }
                case 0:
                    System.exit(0);
            }

        }while (choice != 0) ;

    }

    public static double celciusToFahrenheit (double c) {
        double f= (9.0/5) *c +32;
        return f;
    }
    public static double fahrenheitToCelcius (double f) {
        double c= (5.0/9) * (f-32);
        return c;
    }
}
