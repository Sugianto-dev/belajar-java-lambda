package programmer.zaman.now.lambda;

// MATERI PENGENALAN LAMBDA
// MATERI MEMBUAT LAMBDA
@FunctionalInterface // Untuk menandakan kalau ini adalah Lambda
public interface SimpleAction {

    // MATERI PENGENALAN LAMBDA
//    String action(); // Hanya bisa 1 method

    // MATERI MEMBUAT LAMBDA
    String action(String name); // Hanya bisa 1 method

//    String action2(); // ERROR

}
