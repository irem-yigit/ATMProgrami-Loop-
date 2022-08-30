import java.util.Scanner;

public class miniproje9 {
    public static void main(String[] args){
        // Döngülerle ATM programı (while döngüsü ile) bakiye öğrenme, para çekme, para yatırma

        Scanner scan = new Scanner(System.in);
        String islemler = "1.işlem: Bakiye öğrenme\n"
                     + "2.işlem: Para çekme\n"
                     + "3.işlem: Para yatırma\n"
                     + "4.işlem: Çıkış için 'q' ya basın...";

        System.out.println("******************************");
        System.out.println(islemler);
        System.out.println("******************************");
        int bakiye = 1000;

        while (true){
            System.out.print("İşlem seçiniz: ");
            String islem = scan.nextLine();

            if (islem.equals("q")){
                System.out.println("Çıkış yapılıyor...");
                break;
            }
            else if (islem.equals("1")){
                System.out.println("Bakiyeniz: " + bakiye);
            }
            else if (islem.equals("2")){
                System.out.print("Çekmek istediğiniz tutarı girin: ");
                int tutar = scan.nextInt();
                scan.nextLine();                           //yukarda işlemi string aldığımız için nextınt değerden sonra nextline almamız gerekiyor
                if (bakiye - tutar<0){
                    System.out.println("Yeterli bakiyeniz yok... Bakiyeniz: " + bakiye);
                }
                else{
                    bakiye-=tutar;
                    System.out.println("Yeni bakiyeniz: " + bakiye);
                }
            }
            else if (islem.equals("3")){
                System.out.print("Yatırmak istediğiniz tutarı girin: ");
                int tutar = scan.nextInt();
                scan.nextLine();                          //yukarda işlemi string aldığımız için nextınt değerden sonra nextline almamız gerekiyor
                bakiye+=tutar;
                System.out.println("Yeni bakiyeniz: " + bakiye);
            }
            else {
                System.out.println("Geçersiz işlem girildi...");
            }
        }

    }
}
