import java.util.Scanner;

public class Uri1043{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double A,B,C, resultado;

        //Entrada de dados
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        if((A + B > C) && (B + C > A) && (C + A > B)){
          resultado = A + B + C;
          System.out.println("Perimetro = " + resultado);
        }
        else {
          resultado = ((A + B)/2)*C;
          System.out.println("Area = " + resultado);
        }
    }
}

