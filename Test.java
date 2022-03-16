import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Degiskenler olustur
        double r, alan, cevre;
        double pi= 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Yari Cap Giriniz:");
        r = input.nextInt();

        alan = pi * r * r;
        cevre= 2 * pi * r;
        System.out.println("Dairenin Alani:"+ alan);
        System.out.print("Dairenin Cevresi:"+ cevre);




















    }
}
