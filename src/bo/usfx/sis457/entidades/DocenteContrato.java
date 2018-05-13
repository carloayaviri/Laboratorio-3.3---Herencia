
package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.Calendar;

/**
 *
 * @author GONZALOCARLO
 */
public class DocenteContrato extends Docente {
    protected String NumeroContrato;

    public DocenteContrato(String NumeroContrato, String titulo, int añosExperiencia, String asignaturas, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(titulo, añosExperiencia, asignaturas, carnetIdentidad, nombre, fechaNacimiento);
        this.NumeroContrato = NumeroContrato;
    }

    public DocenteContrato(String NumeroContrato, String titulo, int añosExperiencia, String asignaturas) {
        super(titulo, añosExperiencia, asignaturas);
        this.NumeroContrato = NumeroContrato;
    }

    public DocenteContrato(String NumeroContrato) {
        this.NumeroContrato = NumeroContrato;
    }

    public String getNumeroContrato() {
        return NumeroContrato;
    }

    public void setNumeroContrato(String NumeroContrato) {
        this.NumeroContrato = NumeroContrato;
    }
    
    @Override
    public String toString() {
        return "Docente{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Titulo=" + Titulo 
                + ", Años de experiencia="+AñosExperiencia
                + ", Asignaturas="+ Asignaturas 
                + ", Numero Contrato="+ NumeroContrato +'}';
    }
}
