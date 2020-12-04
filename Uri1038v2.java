import java.util.Scanner;

public class Uri1038v2{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int cod, qtd;
        double total;

        //Entrada de dados
        cod = teclado.nextInt();
        qtd = teclado.nextInt();


        if(cod == 1){
          total = qtd * 4.0 ; 
        }
        else if (cod == 2){
          total = qtd * 4.5 ;
        }
        else if (cod == 3){
          total = qtd * 5.0 ;
        }
        else if( cod == 4){
          total = qtd * 2.0;
        }
        else{
            total = qtd * 1.50;
        }
          System.out.printf("Total: R$ %.2f%n" , total);
        }
    }