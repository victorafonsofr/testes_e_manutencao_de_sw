/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dependecyinjection;

/**
 *
 * @author afonsvfdeb
 */
public class Calculadora {
   private Integer numero;
   
    public Calculadora(){
        
    }
    public Calculadora(Integer numero) {
        this.numero = numero;
    }
   
   public boolean ehPositivo( Integer numero1){
       if(numero1>-1)
            return true;
       else
          return false;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
}
