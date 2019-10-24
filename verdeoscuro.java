import java.util.Scanner;

public class ejer472 {

        public static void main(String[] args) {

                Scanner sc = new Scanner (System.in);

                int desnivel = 0;
                int numveces;

                System.out.println("Introduzca el numero de ejemplos a introducir");

                numveces = sc.nextInt();
                System.out.println("Introduzca los desniveles");
                for ( int i=0;i<numveces; i++) {
                desnivel = sc.nextInt();

                }
                if (desnivel > -1 && desnivel < 1000000 && numveces > -1 && numveces < 200000) {
                        System.out.println("APTA");



                }else {
                        System.out.println(" NO APTA");
        }
        }

}

