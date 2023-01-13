public class statements {
    public static void main(String[] args) {

//////////////////////////////////////////////////////////////////////////////////////////////////////////
    /* IF STATEMENT
        adalah statement percabangan yang biasa digunakan untuk membandingkan 2 atau lebih kondisi */

        var nilai = 5;
        var nilaiMinimal = 7;
        // if statement akan di eksekusi jika kondisi nilai terpenuhi (true)
        if (nilai >= nilaiMinimal) {
            //System.out.println("Selamat anda lulus");
        } // else statement akan dieksekusi jika kondisi if tidak terpenuhi (false)
        else {
            //System.out.println("Anda belum memenuhi nilai minimal");
        }

    /* ADA JUGA else if yang biasanya digunakan untuk menjadi kondisi alternatif
     jika kondisi if tidak terpenuhi */

        // =================================================== //
        /* TERNARY OPERATOR;
         ini adalah statement perbandingan if else yang lebih sederhana
        Contoh : */
        var num = 50;
        var result = num >= 75 ? "Anda Lulus" : "Anda tidak Lulus";
        //System.out.println(result);
//////////////////////////////////////////////////////////////////////////////////////////////////
    /* SWITCH STATEMENT
    Statement ini biasanya digunakan untuk membandingkan suatu nilai
    switch harus memiliki case untuk kondisinya diikuti dengan kata kunci break, untuk menandakan
    bahwa case tersebut berakhir. jika sebuah case tidak memiliki break, maka akan menyebabkan case
    lain tereksekusi.
    kemudian switch juga memiliki kata kunci default untuk memenuhi sebuah kondisi jika misal kondisi
    pada tiap case tidak terpenuhi
       CONTOH: */

        var grade = "E";

        switch (grade) {
            case "A":
                //System.out.println("Nilai anda Sangat Baik");
                break;
            case "B":
                //System.out.println("Nilai anda Baik");
                break;
            case "C":
                //System.out.println("Nilai anda Cukup");
                break;
            case "D":
                //System.out.println("Nilai anda Kurang");
                break;
            default:
                //System.out.println("Nilai anda tidak memenuhi nilai minimal");
// ==================================================== //
    /* SWITCH LAMBA, ini adalah fitur pada java versi 14.0, fitur ini tidak bisa digunakan pada
    java versi 13 kebawah.
       Contoh Penggunaanya: */
                var rank = "D";
                switch (rank) {
                    case "A" -> {
                        //System.out.println("Nilai anda Sangat Baik");
                    }
                    case "B" -> {
                        //System.out.println("Nilai anda Baik");
                    }
                    case "C" -> {
                        //System.out.println("Nilai anda Baik");
                    }
                    case "D" -> {
                        //System.out.println("Nilai anda Kurang");
                    }
                    default -> {
                        //System.out.println("Nilai anda tidak memenuhi nilai minimal");
                    }
                }

    /* Jika kembalian dari sebuah kondisi tidak membutuhkan banyak baris/sederhana
       kita tidak wajib menggunakan kurung kurawal { } */
// ========================================================= //
    /* KATA KUNCI YIELD JUGA FITUR BARU PADA JAVA 14, yield hampir mirip dengan return value.
        Contoh : */
                var alphabet = "F";

                var ucapan = switch (alphabet){
                    case "A":
                        yield "Selamat anda lulus dengan nilai Amat Baik";
                    case "B", "C":
                        yield "Selamat anda lulus dengan nilai Cukup Baik";
                    case "D":
                        yield "Anda harus mengikuti remedial";
                    default:
                        yield "anda tidak lulus";
                };
                //System.out.println(ucapan);
///////////////////////////////////////////////////////////////////////////////////////////
        }
    }
}
