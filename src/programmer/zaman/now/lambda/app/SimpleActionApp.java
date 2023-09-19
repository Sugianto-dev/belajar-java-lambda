package programmer.zaman.now.lambda.app;

import programmer.zaman.now.lambda.SimpleAction;

// MATERI PENGENALAN LAMBDA
// MATERI MEMBUAT LAMBDA
public class SimpleActionApp {
    public static void main(String[] args) {

        // MATERI PENGENALAN LAMBDA

//        // Versi Anonymous Class
//        SimpleAction simpleAction1 = new SimpleAction() {
//            @Override
//            public String action() {
//                return "Eko";
//            }
//        };
//
//        System.out.println(simpleAction1.action());
//
//        // Versi Lambda (Versi sederhana dari anonymous function)
//        /*
//        * Notes!
//        * > Ini masih versi panjang dari lambda
//        * */
//        SimpleAction simpleAction2 = () -> {
//            return "Eko";
//        };
//
//        System.out.println(simpleAction2.action());

        // MATERI MEMBUAT LAMBDA

        // Cara 1 dengan mendeklarasikan tipe data nya
        SimpleAction simpleAction1 = (String value) -> { // Nama variable bebas tidak harus sama dengan Interface nya
            return "Hello " + value;
        };

        // Cara 2 tidak mendeklarasikan tipe data nya
        SimpleAction simpleAction2 = (name) -> { // Nama variable bebas tidak harus sama dengan Interface nya
            return "Hello " + name;
        };

        // Cara 3 tanpa block
        SimpleAction simpleAction3 = (String value) -> "Hello " + value;

        // Cara 4 tanpa block & tanpa tipe data
        SimpleAction simpleAction4 = (value) -> "Hello " + value;

        // Cara 5 tanpa block, tanpa tipe data & tanpa ()
        SimpleAction simpleAction5 = value -> "Hello " + value;

    }
}
