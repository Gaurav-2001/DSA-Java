package com.PracticeJava;

public class Prg08 {
    public static void main(String[] args) {
        EmpForm tom = new EmpForm();
        tom.hello();
        tom.findtech();
        tom.incentive();


    }
    static class VisitorForm {
        String name;
        int phone;
        void hello(){
            System.out.println("This is a parent class");
        }
    }
    static class JobForm extends VisitorForm {
        int exp;
        String tech;
        void findtech(){
            System.out.println("this is a child class");
        }
    }
    static class EmpForm extends JobForm {
        int enpId;
        int sal;
        void incentive(){
            System.out.println("100% hike");
        }
    }

}
