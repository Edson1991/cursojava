import java.util.Scanner;

public class Uri1060{
    
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        float valor;
        int cont;
        int qtdePositivos=0;


        for (cont = 1; cont <= 6; cont++){
            valor = teclado.nextFloat();
            if (valor > 0){
                //System.out.println("Valor positivo");
                qtdePositivos++;
            }
        }
        System .out.println(qtdePositivos +" valores positivos");
    }
}
