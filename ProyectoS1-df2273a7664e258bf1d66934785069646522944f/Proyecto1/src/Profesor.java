/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Profesor extends Trabajador {

    private int añosExper;
    private Curso[] cursos= new Curso[5];

    public Profesor() {
        super();
    }
    public int cursosAsignados(){
          int cursosAsignados=0;
        for (int i = 0; i < this.cursos.length; i++) {
            if (this.cursos[i]!=null) {
                cursosAsignados++;
            }
        }
        return this.cursos.length-cursosAsignados;
    }//MOVI EL CURSOSASIGNADOS AFUERA DEL BUCLE POR QUE ESTABA DENTRO Y ESTABAS LLAMANDO AL METODO Y NO A LA VARIABLE EN EL RETURN 
    public Curso[] getCursos(){
        return cursos;
    }
    public void setCursos(Curso curso){
        for (int i = 0; i < cursos.length; i++) {
            if (cursos[i]==null) {
                cursos[i]= curso;
                break;
            }
        }
    }

    public Profesor(int añosExper) {
        this.añosExper = añosExper;
    }

    public Profesor(int edad, int añosExper, float salario, String cedula, String nombre1, String nombre2, String Apellido1,
            String Apellido2, String FechaNacmto) {
        super(edad,salario, cedula, nombre1, nombre2, Apellido1, Apellido2, FechaNacmto);
        this.añosExper = añosExper;
    }
    
    public int getAñosExper() {
        return this.añosExper;
    }

    public void setAñosExper(int añosExper) {
        this.añosExper = añosExper;
    }

     public String toString() {
        int edad = new Controles().Edad(getFechaNacmto());
        return "Cédula: " + getCedula().toUpperCase() + "\n" +
                "Nombre: " + getNombre1().toUpperCase() + " " +
                getNombre2().toUpperCase() + " " +
                getApellido1().toUpperCase() + " " + getApellido2().toUpperCase() + "\n" +
                "Salario: "+getSalario() +"\n"+
                "Años Experiencia: "+getAñosExper()+ "\n" +
                "Edad: " + edad + "\n";
    }
}
