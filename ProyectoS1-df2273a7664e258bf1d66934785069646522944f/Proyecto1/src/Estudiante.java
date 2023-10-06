/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
class Estudiante extends Persona {

    private float promCalifi;
    private String direccion;
    Curso[] cursos= new Curso[5];

    public Estudiante( int edad,String direccion, Curso[] cursos, String cedula, String nombre1, String nombre2, String Apellido1, String Apellido2, String FechaNacmto) {
        super(edad,cedula, nombre1, nombre2, Apellido1, Apellido2, FechaNacmto);
        this.direccion = direccion;
        this.cursos = cursos;
    }
    public Estudiante(){
        
    }
       public void setCursos(Curso curso){
        for (int i = 0; i < cursos.length; i++) {
            if (cursos[i]==null) {
                cursos[i]= curso;
                break;
            }
        }
    }

    public float getPromCalifi() {
        return this.promCalifi;
    }

    public void setPromCalifi(float promCalifi) {
        this.promCalifi = promCalifi;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public Curso[] getCursos() {
        return this.cursos;
    }
  

}
