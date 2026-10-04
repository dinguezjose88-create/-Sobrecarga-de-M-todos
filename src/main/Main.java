
package main;


public class Main {

    public static void main(String[] args) {
        
        calculadora calc = new calculadora();
        
        
        System.out.println(calc.sumar(5,3));
        System.out.println(calc.restar(10,4));
        System.out.println(calc.multiplicar(6,7));
        System.out.println(calc.dividir(20,4));
        
        
        System.out.println(calc.sumar(5,3,2));
        System.out.println(calc.restar(10,4,2));
        System.out.println(calc.multiplicar(2,3,4));
        
        System.out.println(calc.sumar(1,2,3,4));
        System.out.println(calc.restar(20,5,3,2));
        System.out.println(calc.multiplicar(2,2,2,2));
    }
    
}
