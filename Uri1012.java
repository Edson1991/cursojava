import java.util.Scanner;

public class Uri1012{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double A,B,C,R1,R2,R3,R4,R5;

     //entrada - ler os valores de A, B e C

       A = teclado.nextDouble();
       B = teclado.nextDouble();
       C = teclado.nextDouble();

     //processamento - CALCULO Pagamento 
      R1 = (A*C)/2;
      R2 = (3.14159*C*C);
      R3 = ((A+B)/2)*C; 
      R4 = B*B;
      R5 = A*B;

      //saida - exibir o valor Pagamento
      System.out.printf("TRIANGULO: %.3f%n", R1);
      System.out.printf("CIRCULO: %.3f%n", R2);
      System.out.printf("TRAPEZIO: %.3f%n", R3);
      System.out.printf("QUADRADO: %.3f%n", R4);
      System.out.printf("RETANGULO: %.3f%n", R5);

    }
}