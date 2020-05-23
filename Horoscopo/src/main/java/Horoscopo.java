import java.util.Scanner;
public class Horoscopo {
    public static void main(String args []){
    Scanner scan = new Scanner(System.in);
    System.out.println("Teclea tu fecha de nacimiento: ");
    System.out.println("Sòlo nùmeros");
    System.out.println("Dia  ");
    int dia = scan.nextInt();
    System.out.println("Mes  ");
    int mes = scan.nextInt();
   //Enero
    if(mes==1){
        if(dia<21){
            System.out.println("capricornio");
            }else{
                System.out.println("acuario");
        }
    }
    //Febrero
    if(mes==2){
        if(dia<20){
            System.out.println("acuario");
            }else{
                System.out.println("picis");
        }      
    }
    //Marzo
    if(mes==3){
        if(dia<21){
            System.out.println("picis");
            }else{
                System.out.println("aries");
        }
    }
    //Abril
    if(mes==4){
        if(dia<21){
            System.out.println("aries");
            }else{
                System.out.println("tauro");
        }
    }
    //Mayo
    if(mes==5){
        if(dia<20){
            System.out.println("tauro");
            }else{
                System.out.println("gèminis");
        }
    }
    //Junio
    if(mes==6){
        if(dia<22){
            System.out.println("gèminis");
            }else{
                System.out.println("càncer");
        }
    }
    //Julio
    if(mes==7){
        if(dia<22){
            System.out.println("càncer");
            }else{
                System.out.println("leo");
        }
    }
    //Agosto
    if(mes==8){
        if(dia<24){
            System.out.println("leo");
            }else{
                System.out.println("virgo");
        }
    }
    //Septiembre
    if(mes==9){
        if(dia<23){
            System.out.println("virgo");
            }else{
                System.out.println("libra");
        }
    }
    //Octubre
    if(mes==10){
        if(dia<23){
            System.out.println("libra");
            }else{
                System.out.println("escorpio");
        }
    }
    //Noviemre
    if(mes==11){
        if(dia<23){
            System.out.println("escorpio");
            }else{
                System.out.println("sagitario");
        }
    }
    //Diciembre
    if(mes==12){
        if(dia<21){
            System.out.println("sagitario");
            }else{
                System.out.println("capricornio");
        }
    }
    }
}
