import java.util.Scanner;

public class Uri1005{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double A, B, MEDIA;

        //entrada - ler os valores de A e B
        A = teclado.nextDouble();
        B = teclado.nextDouble();

        //processamento - Media dos valores  
        MEDIA = (A*3.5 + B*7.5)/11;

        //saida - exibir o valor MEDIA
        System.out.printf("MEDIA = %.5f%n", MEDIA); // colocar o valor com 5 casas decimais

    }
}