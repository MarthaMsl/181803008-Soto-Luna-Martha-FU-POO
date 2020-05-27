import java.util.Scanner;
public class AdivinarNumero {
    public static void main(String args []){
        Scanner scan = new Scanner(System.in);
        System.out.println("Programa para adivinar un nùmero Aleatorio");
        int nAleatorio=(int)(Math.random()*11);
        int num=0;
        do{
           System.out.println("Teclea un numero "); 
           num=scan.nextInt();
           if(num>nAleatorio){
               System.out.println(" Ya te pasaste "); 
           }else if(num<nAleatorio){
               System.out.println(" Màs arriba "); 
           }else{
               System.out.println("¡ACERTASTE!"); 
           }
        }while(num!=nAleatorio);
     }
    }

