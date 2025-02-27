public class Oprator {
    public static void main(String[] args) {
        // Kamus
        boolean Bool1, Bool2, TF;
        int i, j, hsl;
        float x, y, res;

        // Algoritma
        System.out.println("Silahkan baca teksnya dan tambahkan perintah untuk menampilkan output");

        // Operasi Boolean
        Bool1 = true;
        Bool2 = false;
        System.out.println("Bool1 && Bool2: " + (Bool1 && Bool2)); // AND
        System.out.println("Bool1 || Bool2: " + (Bool1 || Bool2)); // OR
        System.out.println("!Bool1: " + (!Bool1)); // NOT
        System.out.println("Bool1 ^ Bool2: " + (Bool1 ^ Bool2)); // XOR

        // Operasi numerik
        i = 5;
        j = 2;
        System.out.println("i + j: " + (i + j));
        System.out.println("i - j: " + (i - j));
        System.out.println("i * j: " + (i * j));
        System.out.println("i / j: " + (i / j)); // pembagian bulat
        System.out.println("i % j: " + (i % j)); // modulo

        // Operasi numerik float
        x = 5;
        y = 5;
        System.out.println("x + y: " + (x + y));
        System.out.println("x - y: " + (x - y));
        System.out.println("x * y: " + (x * y));
        System.out.println("x / y: " + (x / y));

        // Operasi relasional numerik
        System.out.println("i == j: " + (i == j));
        System.out.println("i != j: " + (i != j));
        System.out.println("i < j: " + (i < j));
        System.out.println("i > j: " + (i > j));
        System.out.println("i <= j: " + (i <= j));
        System.out.println("i >= j: " + (i >= j));

        System.out.println("x != y: " + (x != y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x <= y: " + (x <= y));
        System.out.println("x >= y: " + (x >= y));
    }
}
