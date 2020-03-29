/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;


public class MyMain {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        MyBinarySearchTree b= new MyBinarySearchTree();
        System.out.println("Enter size");
        int size=sc.nextInt();
        for (int i = 0; i <size ; i++) {
            b.insert(sc.nextInt());
        }
        System.out.println("Printing:");
        b.print();
    }





}
