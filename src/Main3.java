import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner month = new Scanner(System.in);
        System.out.println("Nhap thang can kiem tra so ngay:");
        byte a = month.nextByte();
        switch (a) {
            case 2:
                System.out.println("Thang " + a + " co 28 hoac 29 ngay");
                break;
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang " + a + " co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang " + a + " co 30 ngay");
                break;
        }
    }
}
