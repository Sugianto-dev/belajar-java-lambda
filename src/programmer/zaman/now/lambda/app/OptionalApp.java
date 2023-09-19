package programmer.zaman.now.lambda.app;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

// MATERI LAMBDA DI OPTIONAL CLASS
public class OptionalApp {
    public static void main(String[] args) {

        // Tidak ada masalah
        sayHello("Eko");

        // Tapi, Ketika null akan problem nullPointerException
        // Dan problem nullPointerException akan hilang ketika memakai Optional Class
        String name = null;
        sayHello(name);

    }

    // Ketika null akan problem nullPointerException
//    public static void sayHello(String name) {
//        String nameUpper = name.toUpperCase();
//        System.out.println("HELLO " + nameUpper);
//    }

    // Mengatasi dengan Optional Class
    public static void sayHello(String name) {
        // CARA 1 DENGAN OPTIONAL CLASS
//        Optional<String> optionalName = Optional.ofNullable(name);

        // Versi Anonymous Class
//        Optional<String> optionalNameUpper = optionalName.map(new Function<String, String>() {
//            @Override
//            public String apply(String name) {
//                return name.toUpperCase();
//            }
//        });

        // Versi Lambda
//        Optional<String> optionalNameUpper = optionalName.map(value -> value.toUpperCase());
        /*
        * Notes!
        * > map(), untuk men-transform 1 object ke bentuk object lainnya
        * */

        // Lalu menampilkannya dengan Method ifPresent()

        // Versi Anonymous Class
//        optionalNameUpper.ifPresent(new Consumer<String>() { // ifPresent(), akan memanggil jika ada data saja
//            @Override
//            public void accept(String value) {
//                System.out.println("HELLO " + value);
//            }
//        });

        // Versi Lambda
//        optionalNameUpper.ifPresent(value -> System.out.println("HELLO " + value));

        // CARA 2 DENGAN IF CHECK NULL
        // Jika menggunakan If check null
//        if (name != null) {
//            String upperName = name.toUpperCase();
//            System.out.println("HELLO " + upperName);
//        }

        // CARA 1 DIBUAT LEBIH SIMPLE
        // 1. Data null tidak ditampilkan
//        Optional.ofNullable(name)
//                .map(String::toUpperCase)
//                .ifPresent(value -> System.out.println("HELLO " + value));

        // 2. Data null ditampilkan
//        Optional.ofNullable(name)
//                .map(String::toUpperCase)
//                .ifPresentOrElse(
//                        value -> System.out.println("HELLO " + value),
//                        () -> System.out.println("HELLO")
//                );

        // 3. Data null diubah
        String upperName = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("TEMAN");

        System.out.println("HELLO " + upperName);

        // ... Dan masih banyak lagi method lainnya
        // Silahkan di eksplore untuk java optional class ini
    }
}
