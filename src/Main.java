import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int max = 10;
        int min = 1;
        int rondas, d1, d2;
        int contD1=0, contD2=0;
        int Dif;


        Random ale = new Random();


        rondas = ale.nextInt((max - min +1)) + min;
        System.out.println("CANTIDAD DE RONDAS: " + rondas);
                for(int i=1 ; i<=rondas; i++){
                    d1 = ale.nextInt((6 - 1 + 1)) + 1;
                    contD1 += d1;

                    d2 = ale.nextInt((6 - 1 + 1)) + 1;
                    contD2 += d2;

                    System.out.println();
                    System.out.println("D1: " + d1);
                    System.out.println("D2: " + d2);
                }
        if (contD1 > contD2) {
            System.out.println("¡El dado 1 ganó!");
        } else if (contD2> contD1) {
            System.out.println("¡El dado 2 ganó!");
       } else {
            System.out.println("¡Es un empate!");
        }
    }


}