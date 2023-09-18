/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio87.pkg95;

/**
 *
 * @author Alejandro
 */
public class Cuadrado {
    
    int lado;
    
    Cuadrado(int lado){
        
        this.lado=lado;
    }
    
    double calcularArea(){
        
        return Math.pow(lado, 2);
    }
    
    double calcularPerimetro(){
        
        return lado*4;
    }
    
}
