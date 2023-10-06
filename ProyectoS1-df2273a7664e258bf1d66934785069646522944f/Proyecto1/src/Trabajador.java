/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Trabajador extends Persona {

    float salario;

    public Trabajador() {
        super();
    }

    public Trabajador(int edad,float salario, String cedula, String nombre1, String nombre2, String Apellido1, String Apellido2,
            String FechaNacmto) {
        super(edad,cedula, nombre1, nombre2, Apellido1, Apellido2, FechaNacmto);
        this.salario = salario;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
