/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
class Curso {
    private String nombre;
    private int CantHors,id;
    private Estudiante[] estudiantes= new Estudiante[40];
    private Profesor profesores;
    public String getNombre(){
        return this.nombre;
    }
    public int getCantHours(){
        return this.CantHors;
    }
    public int id(){
        return this.id;
    }
    public Estudiante[] getEstudiantes(){
        return this.estudiantes;
    }
    public Profesor getProfesor(){
        return this.profesores;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setCantHors(int CantHors){
        this.CantHors=CantHors;
    }
    public void setProfesores(Profesor profesores){
        this.profesores=profesores;
    }
    public boolean matriculaEstudiantes(Estudiante estudiante, int posicion){
        this.estudiantes[posicion]=estudiante;
        return true;
    }
    public Curso(int id,String nombre, int CantHors, Profesor profesores) {
        this.id= id;
        this.nombre = nombre;
        this.CantHors = CantHors;
        this.profesores = profesores;
    }

  

}
