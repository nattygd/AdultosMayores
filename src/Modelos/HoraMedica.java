/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;
/**
 *
 * @author natty
 */
import java.io.*;
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
        ubicacion = entrada.next();
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

        System.out.println("Ingrese ubicacion ejemplo (Casablanca-21):");
        ubicacion = entrada.next(); 
        while (!ubicacion.matches("[a-zA-Z0-9]*\\-+\\d{1,5}")) {
            System.out.println("Tipo de dato incorrecto, ejemplo : (Casablanca-21)");
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
        
        System.out.println("//////////////////////////////////;");
    }
    
    public void crearCsv() throws FileNotFoundException{
        FileWriter fw = null;
        PrintWriter pw = null;

        try{
            fw = new FileWriter("RegistroHorasMedicas.csv", true);
            pw = new PrintWriter(fw);

            //StringBuffer csvHeader=new StringBuffer("");
            StringBuffer csvData=new StringBuffer("");
            //csvHeader.append("Asunto; Medico; Fecha y hora; Ubicacion; Numero contacto\n");

            //pw.write(csvHeader.toString());

            csvData.append(Titulo);
            csvData.append(';');
            if(!Medico.equals("vacio")){
                csvData.append(Medico);
            }
            csvData.append(';');
            csvData.append(FechaHora);
            csvData.append(';');
            csvData.append(Ubicacion);
            csvData.append(';');
            if(NumeroContacto!=0){
                csvData.append(NumeroContacto);
            }
            csvData.append('\n');
            pw.write(csvData.toString());
            pw.flush();
        }catch(IOException e){
            System.out.println("Error");
        }finally{
            pw.close();
        }
    }
    
    public void leerCsv(){
        try{
            BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
            BufferedReader reader=new BufferedReader(new FileReader("RegistroHorasMedicas.csv"));
            
            System.out.println("Ingrese asunto de su hora medica");
            input=in.readLine();
            
            boolean encontrado=false;
            String linea=null;
            
            while((linea=reader.readLine()) !=null){
                String []partes=linea.split(";");
                int totalPartes=partes.length;
                
                for (int i=0; i<totalPartes; i++){
                    if (input.compareTo(partes[i])==0){
                        for (int j=0; j<totalPartes; j++){
                            System.out.print(partes[j]+" ");
                        }
                        System.out.println();
                        encontrado=true;
                        break;
                    }
                }
            }
            
            if (encontrado==false){
                System.out.println("No encontrado");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    /*
    public void crearTxt() {
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter("HorasMedicas.txt", true);
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
    */
    
    void setTutulo(String palabra) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}