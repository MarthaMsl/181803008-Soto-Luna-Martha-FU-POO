import java.util.Scanner;

public class CuboNumero{
    

  
  public static void main(String args []){
        Scanner scan=new Scanner (System.in);
        int numero=0;
        System.out.println("programa que calcula el cubo de un numero");
        System.out.println("Teclea un numero");
        numero=scan.nextInt();
        System.out.println("El cubo de el numero es " + ((numero*numero)*numero));
  }
}