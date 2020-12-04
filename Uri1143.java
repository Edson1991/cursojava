import java.util.Scanner;

public class Uri1143{
    
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int cont, valor;
        int A = 1;
        
        valor = teclado.nextInt();

       for(cont = 1; cont <=valor ; cont++){
            System.out.println(+A+" "+(A*A)+ " "+ (A*A*A));
            A++;
       }
    }
}