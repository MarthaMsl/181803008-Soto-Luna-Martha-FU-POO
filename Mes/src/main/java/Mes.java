import java.util.Scanner;
public class Mes{
    public static void main(String args []){
    Scanner scan = new Scanner(System.in);
    System.out.println("Programa que convierte numeros en meses");
    System.out.println("Teclea un nùmero del 1 al 12");
    int num = scan.nextInt();
   
   //Enero
    if(num==1)
        System.out.println(" ENERO ");   
    
    //Febrero
    if(num==2)
        System.out.println(" FEBRERO ");  
    //Marzo
    if(num==3)
        System.out.println(" MARZO ");  
    //Abril
    if(num==4)
        System.out.println(" ABRIL ");  
    //Mayo
    if(num==5)
        System.out.println(" MAYO ");  
    //Junio
    if(num==6)
        System.out.println(" JUNIO ");  
    //Julio
    if(num==7)
        System.out.println(" JULIO ");  
    //Agosto
    if(num==8)
        System.out.println(" AGOSTO ");  
    //Septiembre
    if(num==9)
        System.out.println(" SEPTIEMBRE ");  
    //Octubre
    if(num==10)
        System.out.println(" OCTUBRE ");  
    //Noviemre
    if(num==11)
        System.out.println(" NOVIEMBRE ");  
    //Diciembre
    if(num==12)
        System.out.println(" DICIEMBRE ");  
    }
}
