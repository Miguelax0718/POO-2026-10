/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

/**
 *
 * @author migue
 */
public class Student {
    
    private String name;
    private int code;
    private String career;
    private int semester;
    private int age;

    public Student(String name, int code, String career, int semester, int age) {
        this.name = name;
        this.code = code;
        this.career = career;
        this.semester = semester;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public String getCareer() {
        return career;
    }

    public int getSemester() {
        return semester;
    }

    public int getAge() {
        return age;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void callStudent(Student student) {
        System.out.println("Hello " + student.getName());
    }
    
}
