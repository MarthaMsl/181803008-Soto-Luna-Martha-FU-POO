

public class Tablero {
    public static void main(String[] args) {
        
        
        //CREACIÓN DE OBJETO aviso1
        Aviso aviso1 = new Aviso();
        
        aviso1.id=1;
        
        aviso1.tipoAviso="General\n";
        aviso1.titulo="Insumos y bienes muebles de laboratorio disponibles\n";
        aviso1.texto="La Coordinación de Control Técnico de Insumos (COCTI) de la Dirección de Prestaciones Médicas, pone a disposición del personal que realiza investigación el inventario adjunto.\n";
        aviso1.resumen="Insumos y bienes muebles de laboratorio disponibles por la Coordinación de Control Técnico de Insumos (COCTI)\n";
        aviso1.nombre="Eduardo Flores Díaz\n";
        aviso1.estatusF="Vigente\n";
            aviso1.diaP=02;
            aviso1.mesP=02;
            aviso1.yearP=2020;        
        aviso1.diaA=02;
        aviso1.mesA=02;
        aviso1.yearA=2020;       
            aviso1.diaB=02;
            aviso1.mesB=02;
            aviso1.yearB=2021;
        
        System.out.println(aviso1);
        
        //CREACIÓN DE OBJETO aviso2
        Aviso aviso2 = new Aviso();
        
        aviso2.id=2;
        
        aviso2.tipoAviso="\nConferencia\n";
        aviso2.titulo="CONFERENCIA DR. COSSARIZZA\n";
        aviso2.texto="El Dr. Andrea Cossarizza, ofreció a la comunidad IMSS su conferencia “Clinical Applications of Advanced Cytometry”\ny aprovechó"
                    +"la presencia de investigadores y estudiantes del IMSS para compartir sus últimos resultados de\ninvestigación, aún no publicados, "
                    +"sobre VIH y el uso de citometría de flujo.\n" +"\n" +"Además, invitó a nuestra comunidad a agregarse a la sociedad internacional "
                    +"sobre citometría:\nISAC(International Society for\nthe Advancement of Cytometry) y aprovechar los recursos que tienen como:\n" 
                    +"\n" +"Programa de Liderazgo MARYLOU INGRAM SCHOLARS PROGRAM, de 5 años para formación de citomteristas\nIniciativa de innovación "
                    +"CYTO-Innovation apoya a las propuestas innovadoras que contemplan la conversión de ideas en\nproductos comerciales de alto impacto "
                    +"para ayudar a nuevos empresarios a aprovechar la tecnología de citometría\n" +"\n"+ "Además en la ISAC tienen disponibles una serie de"
                    +" manuales e información de punta sobre la citometría para uso libre.\n"
                    +"El Dr. Cossarizza reiteró la invitación al personal IMSS a vincularse con la Universidad de Módena y su laboratorio aprovechando\n"
                    +"el prestigio que tiene el Laboratorio de Citometría de Flujo del Centro de Instrumentos del Centro Médico Nacional Siglo XXI.\n";
        
        aviso2.resumen="Conferencia de Dr. Andrea Cossarizza del tema “Clinical Applications of Advanced Cytometry\n";
        aviso2.nombre="Kevin Meza Gonzalez\n";
        aviso2.estatusF="No Vigente\n";
            aviso2.diaP=02;
            aviso2.mesP=03;
            aviso2.yearP=2020;
        aviso2.diaA=15;
        aviso2.mesA=02;
        aviso2.yearA=2020;
            aviso2.diaB=31;
            aviso2.mesB=03;
            aviso2.yearB=2020;
       
        System.out.println(aviso2);
        
    }
    
}