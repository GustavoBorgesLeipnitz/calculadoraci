/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 10723112133
 */
public class Calculadora {
    private double valorA;
    private double valorB;
    
    public Calculadora(){
        this(0,0);
    }
    public Calculadora(double valorA, double valorB){
        this.valorA = valorA;
        this.valorB = valorB;
    }

    public double getValorA() {
        return valorA;
    }

    public void setValorA(double valorA) {
        this.valorA = valorA;
    }

    public double getValorB() {
        return valorB;
    }

    public void setValorB(double valorB) {
        this.valorB = valorB;
    }
    
    public double getSoma(){
        return valorA + valorB;
    }
    
    public double getDiferenca(){
        return valorA - valorB;
    }
    
    public double getProduto(){
        return valorA * valorB;
    }
    
    public double getQuociente(){
        return valorA/valorB;
    }
    
    
    
    
    
}
