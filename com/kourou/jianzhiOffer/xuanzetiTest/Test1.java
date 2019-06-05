package com.kourou.jianzhiOffer.xuanzetiTest;

class Person {
    String name = "No name";
    public Person(String nm) {
        name = nm;
    }
}
class Employee extends Person {
    String empID = "0000";
    public Employee(String id) {
        super("nm");//父类没有无参构造，所以子类必须添加super关键字
        empID = id;
    }
}
public class Test1{
    public static void main(String args[]) {
        Employee e = new Employee("123");
        System.out.println(e.empID);
    }
}
