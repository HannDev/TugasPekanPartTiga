package EvaluasiPekanPartTiga;

public class EvaluasiPekanPartTigaTryCatch {
    public static void main(String[] args) {



                 //Nomor 1

        System.out.println("1. Cara mengatasi error");
        int A = 1;
        try{
            int Y = A / 0;
            System.out.println("Data : "+ Y);
        }catch (Exception XX){
            System.out.println(XX);
        }
             System.out.println("Akhir Program");
             System.out.println("=======================================");



                 //Nomor 2

        System.out.println("2. Cara menggunakan finally");

        try {
            int B = 1;
            System.out.println(B/0);
        }catch (Exception E){
            System.out.println(E);
        }finally {
            System.out.println("Baris didalam Finally akan dieksekusi");
            System.out.println("=======================================");
        }



                 //Nomor 3

        System.out.println("3. Cara mengerrorkan program");
        try {
            int C = 2;
                System.out.println(C/0);
            }catch (Exception E){
                E.printStackTrace();
                System.out.println("=======================================");
        }


    }
}