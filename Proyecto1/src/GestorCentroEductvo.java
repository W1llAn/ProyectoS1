/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class GestorCentroEductvo {

    private Curso[] cursos = new Curso[10];
    private Estudiante[] estudiantes = new Estudiante[10];
    private Profesor[] profesores = new Profesor[10];

    public Curso[] getCursos() {
        return this.cursos;
    }

    public Estudiante[] getEstudiantes() {
        return this.estudiantes;
    }

    public Profesor[] getProfesores() {
        return this.profesores;
    }

    public void creacionCursos(Curso curso) {

    }

    public boolean matriculaEstudiantes(Estudiante estudiante) {
        for (int i = 0; i < this.getProfesores().length; i++) {

        }
        return true;
    }

    void ImprimirReporteInscritos() {
        System.out.println("Reporte de personas Inscritas");
        for (Curso p : cursos) {
            if (p != null) {
            }
        }
    }

    void imprimirPersonas() {
        System.out.println("Reporte de Personas");
    }

    int cantidadProfesores = 0;

    public void registrarProfesor(Profesor profesor) {
        if (cantidadProfesores < profesores.length) {
            profesores[cantidadProfesores] = profesor;
            cantidadProfesores++;
            System.out.println("Profesor registrado correctamente.");
        } else {
            System.out.println("No es posible registrar más profesores. Se alcanzó la capacidad máxima.");
        }
    }
    public void imprimirProfesores() {
        System.out.println("Lista de Profesores:");
        for (int i = 0; i < cantidadProfesores; i++) {
            Profesor profesor = profesores[i];
            System.out.println("Cédula: " + profesor.getCedula().toUpperCase());
            System.out.println("Nombre: " + profesor.getNombre1().toUpperCase() + " " + profesor.getNombre2().toUpperCase()
                    + " " + profesor.getApellido1().toUpperCase() + " " + profesor.getApellido2().toUpperCase());
            System.out.println("Fecha de Nacimiento: " + profesor.getFechaNacmto());
            System.out.println("Años de Experiencia: " + profesor.getAñosExper());
            System.out.println("Salario: " + profesor.getSalario());
            System.out.println("-----------------------------");
        }
    }
}
