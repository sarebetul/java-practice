import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("kaç boyutlu dizi gireceksiniz: ");
        int boyut= scanner.nextInt();
        int[] dizi = new int[boyut];
        for(int i=0; i<boyut;i++){
            System.out.print(i +". sayıyı gir: ");
            int sayi= scanner.nextInt();
            dizi[i]=sayi;
        }
        int sayac=1;
        int max=1;
        for(int i=0;i<boyut-1;i++){
            if(dizi[i]==dizi[i+1]){
                sayac++;
                if(sayac>max){
                    max=sayac;
                }
            }else{
                sayac=1;
            }
        }
        System.out.print("en uzun tekrar eden seri uzunluğu: " + max);
    }
}
