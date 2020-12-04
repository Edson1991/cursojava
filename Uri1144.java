import java.util.Scanner;

public class Uri1144{
    
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int cont, valor;
        int A = 1;
        
        valor = teclado.nextInt();

       for(cont = 1; cont <= valor ; cont++){
            if( cont % 2 != 0){
                System.out.println(+A+" "+(A*A)+ " "+ (A*A*A));
                System.out.println(+A+" "+(A*A+1)+ " "+ (A*A*A+1));
            }
            else{
                System.out.println(+A+" "+(A*A)+ " "+ (A*A*A));
               System.out.println(+A+" "+(A*A+1)+ " "+ (A*A*A+1));
            }   
            A++;            
        }
    }
}
