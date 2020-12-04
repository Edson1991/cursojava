import java.util.Scanner;

public class Uri1067{
    
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor;
        int cont = 0;
        valor = teclado.nextInt();

        for(cont = 1; cont <= valor; cont+=2){
            System.out.println(cont);
        }
    }
}