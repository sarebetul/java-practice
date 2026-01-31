import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double R;
        System.out.print("R1 = ");
        double R1 = scanner.nextDouble();
        System.out.print("R2 = ");
        double R2 = scanner.nextDouble();
        System.out.print("R3 = ");
        double R3 = scanner.nextDouble();
        double sonuc = (1.0/R1 + 1.0/R2 + 1.0/R3);
        R = 1.0/ sonuc;
        System.out.print("R = " + R);
    }
}