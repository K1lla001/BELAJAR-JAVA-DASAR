public class methods {
    public static void main(String[] args) {

///////////////////////////////////////////////////////////////////////////////////////////////////
    /* Method adalah suatu kode block program yang akan berjalan ketika dipanggil nama methodnya.
    ini adalah cara memanggil method, ditempatkan pada block main fungsi
        myMethod();
        sayHello("Ari", "Susanto");
        System.out.println(nameCaller("Table"));
        System.out.println(examResult(80, 79, 70));
        System.out.println(factorialLoop(15)); */
    }
    static void myMethod () {
        System.out.println("Ini adalah method");
        // method harus dipanggil didalam block main fungsi
    }
///////////////////////////////////////////////////////////////////////////////////////////////////
    /* Method parameter adalah salah satu cara untuk mengirim informasi ke method  yang inig
    dipanggil.
    parameter method biasanya ditempatkan didalam method parentheses
    Contoh :
     */
    static void sayHello(String firstName, String lastName){
        System.out.println("Hello "+firstName + " " + lastName + " Nice to meet you");
    }
///////////////////////////////////////////////////////////////////////////////////////////////////
    /* Method return value
    Secara default method tidak mengembalikan nilai apapun, kita bisa membuat method mengembalikan
    sebuah nilai, tapi agar method bisa menghasilkan value, kita harus mengubah kata kunci void
    dengan tipe data yang ingin di hasilkan.
    dengan menggunakan kata kunci return pada akhir baris method tersebut diikuti dengan
    nilai yang ingin kita kembalikan.

    CONTOH:
     */
    static String nameCaller(String name){
        var names = "Ari";
        var things = "This is " + name;
        if(name == names){
            return name;
        }
        return things;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////
    /* Method Variable Argumen
        Di javaScript jika kita ingin mengirim data ke method dengan jumlah yang tidak pasti
        kita bisa menggunakan array sebagai parameternya.
        tapi di java, ada istilah Variable Argumen yaitu parameter yang diperuntuk menampung
        jumlah data yang lebih dari satu. kita bisa tambahkan ... pada variable dan tipe data yang
        akan menampung nilai yang lebih dari satu.
        variable argumen hanya bisa diletakkan di parameter paling akhir *Jika parameternya  lebih dari 1
     */
    static int examResult (int... values){
        var total = 0;
        for(var value : values){
            total+=value;
        }
        var finalResult = total / values.length;
        return finalResult;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////
    /* Method overloading
       adalah kemampuan untuk membuat method dengan nama yang sama berkali-kali
       secara default nama method tidak boleh sama, tetapi dengan menggunakan method overloading
       kita bisa membuat method dengan nama yang sama berkali-kali. hanya saja, ketentuannya yaitu
       data parameter pada method tersebut harus berbeda. entah itu jumlahnya atau tipe data parameternya

        CONTOH :
     */
    static String examResult(int attendancePoint, int examPoint, int homeWorkPoint) {
        var finalPoint = (attendancePoint + examPoint + homeWorkPoint) / 3;

        String congrats = finalPoint >= 70 ? "Selamat anda lulus" : "Maaf anda tidak lulus";

        return congrats;
      /* Meskipun memiliki nama method yang sama tetapi tetap jalan karena tipe method dan parameter
      yang ada di dalam masing-masing method berbeda
       */
    }
///////////////////////////////////////////////////////////////////////////////////////////////////
    /* Recursive Method
        Adalah kemampuan method memanggil dirinya sendiri;
        recursive method ini sangat bagus jika digunakan saat ingin melakukan factorial
        CONTOH :
        1. tanpa recursive method
     */
    static int factorialLoop(){
        var result = 1;
        for (int i = 1; i <= 5 ; i++) {
            result *= i;
        }
        return result;
    }

    static int factorialLoop(int values){
        if(values == 1){
            return 1;
        }
        return values * factorialLoop( values - 1);
    }
///////////////////////////////////////////////////////////////////////////////////////////////////
}
