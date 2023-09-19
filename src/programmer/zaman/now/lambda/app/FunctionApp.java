package programmer.zaman.now.lambda.app;

import java.util.function.Function;

// MATERI PACKAGE java.util.function
public class FunctionApp {
    public static void main(String[] args) {

        // Versi Anonymous Class
        /*
        * Notes!
        * > Function <tipeData, returnValue>
        * */
//        Function<String, Integer> functionLength = new Function<String, Integer>() {
//            @Override
//            public Integer apply(String value) {
//                return value.length();
//            }
//        };

        // Versi Lambda
        Function<String, Integer> functionLength = value -> value.length();

        System.out.println(functionLength.apply("Eko"));

        /*
        * Notes!
        * > Dimanapun kalian butuh parameter & returnValue dalam sebuah Lambda, bisa menggunakan Interface Function ini
        * */

    }
}
