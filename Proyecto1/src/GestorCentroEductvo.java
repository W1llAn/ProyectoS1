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
    private Estudiante[] estudiantes= new Estudiante[10];
    private Profesor[] profesores= new Profesor[10];

    public Curso[] getCursos() {
        return this.cursos;
    }

    public Estudiante[] getEstudiantes() {
        return this.estudiantes;
    }

    public Profesor[] getProfesores() {
        return this.profesores;
    }

    public void creacionCursos( Curso curso){
        

    }
  public boolean matriculaEstudiantes(Estudiante estudiante){
    for(int i=0;i<this.getProfesores().length;i++){

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
    
}
