import java.util.Scanner;

public class AreaCuadrado{
    

  
  public static void main(String args []){
    Scanner scan=new Scanner (System.in);
    double Lado=0;
    System.out.println("programa que calcula el area de un cuadrado");
    System.out.println("Teclea el valor de un lado del cuadrado ");
    Lado=scan.nextDouble();
    System.out.println("El area del cuadrado es " + (Lado*Lado));
 
  }
}