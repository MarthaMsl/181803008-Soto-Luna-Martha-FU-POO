public class Aviso {

    int id;                                                     //D
    String tipoAviso, titulo, texto, resumen, nombre, estatusF; //A
    int diaP, mesP, yearP;                                      //T
    int diaA, mesA, yearA;                                      //O
    int diaB, mesB, yearB;                                      //S

    
    
    public void vigencia(){                                         //M
                                                                    //E
    }                                                               //T
                                                                    //O
    @Override                                                       //D
    public String toString() {                                      //O
        return "\nAviso: " + id + "\nTipo de Aviso: " + tipoAviso   //S
             + "\nTitulo: " + titulo+"\nTexto: " + texto
             + "\nResumen: " + resumen+ "\nNombre: " + nombre
             + "\nEstatus: "+ estatusF
             +"\nFecha de Publicación: "+diaP  + "/" + mesP + "/" + yearP
             + "\nFecha de Alta; " + diaA + "/" + mesA + "/" + yearA
             + "\nFecha de Baja: " + diaB + "/" + mesB + "/" + yearB;
        
        
    }

}