import java.util.*;

public class Casting {
    public static void main(String args []){
        
        //CASTING EXPLICITO**********
        //Hay que indicarle a cual debe hacer el cambio
        short a=1;
        int b=15;
        a=(short)b;
        
        //CASTING IMPLICITO**********
        //se hace de manera automàtica
        float c=4.5f;
        double d=5.6;
        d=c;
        
        //¿Què pasa cuando casteo de flotante a double a entero?
        double pi=3.1416;
        int duda=(int)pi;//La de menor jerarquìa siemore va entre parèntesis
        System.out.println("El valor de duda es: "+ duda);
        
        //Si queremos convertir de string a entero
        int h ;
        String otro="340";
        h=Integer.parseInt(otro);
        System.out.println(h);
        
        //CICLO FOR
        for(int i=0; i<10;i++){
        System.out.println(i +" -");
        }
        System.out.println();
        //CICLO WHILE
        int j=1;
        while(j<10){
        System.out.println(j +" +");
    }
        System.out.println();
        //DO WHILE
        c=1;
        do{
            System.out.println();
        }while();
       
        
    }
    
}
