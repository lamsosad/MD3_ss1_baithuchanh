import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Nhap so a");
        double a = number.nextDouble();
        System.out.println("Nhap so b");
        double b = number.nextDouble();
        System.out.println("Nhap so c");
        double c = number.nextDouble();
        if (a != 0) {
            double x = (c - b) / a;
            System.out.println("Nghiem cua phuong trinh la:" + x);
        } else {
            if (b == c) {
                System.out.println("Phuong trinh vo so nghiem");
            }else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    }
}
