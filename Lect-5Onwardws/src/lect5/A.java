
package lect5;

import java.util.Scanner;

public class A {

    public void m1() {
        System.out.println("m1 calling");

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        A a = new A();
        a.m1();
        Scanner sc = new Scanner(System.in);
        String test = sc.next();
        int in = sc.nextInt();
        System.out.println(test);
        System.out.println(in);
    }

}
