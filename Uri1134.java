import java.util.Scanner;

public class Uri1134{

        public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int codigo;
        int qa=0;
        int qg=0;
        int qd=0;
    
    do{
            //System.out.println("Por favor, digite o codigo do produto");
            codigo = teclado.nextInt();
            switch (codigo){
                case 1:
                    qa++;
                    break;   
              case 2:
                    qg++;
                    break;  
                case 3:
                    qd++;
                    break;    
                default:
            }  

        } while (codigo != 4);
            System.out.println("MUITO OBRIGADO");
            System.out.println("Alcool: " + qa);
            System.out.println("Gasolina: " + qg);
            System.out.println("Diesel: " + qd);
    }
}

