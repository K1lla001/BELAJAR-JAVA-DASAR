public class Loopings {
    public static void main(String[] args) {

////////////////////////////////////////////////////////////////////////////////////////////////////
    /* FOR LOOP
    FOR MEMILIKI BEBERAPA STATEMENT PADA BAGIAN ARGUMENNYA
        1. init statement
            akan dieksekusi sekali diawal perulangan
        2. condition
            akan selalu dilakukan pengecekan ditiap perulangan
        3. post statement
            akan dieksekusi tiap kali diakhir perulangan

        CONTOH : */
        for (int i = 1; i < 5; i++) {
            /* expected output:
            perulangan ke- 1
            perulangan ke- 2
            perulangan ke- 3
            perulangan ke- 4
             */
        }
///////////////////////////////////////////////////////////////////////////////////////////////////
    /* WHILE LOOP
        WHILE HANYA MEMBUTUHKAN SEBUAH KONDISI PADA BAGIAN ARGUMENNYA
        hanya saja post statement nya di isi pada block while, bukan pada argumennya

        CONTOH : */
        var num = 1;

        while(num < 5){
            num++;
            //expected output : 5
        }
////////////////////////////////////////////////////////////////////////////////////////////////////
    /* DO WHILE LOOP
        DO WHILE LOOP BERBEDA DENGAN WHILE, KARENA PENGECEKAN KONDISI AKAN DILAKUKAN SETELAH STATEMENT
        DI EKSEKUSI.
        Jadi pada perulangan ini, Kondisi pasti akan dieksekusi minimal satu kali sebelum kebenaran
        pada kondisi tersebut di cek.

        CONTOH : */
        var number = 10;
        do {
            number++;
        } while (number > 15);
        // expected output : 11

        /* PADA PERULANGAN ADA KONDISI YANG DISEBUT INFINITE LOOP (Perulangan tanpa henti)
            INI TERJADI KARENA KONDISI YANG SELALU BERNILAI TRUE/ TIDAK ADANYA KONDISI
            YANG MEMBATASI SAMPAI MANA KONDISI AKAN TERUS DIEKSEKUSI.
         */
///////////////////////////////////////////////////////////////////////////////////////////////////
    /* BREAK DAN CONTINUE
        BREAK adalah kata kunci untuk menghentikan seluruh perulangan;
        CONTINUE adalah kata kunci untuk melewati atau mengabaikan seuatu kondisi pada perulangan

        CONTOH :
        1. BREAK
     */
        /* var counter = 1;
        while(true){
            //System.out.println(counter++);
            if(counter > 5){
                break;
            }
        } */
        /* Meskipun kondisi pada while bernilai true (yang akan menyebabkan infinite loop)
            dengan menggunakan break itu akan menghentikan seluruh perulangan.

         2. CONTINUE
         */
        var numbers = 100;
        for (int i = 1; i <= numbers; i++) {
            if(i %  2 == 0){
                continue;
            }
            //System.out.println("angka ganjil ke-" + i);
        }
//////////////////////////////////////////////////////////////////////////////////////////////////
    /* FOR EACH
        ini adalah perulangan untuk melakukan iterasi pada array.
        Foreach mengembalikan array baru. yang dimasukan kedalam variable baru
        yang ada di dalam argumen for each

        CONTOH :
     */
        String[] myArr = {
                "Ari", "Susanto", "Karawang", "Indonesia"
        };

        for (var myNewArr: myArr) {
            //System.out.println(myNewArr);
            /* expected output :
                    Ari
                    Susanto
                    Karawang
                    Indonesia
             */
        }
///////////////////////////////////////////////////////////////////////////////////////////////////
    }
}
