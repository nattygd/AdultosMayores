/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;
/**
 *
 * @author natty
 */
import java.util.Scanner;
import java.util.ArrayList;

public class AdultoMayor extends Individuo {
    // atributos
    private int Edad;
    private int NumeroCelular;
    private PersonaACargo Apoderado;
    ArrayList<Medicamento> Medicamentos = new ArrayList<Medicamento>();
    private ArrayList<HoraMedica> HorasMedicas = new ArrayList<HoraMedica>();

    Scanner entrada = new Scanner(System.in);
  
    public AdultoMayor(String Rut, String Nombre, String Direccion, int Edad, int NumeroCelular) {
        super(Rut, Nombre, Direccion);
        this.Edad = Edad;
        this.NumeroCelular = NumeroCelular;
    }

    // accesores
    public int getEdad() {
        return this.Edad;
    }

    public int getNumeroCelular() {
        return this.NumeroCelular;
    }

    // mutadores
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setNumeroCelular(int NumeroCelular) {
        this.NumeroCelular = NumeroCelular;
    }
    
    // comportamientos
    public void imprimirDatos() {
        System.out.println("Rut del adulto mayor: " + getRut());
        System.out.println("Nombre del adulto mayor: " + getNombre());
        System.out.println("Edad del adulto mayor: " + Edad);
        System.out.println("Direccion adulto mayor: " + getDireccion());
        System.out.println("Numero de celular del adulto mayor: " + NumeroCelular);
        System.out.println("//////////////////////////////////;");
    }

  
    public void agregarMedicamentos() {
        System.out.println("Nuevo Medicamento");
        Medicamento Medicamentos1 = new Medicamento();
        Medicamentos1.CrearMedicamentos();
        Medicamentos.add(Medicamentos1);
    }

    public void eliminarMedicamento(String Eliminar) { // Eliminar por nombre 
        for (int j = 0; j < Medicamentos.size(); j++) {
            if (Medicamentos.get(j).getNombre().equals(Eliminar)) {
                Medicamentos.remove(j);
                System.out.println("Eliminado con exito");
                System.out.println("//////////////////////////////////;");
                return;
            }
        }
        System.out.print("No existe ese medicamento");    
    }
    
    public void eliminarMedicamento(int posicion) { //Eliminar por posicicon 
        if(posicion>Medicamentos.size()){
            System.out.print("No existe ese medicamento");
        }else{
            Medicamentos.remove(posicion);
            System.out.println("Eliminado con exito");
            System.out.println("//////////////////////////////////;");
        }
    }
  
    public void imprimirMedicamentos() {
        System.out.println("//////////////////////////////////;"); //////////////////

        for (int i = 0; i < Medicamentos.size(); i++) {
            System.out.println("N° Medicamento : " + i);
            System.out.println("Nombre : " + Medicamentos.get(i).getNombre());
            System.out.println("Concentracion : " + Medicamentos.get(i).getConcentracion());
            System.out.println("Frecuencia : " + Medicamentos.get(i).getFrecuencia());
            System.out.println("Dosis : " + Medicamentos.get(i).getDosis());

            System.out.println("//////////////////////////////////;"); //////////////////
        }
    }

    public void agregarApoderado(String Rut, String Nombre, String Direccion, String Parentesco, int NumeroCelular) {
        Apoderado = new PersonaACargo(Rut, Nombre, Direccion, Parentesco, NumeroCelular);
    }

    public void imprimirAdultoACargo() {
        Apoderado.imprimir();
    }

    public void agregarHoraMedica() {
        String opcion;
    
        System.out.println("Nuevo Hora Medica");
        System.out.println("ingrese 1 si quiere agregar Hora Medica completa");
        System.out.println("ingrese 2 si quiere agregar asunto, fecha y hora de la cita medica"); 
        opcion = entrada.next();
        
        while (!opcion.matches("[12]")) {
            System.out.println("Tipo de datos incorrectos, solo 1 y 2");
            System.out.println("Ingrese opcion valida:");
            opcion = entrada.next();
        }
    
        HoraMedica NuevaHora = new HoraMedica();
        
        if(opcion.equals("1")){ 
            NuevaHora.CrearHoraMedica();  
        }else if (opcion.equals("2")){
            NuevaHora.CrearHoraMedica(opcion);
        }
        
        HorasMedicas.add(NuevaHora); 
    } 

    public void ListarHoras(){
        for(int k=0;k< HorasMedicas.size(); k++){
            HorasMedicas.get(k).ListarHoras1();
            HorasMedicas.get(k).crearTxt();
        }
    }
}