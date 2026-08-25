package scanner1;

import java.util.Scanner;



public class ex9 {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);



        boolean possuiIngresso = true;

        boolean possuiDocumento = false;

        boolean acompanhanteMaiorIdade = true;



        System.out.println(possuiIngresso && possuiDocumento);


        System.out.println(possuiIngresso || possuiDocumento);
        
        
        System.out.println(!possuiDocumento);



        System.out.println(

            possuiIngresso &&

            (possuiDocumento || acompanhanteMaiorIdade)

        );


        System.out.println(

            !(possuiIngresso && possuiDocumento)

        );

       
        sc.close();

    }

}

