import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int Intentos, I1, I2, i3;
        int usuario = 0;
        int Aleatorio ;
        int guardar = 0 ;


        Random ale = new Random();


        Aleatorio = ale.nextInt((50 - 1 +1)) + 1;
        System.out.println("CANTIDAD DE INTENTOS: 3 ");

                for(int i=1 ; i<=3; i++){
                    Scanner teclado = new Scanner (System.in);
                    System.out.println("Ingrese su numero");
                    guardar = teclado.nextInt();

                    if (guardar > Aleatorio) {
                        System.out.println("¡El numero a divinar es menor!");
                    } else if (guardar < Aleatorio){
                            System.out.println("¡El numero adivinar es mayor");
                      }else if (guardar == Aleatorio){
                            System.out.println("¡Perdio");
                      }

                }



    }


}