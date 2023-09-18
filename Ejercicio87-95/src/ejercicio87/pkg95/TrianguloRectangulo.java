/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio87.pkg95;

/**
 *
 * @author Alejandro
 */
public class TrianguloRectangulo {
    int base;
    int altura;
    
    
    TrianguloRectangulo(int base,int altura){
        
        this.base=base;
        this.altura=altura;
    }
    
    double calcularArea(){
        
        return base*altura/2;
    }
    
    double calcularPerimetro(){
        
        return base*altura*calcularHipotenusa();
    }
    
    private double calcularHipotenusa(){
        
        return Math.pow(base*base+altura*altura, 0.5);
    }
    
    void determinarTipoTriangulo(){
        
        if(base==altura & base==calcularHipotenusa())
            
            System.out.println("Es un triángulo equilátero");
        
        else if(base!=altura & base!=calcularHipotenusa() & altura!=calcularHipotenusa())
            
            System.out.println("Es un triángulo escaleno");
        
        else 
            
            System.out.println("Es un triángulo isósceles");
    }
}
