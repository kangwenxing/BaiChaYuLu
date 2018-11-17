package com.company;

public class Dya3 {

    public static void main(String[] args) {
	// write your code here
        System.out.println("克隆之前：");
        Address address = new Address("中国","陕西","西安");
        Employee employee1= new Employee("康文星",22,address);
        System.out.println("员工1信息：");
        System.out.println(employee1);
        System.out.println("克隆之后：");
        Employee employee2=employee1.clone();
        employee2.getAddress().setState("中国");
        employee2.getAddress().setProvince("陕西");
        employee2.getAddress().setCity("宁强");
        employee2.setName("李四");
        employee2.setAge(21);
        System.out.println(employee1);
        System.out.println(employee2);
    }
}
