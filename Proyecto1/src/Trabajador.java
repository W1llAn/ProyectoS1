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

    public Trabajador(float salario, String cedula, String nombre1, String nombre2, String Apellido1, String Apellido2, int FechaNacmto) {
        super(cedula, nombre1, nombre2, Apellido1, Apellido2, FechaNacmto);
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabajador" + super.toString() + "\nSalario:" + this.salario;
    }
}
