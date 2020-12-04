import java.util.Scanner;

public class Uri1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double SA,NS,R;

        //Entrada de dados
        SA = teclado.nextDouble();

        if(SA >=0 && SA <= 400.00){
          NS = SA*1.15;
          R = NS - SA;
          System.out.printf("Novo salario: %.2f%n" , NS);
          System.out.printf("Reajuste ganho: %.2f%n" , R);
          System.out.println("Em percentual: 15 %");
        }
        else if (SA > 400.00 && SA <= 800.00){
          NS = SA*1.12;
          R = NS - SA;
          System.out.printf("Novo salario: %.2f%n" , NS);
          System.out.printf("Reajuste ganho: %.2f%n" , R);
          System.out.println("Em percentual: 12 %"); 
        }
        else if (SA > 800.00 && SA <= 1200.00){
          NS = SA*1.10;
          R = NS - SA;
          System.out.printf("Novo salario: %.2f%n" , NS);
          System.out.printf("Reajuste ganho: %.2f%n" , R);
          System.out.println("Em percentual: 10 %"); 
        }
        else if (SA > 1200.00 && SA <= 2000.00){
          NS = SA*1.07;
          R = NS - SA;
          System.out.printf("Novo salario: %.2f%n" , NS);
          System.out.printf("Reajuste ganho: %.2f%n" , R);
          System.out.println("Em percentual: 7 %"); 
        } 
        else if (SA > 2000.00){
          NS = SA*1.04;
          R = NS - SA;
          System.out.printf("Novo salario: %.2f%n" , NS);
          System.out.printf("Reajuste ganho: %.2f%n" , R);
          System.out.println("Em percentual: 4 %"); 
        } 
    }
}
      