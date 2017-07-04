
import java.util.*;

public class Refrigerado extends Producto{
    private String PaisOrigen;
    private int codigoOrganismoSupervicionAlimentaria;
    private int temperaturaMantenimientoRecomendada;

    public Refrigerado(String PaisOrigen, int codigoOrganismoSupervicionAlimentaria, int temperaturaMantenimientoRecomendada, int aniofechaEnvasado, int mesfechaEnvasado, int diafechaEnvasado, int numeroLote, int aniofechaCaducidad, int mesfechaCaducidad, int diafechaCaducidad) {
        super(aniofechaEnvasado, mesfechaEnvasado, diafechaEnvasado, numeroLote, aniofechaCaducidad, mesfechaCaducidad, diafechaCaducidad);
        this.PaisOrigen = PaisOrigen;
        this.codigoOrganismoSupervicionAlimentaria = codigoOrganismoSupervicionAlimentaria;
        this.temperaturaMantenimientoRecomendada = temperaturaMantenimientoRecomendada;
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

    public int getCodigoOrganismoSupervicionAlimentaria() {
        return codigoOrganismoSupervicionAlimentaria;
    }

    public void setCodigoOrganismoSupervicionAlimentaria(int codigoOrganismoSupervicionAlimentaria) {
        this.codigoOrganismoSupervicionAlimentaria = codigoOrganismoSupervicionAlimentaria;
    }

    public double getTemperaturaMantenimientoRecomendada() {
        return temperaturaMantenimientoRecomendada;
    }

    public void setTemperaturaMantenimientoRecomendada(int temperaturaMantenimientoRecomendada) {
        this.temperaturaMantenimientoRecomendada = temperaturaMantenimientoRecomendada;
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
        return "Fecha envasado: " + fechaEnvasado + " / Pais origen: " + PaisOrigen + "/  CodigoOrganismoSupervicion Alimentaria: "+codigoOrganismoSupervicionAlimentaria + "/ Temperatura Mantenimiento Recomendada: " + temperaturaMantenimientoRecomendada + "/ Numero de lote: " + numeroLote + " /Fecha de caducidad: " + fechaCaducidad;
    }
    
}