import java.util.Scanner;

public class Uri1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int T,V;
        double R;

        //entrada - ler os valores
        T = teclado.nextInt();
        V = teclado.nextInt();

        //processamento - CALCULO Pagamento 
        R = (float)(T*V)/12;

        //saida - exibir o valor Pagamento
        System.out.printf("%.3f%n",R);

    }
}