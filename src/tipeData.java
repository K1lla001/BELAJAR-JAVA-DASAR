public class tipeData {

    public static void main(String[] args) {
//TIPE DATA NUMBER (INTEGER DAN FLOATING NUMBER)
///////////////////////////////////////////////////////////////////////////////////////////////////////////
/*             INTEGER NUMBER
byte min (-128) max(127) size (1byte) default value ( 0 )
short min (-32,768) max(32,767) size (2bytes) default value ( 0 )
int min (-2,147,483,648) max(2,147,483,647) size (4byte) default value ( 0 )
long min (-9,223,372,036,854,775,808) max (9,223,372,036,854,775,807) size (8byte) default value ( 0 ) */

        byte iniByte = 100; //jika pada tiap tipe integer number di isi dengan value yang diluar nilai
        short iniShort = 32000; // maximal dan minimal nya makan akan error.
        int iniInt = 20123321;
        long iniLong = 2332232323L;
        //pada long kita bisa menambahkan huruf L untuk menandakan bahwa ini adalah tipe data long

///////////////////////////////////////////////////////////////////////////////////////////////////////////
/*FLOATING NUMBER
float min(3.4e-038) max(3.4e+038) size (4byte) default value(0.0)
double min(1.7e-308) max(1.7e+308) size (8byte) default value(0.0) */

        float iniFloat = 10.12F; //beri huruf F di belakang untuk menandakan
        double iniDouble = 120.23;

        //kita juga bisa pakai titik (.) atau underscore _ untuk pemisah besaran number
        //contoh : satu juta > 1_000_000
///////////////////////////////////////////////////////////////////////////////////////////////////////////
//       KONVERSI TIPE DATA NUMBER
//        1. Widening Casting (otomatis) = byte>short>int>long>float>double
//        2. Narrowing Casting (Manual) = double>float>long>int>short>byte

        //contoh Widening Casting;
        short iniShort2 = 10_000;
        int iniInt2 = iniShort2;

        //contoh Narrowing Casting;
//      byte iniByte2 = iniInt2; -- tidak akan bisa karena byte hanya menampung nilai maksimal 127;
        byte iniByte2 = (byte) iniInt2; // output : 16 ini terkena number overflow
        //karena 10.000 tidak bisa ditampung oleh byte jadi setelah mencapai nilai max (127).
        // dia akan kembali ke -128 kemudian menghitung kembali sampai nilai max(127)
        // sehingga nilai 16 adalah perputaran dari nilai max (127) dan nilai min(-128) sebanyak 10.000x
//////////////////////////////////////////////////////////////////////////////////////////////////////////
        //TIPE DATA CHAR
        //value yang ada pada tipe data ini dibungkus dengan tanda kutip (' ');
        char a = 'A';
        char b = 'R';
        char c = 'I';
//////////////////////////////////////////////////////////////////////////////////////////////////////////
        //TIPE DATA BOOLEAN
        //boolean mengembalikan 2 nilai yaitu true dan false;
        //default value pada boolean adalah false
        boolean benar = true;
        boolean salah = false;
///////////////////////////////////////////////////////////////////////////////////////////////////////////
        //TIPE DATA STRING
        //Berisikan kumpulan karakter atau kumpulan teks;
        //value yang ada pada tipe data ini dibungkus dengan tanda kutip dua (" ")
        //default value dari string adalah null;
        String firstName = "Ari";
        String lastName = "Susanto";
//////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Variable
        // variable adalah tempat untuk menyimpan data, biasanya diletakkan setelah tipedata
        // pada tipe data String di atas firstName dan lastName adalah yang disebut variable;
        String myName = "Ari Susanto"; // myName adalah variable
        // variable pada Java hanya bisa menyimpan satu tipe data saja;

        //KATA KUNCI var

        // kata kunci var adalah cara untuk mendeklarasikan variable yang ada sejak java versi 10.
        //dengan var kita tidak perlu menginisialisasi tipe datanya karena akan secara otomatis,
        // diketahui oleh java.
        // perlu diingat saat mendeklarasikan variable dengan kata kunci var
        //kita harus mengisi value nya secara langsung
        var myFavNumber = 29; // pendeklarasian yang benar;
//        var myNumber;
//        myNumber = 29; // ini akan error

        /*KATA KUNCI FINAL
          final adalah cara untuk mendeklarasikan variable konstan, yaitu variable yang valuenya tidak
          bisa dirubah saat data nya sudah di set. */

        final int yourFavNumber = 16;

      //yourFavNumber = 29; // error
/////////////////////////////////////////////////////////////////////////////////////////////////////////
        /* TIPE DATA BUKAN PRIMITIF
           Di java semua tipe data primitif memiliki representasi tipe data bukan primitifnya; */

        ////////////////////////////////////////////////////////////
        /// TIPE DATA PRIMITIF          TIPE DATA BUKAN PRIMITIF ///
        /// byte                        Byte                     ///
        /// short                       Short                    ///
        /// int                         Integer                  ///
        /// long                        Long                     ///
        /// float                       Float                    ///
        /// double                      Double                   ///
        /// char                        Character                ///
        /// boolean                     Boolean                  ///
        ////////////////////////////////////////////////////////////

        //DEFAULT VALUE DARI TIPE DATA BUKAN PRIMITIF DIATAS ADALAH NULL;
        int num = 1;
        Integer integerNum = num; // konversi dari tipe data primitif ke bukan primitif

        long longNum = integerNum.longValue(); // konversi dari bukan primitif ke primitif
///////////////////////////////////////////////////////////////////////////////////////////////////////
        /* TIPE DATA ARRAY
            Array berisikan kumpulan data dengan tipe data yang sama
            jumlah data di array tidak bisa berubah setelah pertama kali dibuat.
            array biasa */
        String[] myArray = new String[3];
        myArray[0] = "Ari";
        myArray[1] = "Susanto";
        myArray[2] = "Susa";

        //Array initializer
        int[] myIntArray = {
                1,2,3,4,5
        };

        /*Operasi di array
            array.[index] -> mengambil data array;
            array.[index] = value -> mengubah data array;
            array.length -> mengakses panjang array nya */

        //ARRAY DIDALAM ARRAY
        String[][] members = {
                {"Ari", "Susanto"}, // index 0 memiliki 2 index yaitu index 0 dan 1;
                {"Sengu", "Rengoku"}, // index 1 memiliki 2 index yaitu index 0 dan 1;
                {"Serenede"} // index 2 memiliki 1 index yaitu 0;
        };

        System.out.println(members[0][1]);
///////////////////////////////////////////////////////////////////////////////////////////////////////
    }

}
