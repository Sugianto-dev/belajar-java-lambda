public class CATATAN {
    /*
    * Notes!
    *
    * Pendahuluan                   = > Agenda
    *                                   > Pengenalan Lambda
    *                                   > Membuat Lambda
    *                                   > Java Function
    *                                   > Method Reference
    *                                   > Dan lain-lain
    *
    * Pengenalan Lambda             = > Apa itu lambda
    *                                   > Lambda berasal dari lambda calculus, yang mengacu pada anonymous function (function tanpa nama)
    *                                   > Tapi, di Java, function/method tidak bisa berdiri sendiri.
    *                                   > Jadi kemungkinan pada prakteknya, lambda di Java dan di bahasa pemrograman lain akan berbeda
    *
    *                                 > Anonymous Class
    *                                   > Di Java kita hanya mengenal Anonymous Class
    *                                   > Lambda di Java sebenarnya adalah versi sederhana membuat sebuah anonymous class
    *
    *                                 > Syarat Lambda
    *                                   > Berupa Interface
    *                                   > Memiliki 1 method abstract
    *                                   > Ditambahkan annotation @FunctionalInterface di Interface-nya
    *                                   > Minimal menggunakan Java 8
    *
    *                                 > SimpleAction.java, SimpleActionApp.java
    *
    * Membuat Lambda                = > Di materi sebelumnya kita sudah mencoba membuat lambda
    *                                 > Sekarang kita akan bahas beberapa cara membuat lambda lainnya
    *
    *                                 > SimpleAction.java, SimpleActionApp.java
    *
    * Package java.util.function    = > Package java.util.function
    *                                   > Saat Java 8 keluar dengan fitur Lambda nya
    *                                   > Java juga menyediakan sebuah package baru bernama java.util.function
    *                                   > Package ini berisikan banyak sekali functional interface yang bisa kita gunakan untuk kebutuhan membuat lambda
    *                                   > Dengan menggunakan interface-interface yang ada di package ini, kita mungkin tidak perlu lagi membuat sendiri functional interface secara manual
    *
    *                                 > Dan masih banyak Function lainnya
    *
    *                                 > Sebelum buat Lambda sendiri, cek terlebih dahulu di java.util.function, apakah ada Interface yang dibutuhkan atau tidak
    *
    *                                 > ConsumerApp.java, FunctionApp.java, PredicateApp.java, SupplierApp.java
    *
    * Method Reference              = > Kadang saat membuat lambda, isi lambda hanya mengakses method lain atau mengakses method yang ada di parameter method lambda nya
    *                                 > Kita bisa mempersingkat pembuatan lambda tersebut dengan method reference
    *
    *                                 > StringUtil.java, MethodReferenceApp.java
    *
    * Lambda Di Collection          = > Saat fitur Lambda keluar di Java 8, ada banyak sekali default method yang ditambahkan ke Java Collection
    *                                 > Beberapa ada default method yang banyak memanfaatkan fitur Lambda
    *                                 > Di materi ini kita akan bahas beberapa method yang memanfaatkan Lambda
    *
    *                                 > Dan Masih Banyak
    *                                   > Cek isi source code dari Java Collection
    *
    *                                 > ForEachApp.java, RemoveIfApp.java, MapForEachApp.java
    *
    * Lambda Sebagai Lazy Parameter = > Lazy Parameter
    *                                   > Java tidak memiliki fitur parameter lazy seperti di bahasa pemrograman seperti Scala
    *                                   > Lazy parameter artinya, parameter tersebut hanya akan dieksekusi ketika diakses
    *                                   > Untungnya, dengan menggunakan Lambda, kita bisa membuat parameter layaknya lazy parameter
    *
    *                                 > LazyApp.java
    *
    * Lambda Di Optional Class      = > Optional Class
    *                                   > Di Java 8, java menyediakan sebuah class baru bernama Optional yang berada di package java.util
    *                                   > Class ini digunakan sebagai wrapper untuk value yang bisa bernilai null
    *                                   > Optional didesain agar kita lebih mudah ketika beroperasi dengan object yang bisa null
    *                                   > Karena NullPointerException adalah salah satu hal yang sering sekali ditemui oleh Programmer Java
    *
    *                                 > OptionalApp.java
    *
    * Materi Selanjutnya            = > Apache Maven
    *                                 > Java Unit Test
    *                                 > Java Stream
    *
    * */
}
