import java.util.Scanner;
/* Contoh program yang mengandung prosedur dan fungsi */
public class SubProgram {
    
    // Fungsi untuk mencari maksimum dari dua bilangan bulat
    public static int maxab(int a, int b) {
        return (a >= b) ? a : b;
    }

    // Prosedur untuk menukar dua bilangan bulat
    public static void tukar(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Ke dua bilangan setelah tukar: a = " + a + " b = " + b);
    }

    // Program utama
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);

        System.out.println("Maksimum dua bilangan");
        System.out.print("Ketikkan dua bilangan, pisahkan dg RETURN: ");

        int a = masukan.nextInt();
        int b = masukan.nextInt();

        System.out.println("Ke dua bilangan: a = " + a + " b = " + b);
        System.out.println("Maksimum = " + maxab(a, b));

        System.out.println("Tukar kedua bilangan...");
        tukar(a, b);
    }
}
