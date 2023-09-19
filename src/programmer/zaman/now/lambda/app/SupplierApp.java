package programmer.zaman.now.lambda.app;

import java.util.function.Supplier;

// MATERI PACKAGE java.util.function
public class SupplierApp {
    public static void main(String[] args) {

        // Versi Anonymous Class
//        Supplier<String> supplier = new Supplier<String>() {
//            @Override
//            public String get() {
//                return "Eko Kurniawan Khannedy";
//            }
//        };

        // Versi Lambda
        Supplier<String> supplier = () -> "Eko Kurniawan Khannedy";

        System.out.println(supplier.get());

        /*
        * Notes!
        * > Ketika kalian butuh Lambda dimana ketika kalian panggil Lambda nya dia ngebalikin resource tanpa kirim parameter, bisa gunakan Interface Supplier ini
        * */

    }
}
