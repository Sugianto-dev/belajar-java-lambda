package programmer.zaman.now.lambda.app;

import java.util.function.Predicate;

// MATERI PACKAGE java.util.function
public class PredicateApp {
    public static void main(String[] args) {

        // Versi Anonymous Class
//        Predicate<String> predicateCheckBlank = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.isBlank();
//            }
//        };

        // Versi Lambda
        Predicate<String> predicateCheckBlank = value -> value.isBlank();

        System.out.println(predicateCheckBlank.test(""));
        System.out.println(predicateCheckBlank.test("Eko"));

        /*
        * Notes!
        * > Kalo kalian butuh dimana parameternya adalah tipe yang dibutuhkan dan return nya adalah boolean, cukup gunakan Interface Predicate ini
        * */

    }
}
