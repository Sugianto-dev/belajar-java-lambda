package programmer.zaman.now.lambda.app;

import java.util.function.Consumer;

// MATERI PACKAGE java.util.function
public class ConsumerApp {
    public static void main(String[] args) {

        // Versi Anonymous Class
//        Consumer<String> consumer = new Consumer<String>() {
//            @Override
//            public void accept(String value) {
//                System.out.println(value);
//            }
//        };

        // Versi Lambda
        Consumer<String> consumer = value -> System.out.println(value);

        consumer.accept("Eko Kurniawan");

        /*
        * Notes!
        * > Jika butuh sebuah Lambda hanya untuk menerima data, bisa pakai Interface Consumer ini
        * */

    }
}
