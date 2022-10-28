/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;
/**
 *
 * @author natty
 */
public abstract class Individuo{
    private String Rut;
    private String Nombre;
    private String Direccion;
  

    Individuo(String Rut, String Nombre , String Direccion  ){
        this.Rut=Rut;
        this.Nombre=Nombre;
        this.Direccion=Direccion;
    }
  
    public String getRut(){
        return this.Rut;
    }
    public String getNombre(){
        return this.Nombre;
    }
    public String getDireccion(){
        return this.Direccion;
    }

    public void setRut(String Rut){
        this.Rut=Rut;
    }
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }
    public void setDireccion(String Direccion){
        this.Direccion=Direccion;
    }
    
    public void Llamar(){
        System.out.printf("Llamando ... ");
    }
}