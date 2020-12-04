/*
Leia um valor inteiro X. 
Em seguida apresente os 6 valores ímpares consecutivos a partir de X,
um valor por linha, inclusive o X ser for o caso
*/

import java.util.Scanner;

public class Uri1070{
    
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor;
        int cont = 0;
        valor = teclado.nextInt();

        if( valor % 2 == 0){
                valor+=1;
        }
        for(cont = 1; cont <=6; cont++){
            System.out.println(valor);
            valor+=2;
        }
    }
}
