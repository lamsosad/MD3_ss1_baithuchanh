import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner years = new Scanner(System.in);
        System.out.println("Nhap nam can kiem tra");
        int year = years.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.printf("Nam " + year + " la nam nhuan");
                } else {
                    System.out.printf("Nam " + year + " la khong phai nam nhuan");
                }
            } else {
                System.out.printf("Nam " + year + " la nam nhuan");
            }
        } else {
            System.out.printf("Nam " + year + " la khong phai nam nhuan");
        }
    }
}
