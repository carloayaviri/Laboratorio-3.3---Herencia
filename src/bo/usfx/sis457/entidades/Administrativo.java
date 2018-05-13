/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Marcelo
 */
public class Administrativo extends Persona{
    protected String Cargo; 
    protected String LugarTrabajo;
    protected Calendar FechaIngreso;

    public Administrativo(String cargo, String lugarTrabajo, Calendar fechaIngreso, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(carnetIdentidad, nombre, fechaNacimiento);
        this.Cargo = cargo;
        this.LugarTrabajo = lugarTrabajo;
        this.FechaIngreso = fechaIngreso;
    }

    public Administrativo(String cargo, String lugarTrabajo, Calendar fechaIngreso) {
        this.Cargo = cargo;
        this.LugarTrabajo = lugarTrabajo;
        this.FechaIngreso = fechaIngreso;
    }
    
    public Administrativo() {
        this("0", "Sin Nombre", new GregorianCalendar(2000, 1,1));
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getLugarTrabajo() {
        return LugarTrabajo;
    }

    public void setLugarTrabajo(String LugarTrabajo) {
        this.LugarTrabajo = LugarTrabajo;
    }

    public Calendar getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(Calendar FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }
    
    @Override
    public String toString() {
        return "Administrativo{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Cargo=" + this.Cargo
                + ", LugarTrabajo=" + this.LugarTrabajo
                + ", FechaIngreso=" + this.FechaIngreso + '}';
    }
}
