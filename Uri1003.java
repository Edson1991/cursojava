import java.util.Scanner;

public class Uri1003{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        int A, B, SOMA;

        //entrada - ler os valores de A e B
        A = teclado.nextInt();
        B = teclado.nextInt();

        //processamento - somar ambos os valores e armazenar em A
        SOMA = A + B;

        //saida - exibir o valor SOMA
        System.out.println("SOMA = " + SOMA);
    }
}