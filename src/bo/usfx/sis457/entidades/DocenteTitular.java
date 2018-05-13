package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.Calendar;

/**
 *
 * @author GONZALOCARLO
 */
public class DocenteTitular extends Docente {
    protected String ExamenCompetencia;

    public DocenteTitular(String ExamenCompetencia, String titulo, int añosExperiencia, String asignaturas, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(titulo, añosExperiencia, asignaturas, carnetIdentidad, nombre, fechaNacimiento);
        this.ExamenCompetencia = ExamenCompetencia;
    }

    public DocenteTitular(String ExamenCompetencia, String titulo, int añosExperiencia, String asignaturas) {
        super(titulo, añosExperiencia, asignaturas);
        this.ExamenCompetencia = ExamenCompetencia;
    }

    public DocenteTitular(String ExamenCompetencia) {
        this.ExamenCompetencia = ExamenCompetencia;
    }

    public String getExamenCompetencia() {
        return ExamenCompetencia;
    }

    public void setExamenCompetencia(String ExamenCompetencia) {
        this.ExamenCompetencia = ExamenCompetencia;
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
                + ", Examen de Competencia="+ ExamenCompetencia +'}';
    }
}
