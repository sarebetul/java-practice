import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç elemanlı dizi istiyorsun: ");
        int boyut = scanner.nextInt();

        int[] dizi = new int[boyut];
        for(int i=0;i<boyut;i++){
            dizi[i] = random.nextInt(100)+1;
        }

        if(boyut>1) {
            System.out.print("Dizi: ");
            for (int i = 0; i < dizi.length; i++) {
                System.out.print(dizi[i] + " ");
            }

            int saglayan=0;
            System.out.println(" ");
            System.out.println("Şartı sağlayanlar: ");
            if (dizi[0] % dizi[1] == 0) {
                System.out.print(dizi[0] + " ");
                saglayan++;
            }

            if (dizi[dizi.length - 1] % dizi[dizi.length - 2] == 0) {
                System.out.print(dizi[dizi.length - 1] + " ");
                saglayan++;
            }

            for (int i = 1; i < dizi.length - 1; i++) {
                int sayi = dizi[i - 1] + dizi[i + 1];
                if (dizi[i] % sayi == 0) {
                    System.out.print(dizi[i] + " ");
                    saglayan++;
                }
            }

            if(saglayan==0){
                System.out.print("Şartı sağlayan sayı bulunamadı.");
            }
        }else {
            System.out.print("En az 2 boyutlu dizi girmelisiniz.");
        }
    }
}
