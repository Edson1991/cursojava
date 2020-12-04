import java.util.Scanner;

public class Uri1007{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int A, B, C, D, E;

     //entrada - ler os valores de A, B e C
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

     //processamento - 
       E = (A*B - C*D);

     //saida - exibir o valor DIFERENCA

        System.out.println("DIFERENCA = " + E);

    }
}