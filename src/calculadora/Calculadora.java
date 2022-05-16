/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author carme
 */
public class Calculadora {
    private double numero1;
    private double numero2;
    private String marca;
   private String modelo;
     
    
    // Métodos de la clase
    // Constructor por defecto
    
    public Calculadora (double numero1, double numero2, String marca, String modelo ){
        this.numero1=numero1;
        this.numero2=numero2;
        this.marca=marca;
        this.modelo=modelo;
        
    }
     // Constructor sobrecargado
    public Calculadora(String marca, String modelo ){
        this.marca=marca;
        this.modelo=modelo;
    }
    // Constructor sobrecargado
    public Calculadora(){
        
    }
// GETTERS & SETTERS

    public double getNum1 (){
        return this.numero1;
    }
     public double getNum2 (){
        return this.numero2;
    }        
     public String getMarca (){
        return this.marca;
    }
    public String getModelo (){
        return this.modelo;
    }
    
    public void setNum1 ( double num1){
        this.numero1=num1;
    }
    public void setNum2 ( double num2){
        this.numero2=num2;
    }
    public void setMarca ( String marca){
        this.marca=marca;
    }
    public void setModelo( String modelo){
        this.modelo=modelo;
    }
    
    // Métodos de funciones de la clase
    
    public double suma () {
        return (this.numero1 + this.numero2);
    }
    public double resta () {
        return (this.numero1 - this.numero2);
    }
    public double multiplicacion () {
        return (this.numero1 * this.numero2);
    }
    public double division () {
       return (this.numero1 / this.numero2);
    }

}