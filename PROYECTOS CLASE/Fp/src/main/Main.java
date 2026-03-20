/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import core.person.Combinatoric;
import core.person.Student;

/**
 *
 * @author migue
 */
public class Main {
    
    public static void main(String[] args) {
        
        Student student1 = new Student("Juan Perez", 200284135, "Ing. Sistemas", 6, 20);
        System.out.println(student1);
        System.out.println(student1.getName());
        System.out.println(student1.getCode());
        System.out.println(student1.getCareer());
        System.out.println(student1.getSemester());
        System.out.println(student1.getAge());
        
        student1.setSemester(7);
        System.out.println(student1.getSemester());
        
        Student student2 = new Student("Luis Lopez", 200191472, "Psicologia", 4, 18);
        student1.callStudent(student2);
        
        Combinatoric comb1 = new Combinatoric(5, 3);
        System.out.println(comb1.getN() + "C" + comb1.getK() + " = " + comb1.compute());
        
        Combinatoric comb2 = new Combinatoric(3, 5);
        System.out.println(comb2.getN() + "C" + comb2.getK() + " = " + comb2.compute());
        
    }
    
}
