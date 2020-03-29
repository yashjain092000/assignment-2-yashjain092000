/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.node;

public class Node<E> {

    private E data;

    private Node<E> next;


    private Node(E dataItem) {
        data = dataItem;
        next = null;
    }

    private Node(E dataItem, Node<E> nodeRef) {
        data = dataItem;
        next = nodeRef;
    }
}

