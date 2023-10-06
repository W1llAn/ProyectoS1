
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ASUS
 */
class Persona {

    private String cedula;
    private String nombre1;
    private String nombre2;
    private String Apellido1;
    private String Apellido2;
    private String FechaNacmto;
    private int edad;

    public Persona() {
    }

    public Persona(int edad, String cedula, String nombre1, String nombre2, String Apellido1, String Apellido2, String FechaNacmto) {
        this.edad = edad;
        this.cedula = cedula;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.FechaNacmto = FechaNacmto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    public String getFechaNacmto() {
        return FechaNacmto;
    }

    public void setFechaNacmto(String FechaNacmto) {
        this.FechaNacmto = FechaNacmto;
    }
    
    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
            
            

}
