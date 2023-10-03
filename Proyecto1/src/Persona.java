
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ASUS
 */
class Persona {

    String cedula;
    String nombre1;
    String nombre2;
    String Apellido1;
    String Apellido2;
    int FechaNacmto;

    public Persona(String cedula, String nombre1, String nombre2, String Apellido1, String Apellido2, int FechaNacmto) {
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

    public int getFechaNacmto() {
        return FechaNacmto;
    }

    public void setFechaNacmto(int FechaNacmto) {
        this.FechaNacmto = FechaNacmto;
    }
    
    

    public int Edad(int anioP, int mesP, int diaP) {
        Date fecha = new Date();
        int dia, mes, anio, anioCal;
        dia = fecha.getDate();
        mes = fecha.getMonth() + 1;
        anio = fecha.getYear() + 1900;
        anioCal = anio - anioP;
        if (mes <= mesP) {
            if (mes == mesP) {
                if (diaP > dia) {
                    anioCal++;
                }

            }

        }
        return anioCal;
    }

    public String nomApell() {
        return this.Apellido1 + " " + this.Apellido2
                + " " + this.nombre1 + " " + this.Apellido2;
    }

    @Override
    public String toString() {
        return "Cédula:" + this.cedula
                + "\nNombres y Apellidos:" + nomApell()
                + "\nEdad:" + Edad(12, 12, 12);
    }

}
