public class Postulante{

    private String nombre;
    private String telefono;
    private String mail;
    private String direccion;
    private String comuna;
    private String portafolio; 

    private NotificacionPostulante nP;

    public Postulante(String nombre, String telefono, String mail, String direccion, String comuna, String portafolio){
        this.nombre = nombre;
        this.telefono = telefono;
        this.mail = mail;
        this.direccion = direccion;
        this.comuna = comuna;
        this.portafolio = portafolio;

    }

    public void notificar(String comentario){

        nP = new NotificacionPostulante(comentario);
    }
}

public class NotificacionPostulante{

    private String comentario;

    public NotificacionPostulante(String comentario){

        this.comentario = comentario;
    }

}


public class Profesional extends Postulante{

    private int nivel;
    private boolean exclusivaPendiente;
    
    private Vector<LiquidacionPago> liquidacionesPago;

    public Profesional(Postulante p ,int nivel){

        this.nivel = nivel;
        super();    // VER SI ES ACA EL SUPER() O EN POSTULANTE
        exclusivaPendiente = false;
        liquidacionesPago = new Vector<LiquidacionPago>();
    }

    public obtenerLiquidacionesPago(LiquidacionPago liquidacionPago){

        liquidacionesPago.add(liquidacionPago);
    
    }

    public void asignarExclusiva(){
        exclusivaPendiente = true;
    }    
}

public class Editorial{

    private String codigo;
    private String nombre;
    private String telefono;
    private String mail;
    private String direccion;
    private String comuna;

    private Suscripcion sus;

    public Editorial(){

    }

    public void obtenerFactura(){

        sus.obtenerFyS();

    }
}


public class Venta{

    private Date fecha;
    private String codigo;
    private int precio;
    private boolean facturado;

    private Vector<Reportaje> reportajes;
    private Vector<ReportajeExclusivo> exclusivos;

    public Venta(Vector<Reportaje> reportajes){


    }

    public Venta(Vector<ReportajeExclusivo> exclusivos){


    }

    public Venta(Vector<Reportaje> reportaje, Vector<ReportajeExclusivo> exclusivos){


    }


    public obtenerInformacion(){


    }

}

public class Reportaje{

    private String codigoReportaje;
    private String titulo;
    private int numeroFotos;
    private Date fecha;

    public Reportaje(){

    }
}

public class ReportajeExclusivo{

    private String codigo;
    private String titulo;
    private int precio;
    private Date fechaSolicitud;
    private Date fechaAsignacion;
    private Date fechaEntrega;
    private Vector<Profesional> postulaciones;

    public ReportajeExclusivo(){
        postulaciones = new Vector<Profesional>();

    }

    public void asignarProf(Profesional p){
        
    }
    
}

public class Suscripcion{

    private Date fechaSuscripcion;
    private String codigo;
    private int precioSuscripcion;
    private int ventaMes;
    
    private Vector<Venta> ventas;
    private Vector<Venta> nuevasVentas;
    private Vector<Factura> facturas;
    private Catalogo catalogo;

    public Suscripcion(){

        facturas = new Vector<Factura>();
        ventas = new Vector<Venta>();

    }

    public void obtenerFyS(){

        Factura nuevaFactura = new Factura();

        facturas.add(nuevaFactura);
    }

    public comprar(){

        catalogo.verCatalogo();
    }

}

public class Catalogo{

    private int cantidadReportajes;
    private Date fechaActualizacion;

    private Vector<Reportaje> reportajes;

    public Catalogo(){

    }

    public Vector<Reportajes> verCatalogo(){

        return reportajes;

    }
}

public class Factura{

    private int numero;
    private Date fecha;
    private int monto;
    private Date mesFacturacion;

    public Factura(){


    }
}

public class LiquidacionPago{

    private int numero;
    private Date fecha;
    private int monto;
    private Date mesLiquidacion;

    private Profesional profesional;

    public LiquidacionPago(){


    }
}

public class PostulacionExclusiva{

    private Date fechaPostulacion;
    private String estado;
    private Profesional profesional;

    public PostulacionExclusiva(){


    }

    public void asignarPostulante(){
        profesional.asignarExclusiva();
    }
}






