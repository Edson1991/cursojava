import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int A,B;
        double C,S;

     //entrada - ler os valores de A, B e C

     A = teclado.nextInt();
     B = teclado.nextInt();
     C = teclado.nextDouble();

     //processamento - CALCULO SALARIO 
       S = (B*C);

     //saida - exibir o valor salario

     System.out.println("NUMBER = " + A);
     System.out.printf("SALARY = U$ %.2f%n", S);

    }
}
