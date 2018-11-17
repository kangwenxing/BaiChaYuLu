package com.company;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Employee>employees = new ArrayList<Employee>();
        Employee employee = new Employee("李玲",25);
        long currentTime = System.currentTimeMillis();
        for (int i=0;i<100000;i++){
            employees.add(employee.clone());
        }
        System.out.println("克隆花费的时间："+(System.currentTimeMillis()-currentTime)+ "毫秒");
        currentTime=System.currentTimeMillis();
        for (int i=0;i<100000;i++){
            ByteArrayOutputStream baos= new ByteArrayOutputStream();
            ObjectOutputStream out = null;
            try {
                out =new ObjectOutputStream(baos);
            } catch (IOException e) {
                e.printStackTrace();
            }finally {

            }
        }
        System.out.println("序列化花费的时间："+(System.currentTimeMillis()-currentTime)+"毫秒");

    }
}
