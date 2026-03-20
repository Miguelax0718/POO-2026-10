/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import core.person.Student;

/**
 *
 * @author migue
 */
public class Main {
    
    public static void main(String[] args) {
        
        Student estudiante = new Student("Juan", "Perez", "sistemas", 5);
        Student estudiante2 = new Student("Juan", "alvarado", "sistemas", 3);
        Student estudiante3 = estudiante;
        System.out.println(estudiante.getNombre());
        System.out.println(estudiante2.getNombre());
        System.out.println(estudiante3.getNombre());
        
        estudiante.setNombre("cesar");
        
        System.out.println(estudiante.getNombre());
        System.out.println(estudiante2.getNombre());
        System.out.println(estudiante3.getNombre());
        
    }
    
}
