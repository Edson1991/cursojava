import java.util.Scanner;

public class Uri1006{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double A, B, C, MEDIA;

        //entrada - ler os valores de A, B e C
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

       //processamento - Media dos Valores
       
       MEDIA = (A*2 + B*3 + C*5)/10;

       //saida - exibir o valor MEDIA
        System.out.printf("MEDIA = %.1f%n", MEDIA); // colocar o valor com 5 casas decimais
    }
}

