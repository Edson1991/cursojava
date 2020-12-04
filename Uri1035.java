/*
ENTRADA
Leia 4 valores inteiros A, B, C e D. A seguir,

PROCESSAMENTO
(1) se B for maior do que C e 
(2) se D for maior do que A, e 
(3) a soma de C com D for maior que a soma de A e B 
(4)e se C e D, ambos, forem positivos 
(5) e se a variável A for par 

SAIDA
escrever a mensagem "Valores aceitos",
senão escrever "Valores nao aceitos".
*/

import java.util.Scanner;

public class Uri1035{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int A, B, C, D;

        //Entrada de dados
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

        //Processamento e Saida
        if ( (B > C) && (D > A) && (C+D > A+B) && (C > 0 && D > 0) && (A%2 == 0) ) {
           System.out.println("Valores aceitos");
        }
        else{
           System.out.println("Valores nao aceitos");

        }
    }
}


