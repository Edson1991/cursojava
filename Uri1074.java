/*
Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida. 
Para cada valor lido, mostre uma mensagem em inglês dizendo se este valor lido é par (EVEN), ímpar (ODD), positivo (POSITIVE) 
ou negativo (NEGATIVE). 

No caso do valor ser igual a zero (0), embora a descrição correta seja (EVEN NULL),
pois por definição zero é par, seu programa deverá imprimir apenas NULL.

Entrada
A primeira linha da entrada contém um valor inteiro N(N < 10000) que indica o número de casos de teste. 
Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).

Saída
Para cada caso, imprima uma mensagem correspondente, de acordo com o exemplo abaixo. 
Todas as letras deverão ser maiúsculas e sempre deverá haver um espaço entre duas palavras impressas na mesma linha.

*/

import java.util.Scanner;

public class Uri1074{
    
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor, valorX;
        int cont = 0;
        valor = teclado.nextInt();

       for(cont = 1; cont <=valor ; cont++){
            valorX = teclado.nextInt();
            if(valorX == 0 ){
                System.out.println("NULL");
            }
            else if(valorX > 0 && valorX % 2 == 0){
                System.out.println("EVEN POSITIVE");
            }
            else if(valorX > 0 && valorX % 2 != 0){
                System.out.println("ODD POSITIVE");
            }
            else if(valorX < 0 && valorX % 2 == 0){
                System.out.println("EVEN NEGATIVE");
            }
            else if(valorX < 0 && valorX % 2 != 0){
                System.out.println("ODD NEGATIVE");
            }
        }
    }
}


