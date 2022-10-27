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
    private ArrayList<PersonaACargo> Apoderado = new ArrayList<>();
    ArrayList<Medicamento> Medicamentos = new ArrayList<>();
    private final ArrayList<HoraMedica> HorasMedicas = new ArrayList<>();

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
    public void buscarMedicamento(String Buscar) { // Buscar por nombre 
        for (int j = 0; j < Medicamentos.size(); j++) {
            if (Medicamentos.get(j).getNombre().equals(Buscar)) {
                System.out.println("//////////////////////////////////;"); //////////////////
                
                System.out.println("N° Medicamento : " + j);
                System.out.println("Nombre : " + Medicamentos.get(j).getNombre());
                System.out.println("Concentracion : " + Medicamentos.get(j).getConcentracion());
                System.out.println("Frecuencia : " + Medicamentos.get(j).getFrecuencia());
                System.out.println("Dosis : " + Medicamentos.get(j).getDosis());
                
                System.out.println("//////////////////////////////////;"); //////////////////
            return;
            }
        }
        System.out.print("No existe ese medicamento");    
    }

    public void agregarApoderado(String Rut, String Nombre, String Direccion, String Parentesco, int NumeroCelular) {
        Apoderado.add(new PersonaACargo(Rut, Nombre, Direccion, Parentesco, NumeroCelular));
    }

    public void imprimirAdultoACargo() {  
        for(int l=0;l< Apoderado.size(); l++){
        Apoderado.get(l).imprimir();
      }
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
    
    public void ModificarDato(){
        String opcion;
        String palabra;

        System.out.println("Ingrese 1 para modificar dato del adulto mayor");
        System.out.println("Ingrese 2 para modificar dato de una hora medica");
        System.out.println("Ingrese 3 para modificar dato ded las persona a cargo");
        opcion = entrada.next();
        while (!opcion.matches("[1234]")) {
            System.out.println("Tipo de datos incorrectos, solo 1 , 2 y 3 ");
            System.out.println("Ingrese opcion valida:");
            opcion = entrada.next();
        }
        switch (opcion) {
            case "1":
                System.out.println("Ingrese 1 si quieres cambiar el rut");
                System.out.println("Ingrese 2 si quieres cambiar el nombre");
                System.out.println("Ingrese 3 si quieres cambiar la direccion ");
                System.out.println("Ingrese 4 si quieres edad");
                System.out.println("Ingrese 5 si quieres numero celular");

                opcion = entrada.next();
                while (!opcion.matches("[12345]")) {
                    System.out.println("Tipo de datos incorrectos, solo 1 , 2 , 3 , 4 y 5");
                    System.out.println("Ingrese opcion valida:");
                    opcion = entrada.next();
                }
                switch(opcion){
                    case "1":
                        System.out.println("Ingrese rut sin puntos ni guion:");
                        palabra = entrada.next();
                        while (!palabra.matches("[0-9]*")) {
                            System.out.println("Tipo de dato incorrecto, solo numeros");
                            System.out.println("Ingrese rut valido:");
                            palabra = entrada.next();
                        }  
                        setRut(palabra);
                        break;
                    case "2":
                        System.out.println("Ingrese nombre:");
                        palabra = entrada.next(); 
                        while (!palabra.matches("[a-zA-Z]*")) {
                            System.out.println("Tipo de dato incorrecto, solo letras");
                            System.out.println("Ingrese nombre valido:");
                            palabra = entrada.next(); 
                        }
                        setNombre(palabra);
                        break;
                    case "3":
                        System.out.println("Ingrese Direccion:");
                        palabra = entrada.next();
                        while (!palabra.matches("[a-zA-Z]*")) {
                            System.out.println("Tipo de dato incorrecto, solo letras");
                            System.out.println("Ingrese direccion valida:");
                            palabra = entrada.next();
                        }
                        break;
                    case "4":
                        System.out.println("Ingrese edad:");
                        palabra = entrada.next();
                        while (!palabra.matches("[0-9]*")) {
                            System.out.println("Tipo de dato incorrecto, solo numeros");
                            System.out.println("Ingrese edad valida:");
                            palabra = entrada.next();
                        }
                        setEdad(Integer.parseInt(palabra));
                        break;
                    case "5":
                        System.out.println("Ingrese numero de contacto:");
                        palabra = entrada.next();
                        while (!palabra.matches("[0-9]*")) {
                            System.out.println("Tipo de dato incorrecto, solo numeros");
                            System.out.println("Ingrese numero de contacto valido:");
                            palabra = entrada.next();
                        }
                        setNumeroCelular(Integer.parseInt(palabra));
                        break;
                    default:

                        break;
                }

                break;
            case "2":
                for(int k=0;k< HorasMedicas.size(); k++){
                System.out.println("¿Desea modificar" + HorasMedicas.get(k).getTitulo()+ "?");
                opcion = entrada.next();
                while (!opcion.matches("[Si No]")) {
                System.out.println("Tipo de datos incorrectos, solo Si y No ");
                System.out.println("Ingrese opcion valida:");
                opcion = entrada.next();
                }
                if(opcion.equals("Si")){
                    System.out.println("¿Que desea modificar?");
                    System.out.println("Ingrese 1 si quieres cambiar el asunto");
                    System.out.println("Ingrese 2 si quieres cambiar el nombre del medico");
                    System.out.println("Ingrese 3 si quieres cambiar la fecha ");
                    System.out.println("Ingrese 4 si quieres cambiar la ubicacion");
                    System.out.println("Ingrese 5 si quieres numero de contacto");
                    opcion = entrada.next();
                    while (!opcion.matches("[12345]")) {
                        System.out.println("Tipo de datos incorrectos, solo 1 , 2 , 3 , 4 y 5");
                        System.out.println("Ingrese opcion valida:");
                        opcion = entrada.next();
                    }

                    switch(opcion){
                    case "1":
                        System.out.println("Ingrese asunto nuevo:");
                        palabra = entrada.next();
                        while (!palabra.matches("[a-zA-Z]*")) {
                            System.out.println("Tipo de dato incorrecto, solo letras");
                            System.out.println("Ingrese asunto valido:");
                            palabra = entrada.next();
                        }  
                        HorasMedicas.get(k).setTutulo(palabra);
                        break;
                    case "2":
                        System.out.println("Ingrese nombre del medico:");
                        palabra = entrada.next(); 
                        while (!palabra.matches("[a-zA-Z]*")) {
                            System.out.println("Tipo de dato incorrecto, solo letras");
                            System.out.println("Ingrese nombre valido:");
                            palabra = entrada.next(); 
                        }
                        HorasMedicas.get(k).setMedico(palabra);
                        break;
                    case "3":
                        System.out.println("Ingrese fecha:");
                        palabra = entrada.next();
                        while (!palabra.matches("[0-9]*")) {
                            System.out.println("Tipo de dato incorrecto, solo numeros");
                            System.out.println("Ingrese fecha valida:");
                            palabra = entrada.next(); 
                        }
                        HorasMedicas.get(k).setFechaHora(Integer.parseInt(palabra));
                        break;
                    case "4":
                        System.out.println("Ingrese ubicacion:");
                        palabra = entrada.next(); 
                        while (!palabra.matches("[a-zA-Z]*")) {
                            System.out.println("Tipo de dato incorrecto, solo letras");
                            System.out.println("Ingrese ubicacion valida:");
                            palabra = entrada.next(); 
                        }
                        HorasMedicas.get(k).setUbicacion(palabra);
                        break;
                    case "5":
                        System.out.println("Ingrese numero de contacto:");
                        palabra = entrada.next();
                        while (!palabra.matches("[0-9]*")) {
                            System.out.println("Tipo de dato incorrecto, solo numeros");
                            System.out.println("Ingrese numero de contacto valido:");
                            palabra = entrada.next();
                        }
                        HorasMedicas.get(k).setNumeroContacto(Integer.parseInt(palabra));
                        break;
                    default:

                        break;
                    }
                }
            }        
                break;
            case "3":
                for(int k=0;k<Apoderado.size(); k++){
                System.out.println("¿Desea modificar" + Apoderado.get(k).getNombre()+ "?");
                opcion = entrada.next();
                while (!opcion.matches("[Si No]")) {
                System.out.println("Tipo de datos incorrectos, solo Si y No ");
                System.out.println("Ingrese opcion valida:");
                opcion = entrada.next();
                }
                if(opcion.equals("Si")){
                    System.out.println("Ingrese 1 si quieres cambiar el rut");
                    System.out.println("Ingrese 2 si quieres cambiar el nombre");
                    System.out.println("Ingrese 3 si quieres cambiar la direccion ");
                    System.out.println("Ingrese 4 si quieres parentesco");
                    System.out.println("Ingrese 5 si quieres numero celular");
                    opcion = entrada.next();
                    while (!opcion.matches("[12345]")) {
                        System.out.println("Tipo de datos incorrectos, solo 1 , 2 , 3 , 4 y 5");
                        System.out.println("Ingrese opcion valida:");
                        opcion = entrada.next();
                    }
                    switch(opcion){
                        case "1":
                            System.out.println("Ingrese rut sin puntos ni guion:");
                            palabra = entrada.next();
                            while (!palabra.matches("[0-9]*")) {
                                System.out.println("Tipo de dato incorrecto, solo numeros");
                                System.out.println("Ingrese rut valido:");
                                palabra = entrada.next();
                            }  
                            Apoderado.get(k).setRut(palabra);
                            break;
                        case "2":
                            System.out.println("Ingrese nombre:");
                            palabra = entrada.next(); 
                            while (!palabra.matches("[a-zA-Z]*")) {
                                System.out.println("Tipo de dato incorrecto, solo letras");
                                System.out.println("Ingrese nombre valido:");
                                palabra = entrada.next(); 
                            }
                            Apoderado.get(k).setNombre(palabra);
                            break;
                        case "3":
                            System.out.println("Ingrese Direccion:");
                            palabra = entrada.next();
                            while (!palabra.matches("[a-zA-Z]*")) {
                                System.out.println("Tipo de dato incorrecto, solo letras");
                                System.out.println("Ingrese direccion valida:");
                                palabra = entrada.next();
                            }
                            Apoderado.get(k).setDireccion(palabra);
                            break;
                        case "4":
                            System.out.println("Ingrese parentesco:");
                            palabra = entrada.next();
                            while (!palabra.matches("[a-zA-Z]*")) {
                                System.out.println("Tipo de dato incorrecto, solo letras");
                                System.out.println("Ingrese direccion valida:");
                                palabra = entrada.next();
                            }
                            Apoderado.get(k).setParentesco(palabra);
                            break;
                        case "5":
                            System.out.println("Ingrese numero de contacto:");
                            palabra = entrada.next();
                            while (!palabra.matches("[0-9]*")) {
                                System.out.println("Tipo de dato incorrecto, solo numeros");
                                System.out.println("Ingrese numero de contacto valido:");
                                palabra = entrada.next();
                            }
                            Apoderado.get(k).setNumeroCelular(Integer.parseInt(palabra));
                            break;
                        default:


                            break;
                    }
                }  
            }


                break;
            default:

                break;
        }
    }
}