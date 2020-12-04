import java.util.Scanner;

public class Uri1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int X;
        double Y,R;


        //entrada - ler os valores de A, B e C
        X = teclado.nextInt();
        Y = teclado.nextDouble();

        //processamento - CALCULO Pagamento 
        R = (float)X/Y;

        //saida - exibir o valor Pagamento
        System.out.printf("%.3f", R);
        System.out.println(" km/l");
    }
}

