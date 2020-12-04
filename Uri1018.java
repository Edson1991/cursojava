import java.util.Scanner;

public class Uri1018{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int A, B, N100, N50, N20, N10, N5, N2, N1;

        //entrada - ler os valores
        A = teclado.nextInt();

        //processamento - CALCULO  
        B = A;
        
        N100 = A/100;
        A = A - N100 * 100;
        N50 = A/50;
        A = A - N50 * 50;
        N20 = A/20;
        A = A - N20 * 20;
        N10 = A/10;
        A = A - N10 * 10;
        N5 = A/5;
        A = A - N5 * 5;
        N2 = A/2;
        A = A - N2 * 2;
        N1 = A; 

        //saida - exibir o valor
        System.out.println(B);
        System.out.println(N100 + " nota(s) de R$ 100,00");
        System.out.println(N50 + " nota(s) de R$ 50,00"); 
        System.out.println(N20 + " nota(s) de R$ 20,00"); 
        System.out.println(N10 + " nota(s) de R$ 10,00"); 
        System.out.println(N5 + " nota(s) de R$ 5,00"); 
        System.out.println(N2 + " nota(s) de R$ 2,00"); 
        System.out.println(N1 + " nota(s) de R$ 1,00");        
    }
}