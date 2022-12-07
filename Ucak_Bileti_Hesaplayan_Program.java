import java.util.Scanner;

public class Ucak_Bileti_Hesaplayan_Program {
    public static void main(String[] args) {

        int mesafe, yas, yolculukTipi;
        double mesafeBasinaUcret=0.10, normal_tutar, yas_indirimi, gidis_donus_indirimi;

        Scanner input= new Scanner(System.in);

        System.out.println("Lütfen KM cinsinden mesafeyi giriniz: ");
        mesafe=input.nextInt();
        if(mesafe>0){

            normal_tutar= mesafe*mesafeBasinaUcret;

            System.out.println("Lütfen yaşınızı giriniz: ");
            yas = input.nextInt();
            if(yas>0) {

                if(yas<12){
                    normal_tutar/=2;
                } else if (yas>=12 && yas<=24) {
                    yas_indirimi=normal_tutar*0.10;
                    normal_tutar-=yas_indirimi;
                } else if (yas>=65) {
                    yas_indirimi=normal_tutar*0.30;
                    normal_tutar-=yas_indirimi;
                }

                System.out.println("Lütfen yolculuk türünü seçiniz: " +
                        "\n 1- Tek yön (Tek yön için 1'basınız.)" +
                        "\n 2- Gidiş/dönüş (Gidiş/dönüş bileti almak için 2'ye basınız.)");

                yolculukTipi=input.nextInt();
                switch (yolculukTipi){
                    case 1:
                        System.out.println("Toplam tutar: "+normal_tutar);
                        break;
                    case 2:
                        gidis_donus_indirimi=normal_tutar*0.20;
                        normal_tutar-=gidis_donus_indirimi;
                        normal_tutar*=2;
                        System.out.println("Toplam tutar: "+normal_tutar);
                        break;
                    default:
                        System.out.println("Hatalı veri girdiniz: ");
                }
            }



            else{
                System.out.println("Hatalı veri girdiniz!");
            }




        }
        else{
            System.out.println("Hatalı veri girdiniz.");
        }

    }
}
