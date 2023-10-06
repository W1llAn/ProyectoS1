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


}
