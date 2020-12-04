import java.util.Scanner;

public class Uri1041{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double X,Y;

        //Entrada de dados
        X = teclado.nextDouble();
        Y = teclado.nextDouble();

        if(X == 0 && Y == 0){
          System.out.println("Origem");
        }
        else if (X > 0 && Y > 0){
          System.out.println("Q1"); 
        }
        else if (X < 0 && Y > 0){
          System.out.println("Q2"); 
        }
        else if (X < 0 && Y < 0){
          System.out.println("Q3"); 
        }
        else if (X > 0 && Y < 0){
          System.out.println("Q4"); 
        }
        else if (X == 0 && Y != 0){
          System.out.println("Eixo Y"); 
        }
        else if (Y == 0 && X != 0){
          System.out.println("Eixo X"); 
        }
    }
}


