package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Book book =new Book("Java编译思想","康文星",19);
        System.out.println("书名："+book.getTitle());
        System.out.println("作者："+book.getAuthor());
        System.out.println("价格："+book.getPrice());
    }
}
