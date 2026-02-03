import java. util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir metin giriniz: ");
        String metin = scanner.nextLine();

        String[] kelimeler = metin.split(" ");

        for(int i=0;i< kelimeler.length;i++){
            String kelime = kelimeler[i];
            for(int j=(kelime.length()-1);j>=0;j--){
                System.out.print(kelime.charAt(j));
            }
            System.out.print(" ");
        }
    }
}
