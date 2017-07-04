import java.util.*;
public class Producto {
    protected int numeroLote;
    protected Date fechaCaducidad;
    protected Date fechaEnvasado;

    public Producto(int aniofechaEnvasado, int mesfechaEnvasado, int diafechaEnvasado, int numeroLote, int aniofechaCaducidad, int mesfechaCaducidad, int diafechaCaducidad) {
        GregorianCalendar fechaDeCaducidad = new GregorianCalendar(aniofechaCaducidad, mesfechaCaducidad, diafechaCaducidad);
        GregorianCalendar fechaDeEnvasado = new GregorianCalendar(aniofechaEnvasado, mesfechaEnvasado, diafechaEnvasado);
        this.numeroLote = numeroLote;
        this.fechaCaducidad = fechaDeCaducidad.getTime();
        this.fechaEnvasado = fechaDeEnvasado.getTime();
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    
    public String mostrarDatos(){
    return "Fecha caducidad: " + fechaCaducidad + " / Numero de lote: " + numeroLote;
    
}
}