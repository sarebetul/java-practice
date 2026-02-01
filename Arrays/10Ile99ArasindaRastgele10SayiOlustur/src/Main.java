import java.util.Random;
public class Main {
    public static void main(String[]args){
        Random random = new Random();
        for(int i=0; i<10; i++){
            int sayi =random.nextInt(90)+0;
            System.out.print(i +". sayı: " + sayi + " ");
        }
    }
}