
import java.util.*;

public class CongeladoNitrogeno extends Congelado{
    private String metodoDeCongelacion;
    private int tiempoExposicionNitrogeno;

    public CongeladoNitrogeno(String metodoDeCongelacion, int tiempoExposicionNitrogeno, String PaisOrigen, int temperaturaMantenimientoRecomendada, int aniofechaEnvasado, int mesfechaEnvasado, int diafechaEnvasado, int numeroLote, int aniofechaCaducidad, int mesfechaCaducidad, int diafechaCaducidad) {
        super(PaisOrigen, temperaturaMantenimientoRecomendada, aniofechaEnvasado, mesfechaEnvasado, diafechaEnvasado, numeroLote, aniofechaCaducidad, mesfechaCaducidad, diafechaCaducidad);
        this.metodoDeCongelacion = metodoDeCongelacion;
        this.tiempoExposicionNitrogeno = tiempoExposicionNitrogeno;
    }

    public String getMetodoDeCongelacion() {
        return metodoDeCongelacion;
    }

    public void setMetodoDeCongelacion(String metodoDeCongelacion) {
        this.metodoDeCongelacion = metodoDeCongelacion;
    }

    public int getTiempoExposicionNitrogeno() {
        return tiempoExposicionNitrogeno;
    }

    public void setTiempoExposicionNitrogeno(int tiempoExposicionNitrogeno) {
        this.tiempoExposicionNitrogeno = tiempoExposicionNitrogeno;
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
         return "metodo de congelacion: " + metodoDeCongelacion + "/ Tiempo exposicion Nitrogeno: " + tiempoExposicionNitrogeno;
     }
    
}
