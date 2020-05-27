import java.util.Scanner;
public class Descuento {
    public static void main(String args []){
        Scanner scan = new Scanner(System.in);
        double total=0;
        System.out.println("Programa que calcula un descuento ");
        System.out.println("Teclea la cantidad a pagar  ");
        double pago = scan.nextDouble();
        if(pago>=100){
            total= (pago-(0.10*pago));
        }
        System.out.println("Tu total a pagar con el 10% de descuento ");
        System.out.println(" es de: " + total); 
        
    }
    
}
