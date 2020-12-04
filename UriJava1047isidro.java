import java.util.Scanner;

public class UriJava1047isidro{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int hI,hF,mI,mF,dH,dM, tempoI, tempoF, dur;

        //Entrada de dados
        hI = teclado.nextInt();
        mI = teclado.nextInt();
        hF = teclado.nextInt();
        mF = teclado.nextInt();

        tempoI = hI * 60 + mI; //Tranformando Hora Inicial em Minutos e somando aos minutos
        tempoF = hF * 60 + mF; //Tranformando Hora Inicial em Minutose somando aos minutos

        dur = tempoF - tempoI;
        if(dur<=0){
            dur = dur + 24 * 60; // 1 dia em minutos
        }
        dH = dur / 60;
        dM = dur % 60;        
        System.out.println("O JOGO DUROU " +dH+ " HORA(S) E " +dM+ " MINUTO(S)");
    }
}


