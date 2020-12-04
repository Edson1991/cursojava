import java.util.Scanner;

public class Uri1142{
    
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int cont, valor;
        int A = 1;
        
        valor = teclado.nextInt();

       for(cont = 1; cont <=valor ; cont++){
            System.out.println(+A+" "+(A+1)+ " "+ (A+2)+ " PUM");
            A+=4;
       }
    }
}