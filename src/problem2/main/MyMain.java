/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size ");
        int size = sc.nextInt();
        MyBinarySearchTree b=new MyBinarySearchTree();
        for (int i = 0; i <size ; i++) {
            b.insert(sc.nextInt());

        }
        System.out.println("Pre Order Print:----");
        b.print();
        System.out.println("\nPost Order Print:----");
        b.printPostorder();
    }


}
