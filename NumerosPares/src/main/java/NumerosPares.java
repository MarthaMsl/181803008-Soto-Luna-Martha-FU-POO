import java.util.Scanner;


public class NumerosPares {
    public static void main(String args []){
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Programa que imprime numeros pares");
        System.out.println("Teclea un numero entero ");
        int num = scan.nextInt();
        if (num%2==0){ 
            int cont=num/2;
            for(int i=0;i<=cont;i++){
                int j=i*2;
                System.out.println(" "+ j);
            }
            
        }
        else
           System.out.println("El número es impar intenta con otro nùmero");
    }
}
