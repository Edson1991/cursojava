import java.util.Scanner;

public class Uri1064{
    
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        float valor;
        double soma = 0;
        int cont;
        int qtdePositivos = 0;
    
   
        for (cont = 1; cont <= 6; cont++){
            valor = teclado.nextFloat();
                if (valor > 0){
                    qtdePositivos++;
                    soma = soma + valor;
            }
        }
        System.out.println(qtdePositivos +" valores positivos");
        System.out.printf("%.1f%n",soma/qtdePositivos);
}
}
