package time1;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your name?");
        String name = in.nextLine();
        System.out.println("how old are you?");
        int age = in.nextInt();
        System.out.println("你的名字是"+name+age+"岁");

    }
}
