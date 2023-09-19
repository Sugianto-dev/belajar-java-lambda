package programmer.zaman.now.lambda.app;

import programmer.zaman.now.lambda.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

// MATERI METHOD REFERENCE
public class MethodReferenceApp {

    // 1. Method Reference Static
    public static void main(String[] args) {

        // Versi Anonymous Class
//        Predicate<String> predicateIsLowerCase = new Predicate<String>() { // Dipilih karena return value nya boolean
//            @Override
//            public boolean test(String value) {
//                return StringUtil.isLowerCase(value);
//            }
//        };

        // Versi Lambda
//        Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value);

        // Versi Method Reference Static
        /*
        * Notes!
        * > Syarat :
        *   > Tipe Data harus sama
        *   > Return Value harus sama
        *   > Jumlah parameter harus sama
        * */
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;

        System.out.println(predicateIsLowerCase.test("eko")); // true
        System.out.println(predicateIsLowerCase.test("Eko")); // false

        // 4. Method Reference Parameter

        // Versi Anonymous Class
//        Function<String, String> functionUpper = new Function<String, String>() {
//            @Override
//            public String apply(String value) {
//                return value.toUpperCase();
//            }
//        };

        // Versi Lambda
//        Function<String, String> functionUpper = value -> value.toUpperCase();

        // Versi Method Reference Parameter
        /*
        * Notes!
        * > Saat memanggil seperti ini, wajib method nya tidak memiliki Parameter
        * > Ini Kalo ngakses Method Reference tapi di parameter yang ada di Lambda nya
        * */
        Function<String, String> functionUpper = String::toUpperCase;

        System.out.println(functionUpper.apply("Eko"));

    }

    // 2. Method Reference Non Static
    public void run() {
        // Versi Anonymous Class
//        Predicate<String> predicateIsLowerCase = new Predicate<String>() {
//            @Override
//            public boolean test(String value) {
//                return MethodReferenceApp.this.isLowerCase(value); // Cara akses Non Static dalam 1 Object yang sama
//            }
//        };

        // Versi Lambda
//        Predicate<String> predicateIsLowerCase = value -> MethodReferenceApp.this.isLowerCase(value);

        // Versi Method Reference Non Static dalam 1 Object yang sama
        Predicate<String> predicateIsLowerCase = this::isLowerCase;

        System.out.println(predicateIsLowerCase.test("eko")); // true
        System.out.println(predicateIsLowerCase.test("Eko")); // false
    }

    // 3. Method Reference Object
    public void run2() {
        // Versi Method Reference Object dalam Object yang berbeda
        MethodReferenceApp app = new MethodReferenceApp(); // Contoh Object lain
        Predicate<String> predicateIsLowerCase = app::isLowerCase; // Ganti this dengan nama object nya

        System.out.println(predicateIsLowerCase.test("eko")); // true
        System.out.println(predicateIsLowerCase.test("Eko")); // false
    }

    public boolean isLowerCase(String value) {
        for (var c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }

    // 4. Method Reference Parameter
    /*
    * Didalam Main Function diatas ...
    * */
}
