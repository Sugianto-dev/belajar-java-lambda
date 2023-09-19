package programmer.zaman.now.lambda.app;

import java.util.function.Supplier;

// MATERI LAMBDA SEBAGAI LAZY PARAMETER
public class LazyApp {
    public static void main(String[] args) {
        // Bukan Lazy Parameter
//        testScore(60, getName());
        /*
        * Notes!
        * > Masalahnya adalah parameter name(getName()) akan selalu dipanggil di testScore() walaupun tidak dipakai karena score = 60
        * */

        // Lazy Parameter
        testScore(60, () -> getName());
        /*
        * Notes!
        * > Method getName() hanya akan dipanggil ketika parameter name pada testScore() dibutuhkan
        * */
    }

//    public static void testScore(int score, String name) { // Bukan Lazy Parameter
    public static void testScore(int score, Supplier<String> name) { // Lazy Parameter, String diubah menjadi Lambda Supplier
        if (score > 80) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Coba Lagi Tahun Depan");
        }
    }

    public static String getName() {
        System.out.println("Method getName() dipanggil");
        return "Eko";
    }
}
