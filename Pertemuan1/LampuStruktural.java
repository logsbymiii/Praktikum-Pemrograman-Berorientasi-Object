public class LampuStruktural 
{
    public static void main(String[] args)
    { 
        String merek1 = "Philips";     String warna1 = "Putih";        double daya1 = 9;
        String merek2 = "Panasonic";   String warna2 = "Kuning";       double daya2 = 12;
        String merek3 = "Hannochs";    String warna3 = "Putih";        double daya3 = 5;
        String merek4 = "Osram";       String warna4 = "Kuning";       double daya4 = 7;
        String merek5 = "Chiyoda";     String warna5 = "Putih";        double daya5 = 14;
        String merek6 = "Sanyo";       String warna6 = "Kuning";       double daya6 = 10;
        String merek7 = "Xiaomi Yeelight"; String warna7 = "RGB";      double daya7 = 8;
        String merek8 = "In-Lite";     String warna8 = "Putih";        double daya8 = 20;
        String merek9 = "Signify";     String warna9 = "Kuning";       double daya9 = 6;
        String merek10 = "Visalux";    String warna10 = "Putih";       double daya10 = 11;
 
        boolean status1 = nyalakanLampu(merek1);
        boolean status2 = nyalakanLampu(merek2);
        status1 = matikanLampu(merek1);
 
        cetakLampu(merek1, warna1, daya1);
        cetakLampu(merek2, warna2, daya2);
        cetakLampu(merek3, warna3, daya3);
        cetakLampu(merek4, warna4, daya4);
        cetakLampu(merek5, warna5, daya5);
        cetakLampu(merek6, warna6, daya6);
        cetakLampu(merek7, warna7, daya7);
        cetakLampu(merek8, warna8, daya8);
        cetakLampu(merek9, warna9, daya9);
        cetakLampu(merek10, warna10, daya10);
    }
 
    public static boolean nyalakanLampu(String merek)
    {
        System.out.println(merek + " dinyalakan...");
        return true; 
    }
 
    public static boolean matikanLampu(String merek)
    {
        System.out.println(merek + " dimatikan...");
        return false;
    }
 
    public static void cetakLampu(String merek, String warna, double daya)
    {
        System.out.println("Merek : " + merek);
        System.out.println("Warna : " + warna);
        System.out.println("Daya  : " + daya + " Watt");
        System.out.println("---------------------------------");
    }
}
 
