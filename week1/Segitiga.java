package week1;

public class Segitiga{
    public static void main(String[] Segitiga) {
        int alas = 7;
        int tinggi = 10;
        int sisi1 = 6;
        int sisi2 = 8; //misal sisi miring
        int sisi3 = 5;

        double luas = 0.5 * alas * tinggi;
        int keliling = sisi1 + sisi2 + sisi3;

        System.out.println("Program Menghitung Luas dan Keliling Segitiga");
        System.out.println("Alas              : " + alas);
        System.out.println("Tinggi            : " + tinggi);
        System.out.println("Sisi 1            : " + sisi1);
        System.out.println("Sisi 2            : " + sisi2);
        System.out.println("Sisi 3            : " + sisi3);
        System.out.println("Luas (0.5 * alas * tinggi)  : " + luas);
        System.out.println("Keliling (s1 + s2 + s3) : " + keliling);
    }
}


