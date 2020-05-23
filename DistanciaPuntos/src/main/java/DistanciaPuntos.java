import java.util.Scanner;
import java.util.*;
public class DistanciaPuntos{
    

  
  public static void main(String args []){
    Scanner scan=new Scanner (System.in);
    double x1=0,x2=0,y1=0,y2=0;
    double d=0;
    System.out.println("programa que calcula la distancia entre dos puntos");
    System.out.println("Teclea los valores del primer punto ");
    System.out.println("Valor de la cordenada X1 ");
    x1=scan.nextDouble();
    System.out.println("Valor de la cordenada Y1 ");
    y1=scan.nextDouble();
    System.out.println("Teclea los valores del segundo punto ");
    System.out.println("Valor de la cordenada X2 ");
    x2=scan.nextDouble();
    System.out.println("Valor de la cordenada Y2 ");
    y2=scan.nextDouble();
    d=Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1))  ) ;
    System.out.println("LA distancia entre los puntos es: "+d);
  }
}