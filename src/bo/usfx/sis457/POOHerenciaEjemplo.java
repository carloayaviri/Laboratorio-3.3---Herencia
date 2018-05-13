/*
 * Archivo que contiene la Clase Principal del Programa
 * - En este ejemplo se muestra el principio de Herencia
 */
package bo.usfx.sis457;

import static bo.usfx.sis457.POOHerenciaEjemplo.anadirAlumno;
import static bo.usfx.sis457.POOHerenciaEjemplo.borrarAlumno;
import static bo.usfx.sis457.POOHerenciaEjemplo.buscarPersona;
import static bo.usfx.sis457.POOHerenciaEjemplo.limpiarConsola;
import static bo.usfx.sis457.POOHerenciaEjemplo.listarAlumnos;
import static bo.usfx.sis457.POOHerenciaEjemplo.menuAdministrativos;
import static bo.usfx.sis457.POOHerenciaEjemplo.menuAlumnos;
import static bo.usfx.sis457.POOHerenciaEjemplo.menuDocenteContrato;
import static bo.usfx.sis457.POOHerenciaEjemplo.menuDocenteTitular;
import static bo.usfx.sis457.POOHerenciaEjemplo.menuDocentes;
import static bo.usfx.sis457.POOHerenciaEjemplo.menuPersonas;
import static bo.usfx.sis457.POOHerenciaEjemplo.menuPrincipal;
import static bo.usfx.sis457.POOHerenciaEjemplo.modificarAlumno;
import static bo.usfx.sis457.POOHerenciaEjemplo.volverMenu;
import bo.usfx.sis457.entidades.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Marcelo
 */
public class POOHerenciaEjemplo {
    public static ArrayList<Persona> personas;
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        personas = new ArrayList<>();
        
        personas.add(new Alumno("35-1", 3,"Base de datos 1","752344","Gonzalo Carlo Ayavirir",new GregorianCalendar(1994, 02,24)));
        personas.add(new Docente("Licenciado en Informática",1,"SIS457","752345", "Juan Perez", new GregorianCalendar(1980, 11,01)));
        personas.add(new Alumno("35-2", 1,"Programaicon Basica","751235","Ivan Gomez",new GregorianCalendar(1992,11,10)));
        personas.add(new Alumno("35-3", 2,"Programcion Intermedia","7634522","Ariel Huarachi",new GregorianCalendar(1988,01,10)));
        personas.add(new Docente("Ingeniero de Sistemas",2,"INF-230","723442","Danny Garron",new GregorianCalendar(1979,10,06)));
        personas.add(new Alumno("35-4", 3,"Progracion Avanzada","7634553","Edwin Alvarez",new GregorianCalendar(1990,07,06)));
        
        menuPrincipal();
    }
    
    public static void menuPrincipal() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Programa: Universidad                            |");
        System.out.println("| - Ejemplo de Herencia                            |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Gestión de Personas                           |");
        System.out.println("| 2) Gestión de Docentes                           |");
        System.out.println("| 3) Gestión de Alumnos                            |");
        System.out.println("| 4) Gestión de Administrativos                    |");
        System.out.println("| 0) Salir                                         |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                menuPersonas();
                break;
            case "2":
                menuDocentes();
                break;
            case "3":
                menuAlumnos();
                break;
            case "4":
                menuAdministrativos();
                break;
            default:
                System.out.println("Salió del Programa");
        }        
    }
    
    public static void menuPersonas() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Personas                              |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Personas                               |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarPersonas();
                volverMenu();
                menuPersonas();
                break;
            default:
                menuPrincipal();
        }
    }
    
    public static void menuDocentes() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Docentes                              |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Docentes Titular                              |");
        System.out.println("| 2) Docentes Contrato                             |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                menuDocenteTitular();
                volverMenu();
                menuDocentes();
                break;
            case "2":
                menuDocenteContrato();
                volverMenu();
                menuDocentes();
                break;
            default:
                menuPrincipal();
        }
    }
    
    public static void menuDocenteTitular() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Docente Titular                       |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Docente Titular                        |");
        System.out.println("| 2) Añadir Docente Titular                        |");
        System.out.println("| 3) Modificar Docente Titular                     |");
        System.out.println("| 4) Borrar Docente Titular                        |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarDocenteTitular();
                volverMenu();
                menuDocenteTitular();
                break;
            case "2":
                anadirDocenteTitular();
                volverMenu();
                menuDocenteTitular();
                break;
            case "3":
                modificarDocenteTitular();
                volverMenu();
                menuDocenteTitular();
                break;
            case "4":
                borrarDocenteTitular();
                volverMenu();
                menuDocenteTitular();
                break;
            default:
                menuPrincipal();
        }
    }
     

    public static void menuDocenteContrato() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Docente a Contrato                      |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Docente Contrato                       |");
        System.out.println("| 2) Añadir Docente Contrato                       |");
        System.out.println("| 3) Modificar Docente Contrato                    |");
        System.out.println("| 4) Borrar Docente Contrato                       |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarDocenteContrato();
                volverMenu();
                menuDocenteContrato();
                break;
            case "2":
                anadirDocenteContrato();
                volverMenu();
                menuDocenteContrato();
                break;
            case "3":
                modificarDocenteContrato();
                volverMenu();
                menuDocenteContrato();
                break;
            case "4":
                borrarDocenteContrato();
                volverMenu();
                menuDocenteContrato();
                break;
            default:
                menuPrincipal();
        }
    }
    public static void menuAlumnos() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Alumnos                               |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Alumnos                                |");
        System.out.println("| 2) Añadir Alumno                                 |");
        System.out.println("| 3) Modificar Alumno                              |");
        System.out.println("| 4) Borrar Alumno                                 |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarAlumnos();
                volverMenu();
                menuAlumnos();
                break;
            case "2":
                anadirAlumno();
                volverMenu();
                menuAlumnos();
                break;
            case "3":
                modificarAlumno();
                volverMenu();
                menuAlumnos();
                break;
            case "4":
                borrarAlumno();
                volverMenu();
                menuAlumnos();
                break;
            default:
                menuPrincipal();
        }
    }
    
    public static void menuAdministrativos() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Administrativos                       |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Administrativos                        |");
        System.out.println("| 2) Añadir Administrativos                        |");
        System.out.println("| 3) Modificar Administrativos                     |");
        System.out.println("| 4) Borrar Administrativos                        |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarAdministrativos ();
                volverMenu();
                menuAdministrativos ();
                break;
            case "2":
                anadirAdministrativos ();
                volverMenu();
                menuAdministrativos ();
                break;
            case "3":
                modificarAdministrativos ();
                volverMenu();
                menuAdministrativos ();
                break;
            case "4":
                borrarAdministrativos ();
                volverMenu();
                menuAdministrativos ();
                break;
            default:
                menuPrincipal();
        }
    }
    
    public static void volverMenu() {
        String opcion;
        Scanner entradaTeclado = new Scanner(System.in);
        while(true) {
            System.out.print("\nPresione M para continuar...");
            opcion = entradaTeclado.next();
            if (opcion.equals("M")) {
                break;
            }
        }
    }
    
    public static void listarPersonas() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Personas                              |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona persona: personas) {
            i++;
            System.out.println(i + ": " + persona);
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    public static int buscarPersona(int id) {
        boolean existe = false;
        int i = 0;
        for (Persona persona: personas) {
            if (persona.getId() == id) {
                existe = true;
                break;
            }
            i++;
        }
        return existe?i:-1;
    }
    
    public static void listarAdministrativos () {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Adminstrativos                        |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona administrativo: personas) {
            if (administrativo instanceof Administrativo) {
                i++;
                System.out.println(i + ": " + administrativo);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    public static void anadirAdministrativos (){
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;
        String cargo;
        String lugarTrabajo;
        String fechaIngreso;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Administrativo                            |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Cargo: ");
            cargo = entradaTeclado.readLine();
            System.out.print("Introduzca tugar de trabajo: ");
            lugarTrabajo = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Ingreso (ejemplo: 1980-01-01): ");
            fechaIngreso = entradaTeclado.readLine();
            Date fechaIngresoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaIngreso);
            Calendar fechaIngresoCalendario = Calendar.getInstance();
            fechaIngresoCalendario.setTime(fechaIngresoDate);
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            personas.add(new Administrativo(cargo,lugarTrabajo,fechaIngresoCalendario, carnetIdentidad, nombre, fechaNacimientoCalendario));
            System.out.println("Registro de Docentes completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void modificarAdministrativos () {
        int id;
        Administrativo administrativo;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Administrativos                        |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Docente a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                administrativo = (Administrativo)personas.get(id);
                System.out.print("Modificar el Cargo '" + administrativo.getCargo()+ "': ");
                administrativo.setCargo(entradaTeclado.readLine());
                System.out.print("Modificar Lugar de Trabajo '" + administrativo.getLugarTrabajo()+ "': ");
                administrativo.setLugarTrabajo(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Ingreso '" + Utilitarios.getFechaCalendario(administrativo.getFechaIngreso()) + "': ");
                Date fechaIngresoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaIngresoCalendario = Calendar.getInstance();
                fechaIngresoCalendario.setTime(fechaIngresoDate);
                administrativo.setFechaIngreso(fechaIngresoCalendario);
                System.out.print("Modificar el Carnet de Identidad '" + administrativo.getCarnetIdentidad()+ "': ");
                administrativo.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" + administrativo.getNombre() + "': ");
                administrativo.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(administrativo.getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                administrativo.setFechaNacimiento(fechaNacimientoCalendario);
                personas.set(id, administrativo);
                System.out.println("Registro de Administrativo modificado!");
            } else {
                System.out.println("El Registro de Administrativo no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void borrarAdministrativos (){
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Borrar Administrativo                                 |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Administrativo a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Administrativo borrado!");
            } else {
                System.out.println("El Registro de Administravo no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    
    public static void listarDocenteTitular() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Docentes Titulares                    |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona docenteTitular: personas) {
            if (docenteTitular instanceof DocenteTitular) {
                i++;
                System.out.println(i + ": " + docenteTitular);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    public static void anadirDocenteTitular() {
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;
        String titulo;
        int añosExperiencia;
        String asignatura;
        String examenCompetencia;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Docente Titular                           |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Título: ");
            titulo = entradaTeclado.readLine();
            System.out.print("Introduzca años de experiencia: ");
            añosExperiencia = Integer.parseInt(entradaTeclado.readLine());
            System.out.print("Introduzca asignatura: ");
            asignatura = entradaTeclado.readLine();
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            System.out.print("Introduzca el Examen Competencia: ");
            examenCompetencia = entradaTeclado.readLine();
            personas.add(new DocenteTitular(examenCompetencia,titulo,añosExperiencia,asignatura, carnetIdentidad, nombre, fechaNacimientoCalendario));
            System.out.println("Registro de Docentes Titulares completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void modificarDocenteTitular() {
        int id;
        DocenteTitular docenteTitular;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Docente Titular                        |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Docente Titular a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                docenteTitular = (DocenteTitular)personas.get(id);
                System.out.print("Modificar el Titulo '" + docenteTitular.getTitulo()+ "': ");
                docenteTitular.setTitulo(entradaTeclado.readLine());
                System.out.print("Modificar años de esperiecia '" + docenteTitular.getAñosExperiencia()+ "': ");
                docenteTitular.setAñosExperiencia(Integer.parseInt(entradaTeclado.readLine()));
                System.out.print("Modificar asignatura '" + docenteTitular.getAsignaturas()+ "': ");
                docenteTitular.setAsignaturas(entradaTeclado.readLine());
                System.out.print("Modificar el Carnet de Identidad '" + docenteTitular.getCarnetIdentidad()+ "': ");
                docenteTitular.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" + docenteTitular.getNombre() + "': ");
                docenteTitular.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(docenteTitular.getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                docenteTitular.setFechaNacimiento(fechaNacimientoCalendario);
                System.out.print("Modificar Examen de Competencia '" + docenteTitular.getExamenCompetencia()+ "': ");
                docenteTitular.setExamenCompetencia(entradaTeclado.readLine());
                personas.set(id, docenteTitular);
                System.out.println("Registro de Docente Titular modificado!");
            } else {
                System.out.println("El Registro de Docente Titular no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void borrarDocenteTitular() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Borrar Docente Titular                           |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Docente Titular a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Docente Titular borrado!");
            } else {
                System.out.println("El Registro de Docente Titular no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
   
    
    
 public static void listarDocenteContrato() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Docentes a Contrato                   |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona docenteContrato: personas) {
            if (docenteContrato instanceof DocenteContrato) {
                i++;
                System.out.println(i + ": " + docenteContrato);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    public static void anadirDocenteContrato() {
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;
        String titulo;
        int añosExperiencia;
        String asignatura;
        String numeroContrato;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Docente a Contrato                          |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Título: ");
            titulo = entradaTeclado.readLine();
            System.out.print("Introduzca años de experiencia: ");
            añosExperiencia = Integer.parseInt(entradaTeclado.readLine());
            System.out.print("Introduzca asignatura: ");
            asignatura = entradaTeclado.readLine();
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            System.out.print("Introduzca el Numero de Contrato: ");
            numeroContrato = entradaTeclado.readLine();
            personas.add(new DocenteContrato(numeroContrato,titulo,añosExperiencia,asignatura, carnetIdentidad, nombre, fechaNacimientoCalendario));
            System.out.println("Registro de Docentes a Contrato completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void modificarDocenteContrato() {
        int id;
        DocenteContrato docenteContrato;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Docente a Contrato                     |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Docente Titular a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                docenteContrato = (DocenteContrato)personas.get(id);
                System.out.print("Modificar el Titulo '" + docenteContrato.getTitulo()+ "': ");
                docenteContrato.setTitulo(entradaTeclado.readLine());
                System.out.print("Modificar años de esperiecia '" + docenteContrato.getAñosExperiencia()+ "': ");
                docenteContrato.setAñosExperiencia(Integer.parseInt(entradaTeclado.readLine()));
                System.out.print("Modificar asignatura '" + docenteContrato.getAsignaturas()+ "': ");
                docenteContrato.setAsignaturas(entradaTeclado.readLine());
                System.out.print("Modificar el Carnet de Identidad '" + docenteContrato.getCarnetIdentidad()+ "': ");
                docenteContrato.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" + docenteContrato.getNombre() + "': ");
                docenteContrato.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(docenteContrato.getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                docenteContrato.setFechaNacimiento(fechaNacimientoCalendario);
                System.out.print("Modificar Numero de Contrato '" + docenteContrato.getNumeroContrato()+ "': ");
                docenteContrato.setNumeroContrato(entradaTeclado.readLine());
                personas.set(id, docenteContrato);
                System.out.println("Registro de Docente a Contrato modificado!");
            } else {
                System.out.println("El Registro de Docente a Contrato no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void borrarDocenteContrato() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Borrar Docente a Contraro                         |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Docente a Contrato a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Docente a Contrato borrado!");
            } else {
                System.out.println("El Registro de Docente a Contrato no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    
    
    public static void listarAlumnos() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Alumnos                               |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona alumno: personas) {
            if (alumno instanceof Alumno) {
                i++;
                System.out.println(i + ": " + alumno);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    public static void anadirAlumno() {
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;
        String carnetUniversitario;
        int semestre;
        String asignaturas;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Alumno                                    |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            System.out.print("Introduzca el CU: ");
            carnetUniversitario = entradaTeclado.readLine();
            System.out.print("Introduzca el Semestre: ");
            semestre = Integer.parseInt(entradaTeclado.readLine());
            System.out.print("Introduzca Asignatura: ");
            asignaturas =entradaTeclado.readLine();
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            personas.add(new Alumno(carnetUniversitario, semestre, carnetIdentidad, nombre,asignaturas, fechaNacimientoCalendario));
            System.out.println("Registro de Profesor completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void modificarAlumno() {
        int id;
        Alumno alumno;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Alumno                                 |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Alumno a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                alumno = (Alumno)personas.get(id);
                System.out.print("Modificar el Carnet de Identidad '" + alumno.getCarnetIdentidad()+ "': ");
                alumno.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" + alumno.getNombre() + "': ");
                alumno.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(alumno.getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                alumno.setFechaNacimiento(fechaNacimientoCalendario);
                System.out.print("Modificar el CU '" + alumno.getCarnetUniversitario() + "': ");
                alumno.setCarnetUniversitario(entradaTeclado.readLine());
                System.out.print("Introduzca el Semestre: ");
                alumno.setSemestre(Integer.parseInt(entradaTeclado.readLine()));
                System.out.print("Modificar asisgtura '" + alumno.getAsignaturas() + "': ");
                alumno.setAsignaturas(entradaTeclado.readLine());
                personas.set(id, alumno);
                System.out.println("Registro de Alumno modificado!");
            } else {
                System.out.println("El Registro de Alumno no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void borrarAlumno() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Borrar Alumno                                    |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Alumno a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Alumno borrado!");
            } else {
                System.out.println("El Registro de Alumno no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    /**
     * Método que limpia pantalla de la consola. Funciona fuera de NetBeans.
     */
    
    public static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}


