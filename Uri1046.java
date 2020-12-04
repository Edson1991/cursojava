import java.util.Scanner;

public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int HI,HF,D;

        //Entrada de dados
        HI = teclado.nextInt();
        HF = teclado.nextInt();

        D = (HF*60) - (HI*60);
       
        if(D<=0){
          D = D + 24 * 60;
        }
          D = D/60;
          System.out.println("O JOGO DUROU " + D + " HORA(S)");
        }
    }

          