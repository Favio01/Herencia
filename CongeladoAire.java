
import java.util.*;

public class CongeladoAire extends Congelado {

    private int nitrogeno;
    private int oxigeno;
    private int dioxidoDeCarbono;
    private int vaporDeAgua;

    public CongeladoAire(int nitrogeno, int oxigeno, int dioxidoDeCarbono, int vaporDeAgua, String PaisOrigen, int temperaturaMantenimientoRecomendada, int aniofechaEnvasado, int mesfechaEnvasado, int diafechaEnvasado, int numeroLote, int aniofechaCaducidad, int mesfechaCaducidad, int diafechaCaducidad) {
        super(PaisOrigen, temperaturaMantenimientoRecomendada, aniofechaEnvasado, mesfechaEnvasado, diafechaEnvasado, numeroLote, aniofechaCaducidad, mesfechaCaducidad, diafechaCaducidad);
        this.nitrogeno = nitrogeno;
        this.oxigeno = oxigeno;
        this.dioxidoDeCarbono = dioxidoDeCarbono;
        this.vaporDeAgua = vaporDeAgua;
    }

    public double getNitrogeno() {
        return nitrogeno;
    }

    public void setNitrogeno(int nitrogeno) {
        this.nitrogeno = nitrogeno;
    }

    public double getOxigeno() {
        return oxigeno;
    }

    public void setOxigeno(int oxigeno) {
        this.oxigeno = oxigeno;
    }

    public double getDioxidoDeCarbono() {
        return dioxidoDeCarbono;
    }

    public void setDioxidoDeCarbono(int dioxidoDeCarbono) {
        this.dioxidoDeCarbono = dioxidoDeCarbono;
    }

    public double getVaporDeAgua() {
        return vaporDeAgua;
    }

    public void setVaporDeAgua(int vaporDeAgua) {
        this.vaporDeAgua = vaporDeAgua;
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
        return "Nitrogeno: " + nitrogeno + " / Oxigeno: " + oxigeno + "/ DioxidoDeCarbono: "+ dioxidoDeCarbono  + "/ Vapor de agua: " + vaporDeAgua; 
    }
    
    
}
