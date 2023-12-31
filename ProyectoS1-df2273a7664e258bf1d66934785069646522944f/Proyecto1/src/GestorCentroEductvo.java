/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Arrays;
import java.util.Comparator;

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
        // itero en relacion a que ya existe datos y en esas posiciones no sea null
        for (Profesor p : profesores) {
            for (Estudiante e : estudiantes) {
                if (p != null && p.getCedula() != null && p.getCedula().equals(Cdla)
                        || e != null && e.getCedula() != null && e.getCedula().equals(Cdla)) {
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
        System.out.println("Lista de Profesores");
            for (int i = 0; i < cantidadProfesores; i++){
                Profesor profesor = profesores[i];
                System.out.println(profesor.toString());
                System.out.println("Cursos en los que esta inscrito: ");
                for(Curso curso : profesor.getCursos()){
                    if (curso != null) {
                            System.out.println("--" + curso.getNombre());
                        }else{
                            break;
                        }
                }
            System.out.println(" ___________________________________\n");
        }
    }
        public void imprimirEstudiantes() {
    for (int i = 0; i < cantidadEstudiantes; i++) {
                    Estudiante estudiante = estudiantes[i];
                    System.out.println(estudiante.toString());
                    System.out.print("Cursos en los que está inscrito: ");
                    for (Curso curso : estudiante.getCursos()) {
                        if (curso != null) {
                            System.out.println("--" + curso.getNombre());
                        }else{
                            System.out.println("Aún no tiene cursos asignados");
                            break;
                        }
                    }
           System.out.println(" ____________________________________\n");
        }
    }

    public boolean idRepetido(int id) {
        boolean repet = false;
        for (int i = 0; i < this.getCursos().length; i++) {
            if (this.getCursos()[i] != null) {
                if (this.getCursos()[i].getId() == id) {
                    repet = true;
                    System.out.println("Identificador del curso existente pruebe otro mas");
                    break;
                }
            }
        }
        return repet;
    }

    public void guardarCurso(Curso curso) {
        if (this.comprobarCupoCursoProfesor(curso.getProfesor())) {
            for (int i = 0; i < cursos.length; i++) {
            if (this.getCursos()[i] == null) {
                this.getCursos()[i] = curso;
                this.registroCursoProfesor(curso);
                break;
            }
        }
            if (curso != null) {
                System.out.println("El curso ha guardado con éxito \n ");
            }    
        }
    }


    //GUARDAR LA INFORMACION DEL CURSO EN LOS DATOS DE ESTUDIANTE Y DOCENTE-------------------------------------------------------
    private void registroCursoProfesor(Curso curso) {
            for (int i = 0; i < profesores.length; i++) {
            if (this.getProfesores()[i] != null) {
                if (this.getProfesores()[i].getCedula().equals(curso.getProfesor().getCedula())) {
                    this.getProfesores()[i].setCursos(curso);
                }
            }
        } 
    }

    private void registroCursoEstudiante(Curso curso, String cedula) {
        for (int i = 0; i < estudiantes.length; i++) {
            if (this.getEstudiantes()[i] != null) {
                if (this.getEstudiantes()[i].getCedula().equals(cedula)) {
                    this.getEstudiantes()[i].setCursos(curso);
                }
            }
        }
    }
    //-----------------------------------------------------------------------------------------------------------------------------



    public void estudiantesInscritos(int posicion) {
        System.out.println("\n------" + this.getCursos()[posicion].getNombre() + "----------");
        System.out.println("Profesor Asignado: " + this.getCursos()[posicion].getProfesor().getNombre1());
        for (int i = 0; i < this.getCursos()[posicion].getEstudiantes().length; i++) {
            if (this.getCursos()[posicion].getEstudiantes()[i] != null) {
                System.out.println((i + 1) + ")" + this.getCursos()[posicion].getEstudiantes()[i].getNombre1() + " "
                        + this.getCursos()[posicion].getEstudiantes()[i].getApellido1());
            }
        }
        System.out.println(" ");
    }



    public boolean existenciaEstudiantes(int posicionC, int posicionE) {
        boolean verif = true;
        int comprobador = 0;
        String cedula;
        if (this.getEstudiantes()[posicionE] != null) {
            cedula = this.getEstudiantes()[posicionE].getCedula();
            for (int j = 0; j < this.getCursos()[posicionC].getEstudiantes().length; j++) {
                if (this.getCursos()[posicionC].getEstudiantes()[j] != null) {
                    System.out.println(this.getCursos()[posicionC].getEstudiantes()[j].getCedula());
                    if (this.getCursos()[posicionC].getEstudiantes()[j].getCedula().equals(cedula)) {
                        System.out.println("El estudiante está ya registrado en curso");
                        comprobador++;
                        break;
                    }
                }
            }
        } else {
            System.out.println("Posicion nula");
            verif = false;
        }

        if (comprobador == 0) {
            verif = false;
        }
        return verif;
    }

    public void inscripcionCurso(Estudiante estudiante, Curso curso,int posicion) {
        for (int i = 0; i < this.getCursos().length; i++) {
            if (this.getCursos()[i] != null) {
                if (this.getCursos()[i].getId() == curso.getId()) {
                    for (int j = 0; j < this.getCursos()[i].getEstudiantes().length; j++) {
                        if (this.getCursos()[i].getEstudiantes()[j] == null) {
                            this.getCursos()[i].getEstudiantes()[j] = estudiante;
                            this.registroCursoEstudiante(curso, this.getEstudiantes()[posicion].getCedula());
                            break;
                        }
                    }
                }
            }
        }
    }

    //METODOS PARA COMPROBAR EL CUPO QUE TIENE UN CURSO Y EL DE ESTUDIANTE----------------------------------------------------------
    public Curso comprobarCuposCurso(int posicion) {
            if (this.getCursos()[posicion].cupo(this.getCursos()[posicion].getId())==5) {
                System.out.println("El Curso de"+this.getCursos()[posicion].getNombre()+"está lleno");
                return null;
            }
            else{
            return this.getCursos()[posicion];
            }
    }

    public Estudiante comprobarCupoCursoEstudiante(int posicion) {
        if (this.getEstudiantes()[posicion].cupo()==0) {
            System.out.println("El Estudiante ha alcanzado el maximo de cursos inscrito");
            return null;
        }else{
            return this.getEstudiantes()[posicion];
        }
    }

    public boolean comprobarCupoCursoProfesor(Profesor prof){
        if (prof.cursosAsignados()==5) {
            System.out.println("El profesor ha alcazado el limite de cursos asignados");
            return false;
        }
        else{
            return true;
        }
    }

    
    //METODOS QUE IMPRIMEN UN LISTADO DE LOS CURSOS Y ESTUDIANTES, DEVUELVEN EL NUMERO DE CURSOS Y ESTUDIANTES REGISTRADOS------------
    public int listaCursos() {
        int contadorCursos = 0;
        if (this.getCursos()[0] != null) {
            System.out.println("-----Lista de Cursos-----");
            for (int i = 0; i < this.getCursos().length; i++) {
                if (this.getCursos()[i] != null) {
                    System.out.println((i + 1) + ") " + this.getCursos()[i].getNombre());
                    contadorCursos++;
                } else {
                    System.out.println((i + 1) + ")----------");
                }
            }

        } else {
            System.out.println("No existen cursos ingresados");
        }
        return contadorCursos;
    }

    public int listaEstudiantes() {
        int contadorEstudiantes = 0;
        if (this.getEstudiantes()[0] != null) {
            System.out.println("-----Lista de Estudiantes-----");
            for (int i = 0; i < this.getProfesores().length; i++) {
                if (this.getEstudiantes()[i] != null) {
                    System.out.println((i + 1) + ") " + this.getEstudiantes()[i].getNombre1() + " "
                            + this.getEstudiantes()[i].getApellido1());
                    contadorEstudiantes++;
                } else {
                    System.out.println((i + 1) + ")--------");
                }
            }

        } else {
            System.out.println("No existen estudiantes ingresados");
        }
        return contadorEstudiantes;
    }
    public int listaProfesores(){  
        int contadorProfesores = 0;
        System.out.println("-----Lista de Profesores-----");
        for (int i = 0; i < this.getProfesores().length; i++) {
            if (this.getProfesores()[i] != null) {
            System.out.println((i + 1) + ") " + this.getProfesores()[i].getNombre1() + " "
                + this.getProfesores()[i].getApellido1());
                contadorProfesores++;
            } else {
                    System.out.println((i + 1) + ") Vacante");
            }
        }
        return contadorProfesores;
    }
    //---------------------------------------------------------------------------------------------------------------------------
    public Profesor eleccionProfesor() {
        Profesor p = null;      
        int eleccion,cantProfesores=this.listaProfesores();
        if (this.getProfesores()[0] != null) {
            do {
                eleccion = new Controles().ControlNumrs("Escriba el numero del profesor que desea asignar el curso: ");
            } while (eleccion > cantProfesores || eleccion == 0);
            p = this.getProfesores()[eleccion - 1];        
        } else {
            System.out.println("No existen maestros ingresados");
        }
        return p;
    }

    
    public void ordenarEstdCurso() {
        Arrays.sort(this.getCursos(), Comparator.nullsLast(Curso::compareTo));
        for (Curso c : this.getCursos()) {
            if (c != null) {
                System.out.println(c.toString());
            }
        }
    }

}
