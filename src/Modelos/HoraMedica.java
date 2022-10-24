/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;
/**
 *
 * @author natty
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class HoraMedica {
    // atributos
    private String Titulo;
    private String Medico;
    private int FechaHora;
    private String Ubicacion;
    private int NumeroContacto;
    Scanner entrada = new Scanner(System.in);
    String input;
    
    public HoraMedica(){   
    }

    public HoraMedica(String Titulo, String Medico, int FechaHora, String Ubicacion, int NumeroContacto) {
        this.Titulo = Titulo;
        this.Medico = Medico;
        this.FechaHora = FechaHora;
        this.Ubicacion = Ubicacion;
        this.NumeroContacto = NumeroContacto;
    }

    // accesores
    public String getTitulo() {
        return this.Titulo;
    }

    public String getMedico() {
        return this.Medico;
    }

    public int getFechaHora() {
        return this.FechaHora;
    }

    public String getUbicacion() {
        return this.Ubicacion;
    }

    public int getNumeroContacto() {
        return this.NumeroContacto;
    }

    // mutadores
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setMedico(String Medico) {
        this.Medico = Medico;
    }

    public void setFechaHora(int FechaHora) {
        this.FechaHora = FechaHora;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public void setNumeroContacto(int NumeroContacto) {
        this.NumeroContacto = NumeroContacto;
    }

    // comportamientos
    
    public void CrearHoraMedica() {
        String titulo, nombreMedico, ubicacion;

        System.out.println("Ingrese asunto consulta:");
        titulo = entrada.next();
        while (!titulo.matches("[a-zA-Z]*")) {
            System.out.println("Tipo de datos incorrectos, solo letras:");
            System.out.println("Ingrese asunto consulta valida:");

            titulo = entrada.next();
        }
        this.Titulo = (titulo);

        System.out.println("Ingrese nombre del medico a cargo:");
        nombreMedico = entrada.next();
        while (!nombreMedico.matches("[a-zA-Z]*")) {
            System.out.println("Tipo de datos incorrectos, solo letras:");
            System.out.println("Ingrese nombre del medico valido:");
            nombreMedico = entrada.next();
        }
        this.Medico = (nombreMedico);

        System.out.println("Ingrese fecha y hora:");
        input = entrada.next();
        while (!input.matches("[0-9]*")) {
            System.out.println("Tipo de datos incorrectos, solo numeros:");
            System.out.println("Ingrese fecha y hora valida:");
            input = entrada.next();
        }
        this.FechaHora = Integer.parseInt(input);

        System.out.println("Ingrese ubicacion (edificio):");
        ubicacion = entrada.next(); // nextLine deveria serviir para los espacios (no se hacerlo) voy a probar
        while (!ubicacion.matches("[a-zA-Z]*")) {
            System.out.println("Tipo de datos incorrectos, solo letras:");
            System.out.println("Ingrese ubicacion valida:");
            ubicacion = entrada.next();
        }
        this.Ubicacion = (ubicacion);

        System.out.println("Ingrese numero de contacto:");
        input = entrada.next();
        while (!input.matches("[0-9]*")) {
            System.out.println("Tipo de datos incorrectos, solo numeros:");
            System.out.println("Ingrese fecha y hora valida:");
            input = entrada.next();
        }
        this.NumeroContacto = (Integer.parseInt(input));
        System.out.println("//////////////////////////////////;");
    }


    public void CrearHoraMedica(String opcion) {
        String titulo, ubicacion;

        System.out.println("Ingrese asunto consulta:");
        titulo = entrada.next();
        while (!titulo.matches("[a-zA-Z]*")) {
            System.out.println("Tipo de datos incorrectos, solo letras:");
            System.out.println("Ingrese asunto consulta valida:");
            titulo = entrada.next();
        }
        this.Titulo = (titulo);

        System.out.println("Ingrese fecha y hora:");
        input = entrada.next();
        while (!input.matches("[0-9]*")) {
            System.out.println("Tipo de datos incorrectos, solo numeros:");
            System.out.println("Ingrese fecha y hora valida:");
            input = entrada.next();
        }
        this.FechaHora = Integer.parseInt(input);

        System.out.println("Ingrese ubicacion (edificio):");
        ubicacion = entrada.next(); // nextLine deveria serviir para los espacios (no se hacerlo) voy a probar
        while (!ubicacion.matches("[a-zA-Z]*")) {
            System.out.println("Tipo de datos incorrectos, solo letras:");
            System.out.println("Ingrese ubicacion valida:");
            ubicacion = entrada.next();
        }
        
        this.Ubicacion = (ubicacion);
        this.Medico="vacio";
        this.NumeroContacto=0;
    }


    public void ListarHoras1() {
        System.out.println("Horas Medicas:");

        System.out.println("Asunto: " + Titulo);
        if(!Medico.equals("vacio")){
            System.out.println("Nombre del medico: " + Medico);
        }
        System.out.println("Fecha-Hora: " + FechaHora);
        System.out.println("Ubicacion: " + Ubicacion);
        if(NumeroContacto!=0){
            System.out.println("Numero de contacto: " + NumeroContacto);
        }
    }
  
    public void crearTxt() {
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter("C:/Users/natty/Documents/NetBeansProjects/AdultosMayores/src/main/java/com/mycompany/adultosmayores/prueba1.txt", true);
            pw = new PrintWriter(fw);
            pw.println("Asunto: " + Titulo);
            if(!Medico.equals("vacio")){
                pw.println("Nombre del medico: " + Medico); 
            }
            pw.println("Fecha-Hora: " + FechaHora);
            pw.println("Ubicacion: " + Ubicacion);
            if(NumeroContacto!=0){
                pw.println("Numero de contacto: " + NumeroContacto);
            }
            pw.println();

            pw.flush();
        }catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            pw.close();
        }

        System.out.println("***Se ha creado un txt con los horarios de las citas medicas***");
    }
}