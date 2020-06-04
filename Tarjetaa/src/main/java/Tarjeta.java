public class Tarjeta {
    
    int noCuenta;
    int NIP;
    String nombre;
    int dia;
    int mes;
    int anio;
    int cv;
    double monto;
    double apartado;
    
    
    
    
    //Mpetodo constructor vacio
     public Tarjeta() {
       
    }
     
     
    //Método constructor Tarjeta
    public Tarjeta(int noCuenta, String nombre, int dia, int mes, int anio, int cv,double monto, double apartado){
        this.noCuenta=noCuenta;
        this.nombre=nombre;
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
        this.cv=cv;
        this.monto=monto;
        this.apartado=apartado;
        
    }
    
    
    
// 1 public no le haremos caso
// 2 que tipo voy a regresar(En este caso voy a regresar un objeto
    //de tipo tarjeta 
// 3 es el nombre
// 4 los valores que recibe el mètodo
    //Método Verificar cuenta
    public Tarjeta verificarCuenta(int noCuenta,int NIP){
        
        if(noCuenta == 123123 & NIP == 1133){
           
            return  new Tarjeta(456789,"Eduardo Dìaz Flores",31,12,2032,543,45987.22,550);
            
        }
        else if(noCuenta == 456789 & NIP == 3367){
            
            return new Tarjeta(456789,"Kevin Meza Gonzàlez",31,12,2032,544,360,5322.23 );
            
        }
        else {
            System.out.println("El usuario no existe");
        }return new Tarjeta();
    }
    
    
    //Método total
    public double total(){
        return this.monto + this.apartado;
       }
    
    
    //Método depositar
     public void depositar(double depositar) {

        this.monto += depositar;

    }

    //Método retirar
    public void retirar(double retirar) {

        this.monto -= retirar;

    }

    //Método eliminar el apartado
    public void eliminarApartado() {

        this.monto += this.apartado;
        this.apartado -= this.apartado;

    }
    

    
    //Método toString
    @Override
    public String toString() {
        return "" + "\n noCuenta: " + noCuenta 
                  + "\n nombre: " + nombre 
                  + "\n Fecha de vencimiento: " + dia +"/"+ mes +"/"+ anio 
                  + "\n cv: " + cv 
                  + "\n monto: " + monto 
                  + "\n apartado: " + apartado;
    }
    
    }