import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner bmi = new Scanner(System.in);
        System.out.println("Nhap so can nang cua ban");
        double kg = bmi.nextDouble();
        System.out.println("Nhap so chieu cao cua ban");
        double m = bmi.nextDouble();
        double BMI = kg / Math.floor(m * m);
        if (BMI < 18) {
            System.out.println("Quá nghiện");
        } else if (BMI < 25 && BMI > 18) {
            System.out.println("OK đấy");
        } else {
            System.out.println("Béo vãi ò");
        }
    }
}
