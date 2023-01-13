public class Operations {
    public static void main(String[] args) {
////////////////////////////////////////////////////////////////////////////////////////////////////
        /* OPERASI MATEMATIKA;
           pertambahan +
           pengurangan -
           pembagian /
           perkalian *
           sisa bagi atau Modulo % */

        int sum = 20 + 2;
        int subt = 20 - 3;
        int divided = 20 / 5;
        int doubler = 2 * 5;
        int modulo = 10 % 3;
////////////////////////////////////////////////////////////////////////////////////////////////////
        /* AUGMENTED ASSIGNMENTS
           operasi ke variable nya sendiri
           contoh yang biasa: */
        int a = 5;
        a = a + 2; //output 7
        // contoh augmented assignment
        int b = 2;
        b += 20; //output 22
        b -= 2; // output 20
        b /= 2; // output 10
        b *= 4; // output 40
//////////////////////////////////////////////////////////////////////////////////////////////////
        /* UNARY OPERATOR
            Operator yang ditempatkat didepan variable;
            ++       -> menaikkan satu angka dari nilai yang ada;
            --       -> mengurangi satu angka dari nilai yang ada;
            +        -> menandakan nilai positif;
            -        -> menandakan nilai negatif;
        int increment = 3;
        increment++; // output 4
        int decrement = 5;
        decrement--; // output 4;
//////////////////////////////////////////////////////////////////////////////////////////////////
        /* OPERATOR PERBANDINGAN
            Operator ini mengembalikan nilai boolean yaitu true dan false
            <        -> Kurang dari
            >        -> Lebih dari
            <=       -> Kurang dari sama dengan
            >=       -> Lebih dari sama dengan
            ==       -> Sama dengan
            !=       -> Tidak sama dengan */

        int num1 = 15;
        int num2 = 25;

       /* System.out.println(num1 < num2);
          System.out.println(num1 > num2);
          System.out.println(num1 <= num2);
          System.out.println(num1 >= num2);
          System.out.println(num1 == num2);
          System.out.println(num1 != num2); */
///////////////////////////////////////////////////////////////////////////////////////////////////
        /* OPERATOR BOOLEAN
            Digunakan untuk operasi terhadap 2 nilai boolean
            &&       -> AND Dan akan bernilai true jika KEDUA nilai true;
            ||       -> OR Atau akan bernilai true jika SALAH SATU nilainya true;
            !        -> KEBALIKAN akan bernilai kebalikan !true bernilai false dan !false = true;
        Contoh: menentukan kelulusan siswa; */
        int absen = 70;
        int exam = 80;
        var lulusAbsen = absen > 69; // true;
        var lulusExam = exam > 75; // true;

        var lulus = lulusAbsen && lulusExam; // output true;
////////////////////////////////////////////////////////////////////////////////////////////////////
    }
}
