import java.util.Scanner;

public class Uri1065{
    
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        int cont;
        int qPar = 0;
        int qImpar = 0;
        int qNegativo = 0;
        int qPositivo = 0;
        float valor;

        for(cont = 1; cont <=5 ; cont++){
            valor = teclado.nextFloat();
            if(valor == 0 ){
                qPar++;
            }
            else if(valor > 0 && valor % 2 == 0){
                qPositivo++;
                qPar++;
            }
            else if( valor > 0 && valor % 2 != 0){
                qPositivo++;
                qImpar++;
            }
            else if(valor < 0 && valor % 2 == 0){
                qNegativo++;
                qPar++;
            }
            else if(valor < 0 && valor % 2 != 0){
                qNegativo++;
                qImpar++;
            }
        }   
        System.out.println(qPar +" valor(es) par(es)");
        System.out.println(qImpar +" valor(es) impar(es)");
        System.out.println(qPositivo +" valor(es) positivo(s)");
        System.out.println(qNegativo +" valor(es) negativo(s)");

    }
}