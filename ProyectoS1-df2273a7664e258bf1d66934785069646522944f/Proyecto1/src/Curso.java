/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
class Curso implements Comparable<Curso>{
    private String nombre;
    private int CantHors,id;
    private Estudiante[] estudiantes= new Estudiante[40];
    private Profesor profesores;
    public String getNombre(){
        return this.nombre;
    }
    public int cupo(int id){
        int cuposLlenos=0;
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i]!=null) {
                cuposLlenos++;
            }
        }
        return estudiantes.length-cuposLlenos;
    }
    public int getCantHours(){
        return this.CantHors;
    }
    public int getId(){
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

   @Override
    public int compareTo(Curso c){
        if(c == null){
            return 1;
        }
        return this.nombre.compareTo(c.nombre);
    }
    public String toString(){
        return "Nombre: "+this.getNombre()+ " Cantidad Estudiantes: ";
    }
}
