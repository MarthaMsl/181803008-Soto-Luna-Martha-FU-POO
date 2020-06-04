import java.util.*;

public class MainTarjeta {
    
    @SuppressWarnings("empty-statement")
    public static void main(String args[]){
        
        //INSTANCIANDO TARJETA
        //- declarando al programa que usare un objeto de tipo tarjeta
        Tarjeta tarjeta;
        
        
        Scanner scan= new Scanner(System.in);
        int opcion;
        
        Tarjeta Eduardo =new Tarjeta();
        Eduardo.noCuenta = 123123;
        
       
        
        
        System. out.print("Numero de cuenta: ");
        int noCuenta=scan.nextInt();
        
        System.out.print("NIP: ");
        int NIP = scan.nextInt();
        
        
        
        //instanciando y al mismo tiempo se llama a verificar cuenta.
        tarjeta= new Tarjeta().verificarCuenta(noCuenta, NIP);
        
        //CREACIÒN DEL MENÙ
        do{
        System. out.print("\t MENÙ DE OPERACIONES \n");
        System. out.print(" 1.- Hacer un depòsito \n");
        System. out.print(" 2.- Hacer un retiro \n");
        System. out.print(" 3.- Eliminar apartado \n");
        System. out.print(" 4.- Mostar los datos de la cuenta\n");
        System. out.print(" 5.- Salir \n");
        System. out.print("\t Opciòn > ");
        opcion = scan.nextInt();
        
        switch (opcion) {

                case 1:
                    //double deposito;
                    System.out.print("Teclea la cantidad a depositar: ");
                    tarjeta.depositar(scan.nextDouble());
                    break;
                case 2:
                    double retiro;
                    System.out.print("Teclea  la cantidad a retirar: ");
                    retiro = scan.nextDouble();
                    tarjeta.retirar(retiro);
                    break;
                case 3:
                    System.out.println("Eliminar el apartado.");
                    tarjeta.eliminarApartado();
                    break;
                case 4:
                    System.out.println(tarjeta.toString());

                    break;
                case 5:
                    break;

            }

        } while(opcion !=5);
    }
       
}