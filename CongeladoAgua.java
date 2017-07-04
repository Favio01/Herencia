
import java.util.*;

public class CongeladoAgua extends Congelado {
    private double salinidadDelAgua;

    public CongeladoAgua(double salinidadDelAgua, String PaisOrigen, int temperaturaMantenimientoRecomendada, int aniofechaEnvasado, int mesfechaEnvasado, int diafechaEnvasado, int numeroLote, int aniofechaCaducidad, int mesfechaCaducidad, int diafechaCaducidad) {
        super(PaisOrigen, temperaturaMantenimientoRecomendada, aniofechaEnvasado, mesfechaEnvasado, diafechaEnvasado, numeroLote, aniofechaCaducidad, mesfechaCaducidad, diafechaCaducidad);
        this.salinidadDelAgua = salinidadDelAgua;
    }


    public double getSalinidadDelAgua() {
        return salinidadDelAgua;
    }

    public void setSalinidadDelAgua(double salinidadDelAgua) {
        this.salinidadDelAgua = salinidadDelAgua;
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
    return "Salinidad del agua: " +salinidadDelAgua;
    }
}
