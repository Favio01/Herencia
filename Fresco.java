import java.util.*;
public class Fresco extends Producto {
    private String PaisOrigen;

    public Fresco(String PaisOrigen, int aniofechaEnvasado, int mesfechaEnvasado, int diafechaEnvasado, int numeroLote, int aniofechaCaducidad, int mesfechaCaducidad, int diafechaCaducidad) {
        super(aniofechaEnvasado, mesfechaEnvasado, diafechaEnvasado, numeroLote, aniofechaCaducidad, mesfechaCaducidad, diafechaCaducidad);
        this.PaisOrigen = PaisOrigen;
    }    

    public Date getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(Date fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return PaisOrigen;
    }

    public void setPaisOrigen(String PaisOrigen) {
        this.PaisOrigen = PaisOrigen;
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
        return "Fecha envasado: " + fechaEnvasado + " / Pais origen: " + PaisOrigen + "/ Numero de lote: " + numeroLote + " /Fecha de caducidad: " + fechaCaducidad;
    }
    
    
}
