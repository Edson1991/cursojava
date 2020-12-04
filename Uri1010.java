import java.util.Scanner;

public class Uri1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int A1,B1,A2,B2;
        double C1,C2,D;

     //entrada - ler os valores de A, B e C

     A1 = teclado.nextInt();
     B1 = teclado.nextInt();
     C1 = teclado.nextDouble();

     A2 = teclado.nextInt();
     B2 = teclado.nextInt();
     C2 = teclado.nextDouble();

     //processamento - CALCULO Pagamento 
      D = (B1*C1 + B2*C2);

     //saida - exibir o valor Pagamento
     System.out.printf("VALOR A PAGAR: R$ %.2f%n", D);

    }
}