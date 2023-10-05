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
    private Estudiante[] estudiantes = new Estudiante[10];
    private Profesor[] profesores = new Profesor[10];

    public Curso[] getCursos() {
        return this.cursos;
    }

    public Estudiante[] getEstudiantes() {
        return this.estudiantes;
    }

    public Profesor[] getProfesores() {
        return this.profesores;
    }

    public void creacionCursos(Curso curso) {

    }

    public boolean matriculaEstudiantes(Estudiante estudiante) {
        for (int i = 0; i < this.getProfesores().length; i++) {

        }
        return true;
    }
    public boolean cedulaRepetida(String cedula){
        boolean repet=true;
            for (int i = 0; i < this.getProfesores().length; i++) {
                if (this.getProfesores()[0]!=null) {
                if (this.getProfesores()[i].getCedula().equals(cedula)) {
                    repet = true;
                    break;
                }
                else{
                    repet = false;
                }
            }
            else{
                repet = false;
            }
        }
        return repet; 
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

    int cantidadProfesores = 0;
    int cantidadEstudiantes = 0;

    public void registrarEstudiantes(Estudiante estudiante) {
        if (cantidadEstudiantes < this.estudiantes.length) {
            this.estudiantes[cantidadEstudiantes] = estudiante;
            cantidadEstudiantes++;
            System.out.println("Estudiante registrado correctamente! ");
        } else {
            System.out.println("No es posible registrar mas estudiantes. Se alcanzo la capacidad máxima. ");
        }
    }

    public boolean VerificarCedula(String Cdla) {
        // Compruebo primero que si el vector esta vacio o lleno
        if (profesores == null || estudiantes == null) {
            return false;
        }
        //itero en relacion a que ya existe datos y en esas posiciones no sea null
        for (Profesor p : profesores) {
            for (Estudiante e : estudiantes) {

                if (p != null && p.getCedula() != null && p.getCedula().equals(Cdla) || e != null && e.getCedula() != null && e.getCedula().equals(Cdla)) {
                    System.out.println("Cédula ya existente");
                    return true;
                }
            }
        }
        return false;
    }
    public void registrarProfesor(Profesor profesor) {
        if (cantidadProfesores < profesores.length) {
            profesores[cantidadProfesores] = profesor;
            cantidadProfesores++;
            System.out.println("Profesor registrado correctamente.");
        } else {
            System.out.println("No es posible registrar más profesores. Se alcanzó la capacidad máxima.");
        }
    }

    public void imprimirProfesores() {
        System.out.println("Lista de Profesores:");
        for (int i = 0; i < cantidadProfesores; i++) {
            Profesor profesor = profesores[i];
            System.out.println("Cédula: " + profesor.getCedula().toUpperCase());
            System.out.println("Nombre: " + profesor.getNombre1().toUpperCase() + " "
                    + profesor.getNombre2().toUpperCase()
                    + " " + profesor.getApellido1().toUpperCase() + " " + profesor.getApellido2().toUpperCase());
            System.out.println("Fecha de Nacimiento: " + profesor.getFechaNacmto());
            System.out.println("Años de Experiencia: " + profesor.getAñosExper());
            System.out.println("Salario: " + profesor.getSalario());
            System.out.println("Edad "+profesor.getEdad());
            System.out.println("-----------------------------");
        }
    }

    public void imprimirEstudiantes() {
        System.out.println("Lista de Estudiantes:");
        for (int i = 0; i < cantidadEstudiantes; i++) {
            Estudiante estudiante = estudiantes[i];
            System.out.println("Cédula: " + estudiante.getCedula().toUpperCase());
            System.out.println("Nombre: " + estudiante.getNombre1().toUpperCase() + " "
                    + estudiante.getNombre2().toUpperCase()
                    + " " + estudiante.getApellido1().toUpperCase() + " " + estudiante.getApellido2().toUpperCase());
            System.out.println("Fecha de Nacimiento: " + estudiante.getFechaNacmto());
            System.out.println("Dirección " + estudiante.getDireccion());
            System.out.println("Edad: "+estudiante.getEdad());
            System.out.println("-----------------------------");
        }

    }
    public int listaCursos(){
        int contadorCursos=0;
        if (this.getCursos()[0]!=null) {
            System.out.println("-----Lista de Cursos-----");
            for(int i = 0;i<this.getCursos().length;i++){
                if (this.getCursos()[i]!=null) {
                 System.out.println((i+1)+") "+this.getCursos()[i].getNombre());
                 contadorCursos++;
                }
                else{
                    System.out.println((i+1)+")----------");
                }
            }          
            
        }else{
            System.out.println("No existen maestros ingresados");
        }
        return contadorCursos;
    }

    public int listaEstudiantes(){
        int contadorEstudiantes=0;
        if (this.getEstudiantes()[0]!=null) {
            System.out.println("-----Lista de Estudiantes-----");
            for(int i = 0;i<this.getProfesores().length;i++){
                if (this.getEstudiantes()[i]!=null) {
                 System.out.println((i+1)+") "+this.getEstudiantes()[i].getNombre1()+" "+this.getEstudiantes()[i].getApellido1());
                 contadorEstudiantes++;
                }
                else{
                    System.out.println((i+1)+")--------");
                }
            }          
            
        }else{
            System.out.println("No existen estudiantes ingresados");
        }
        return contadorEstudiantes;
    }


    public Profesor eleccionProfesor(){
        int contadorProfesores=0;
        if (this.getProfesores()[0]!=null) {
            System.out.println("-----Lista de Profesores-----");
            for(int i = 0;i<this.getProfesores().length;i++){
                if (this.getProfesores()[i]!=null) {
                 System.out.println((i+1)+") "+this.getProfesores()[i].getNombre1()+" "+this.getProfesores()[i].getApellido1());
                 contadorProfesores++;
                }
                else{
                    System.out.println((i+1)+") Vacante");
                }
            }    
            System.out.print("Escriba el numero del profesor que desea: ");
            int eleccion;
            do {
                eleccion = new Controles().controlValoresEnteros();
            } while (eleccion>contadorProfesores || eleccion==0);      
            Profesor p=this.getProfesores()[eleccion-1];    
            return p;
        }else{
            System.out.println("No existen maestros ingresados");
        }
        return null;
    }

}
